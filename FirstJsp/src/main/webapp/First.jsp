<%@page import="classes.ConnectionPro"%>
<%@page import="java.sql.Connection"%>
<%@page import= "java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%!
String a;
%>

<%
String name=request.getParameter("username");
String pass=request.getParameter("password");

Connection c=ConnectionPro.getConnection();

String q="select * from user where username='"+name+"' and password="+pass;

try{
PreparedStatement ps=c.prepareStatement(q);
ResultSet rs = ps.executeQuery();
if(rs.next()){
	a="Login Successfull";
}else{
	a="No any User Found";
}
}
catch (Exception e){
	out.print(e);
}


%>

<h3>hello <%= name +"  "+ pass %></h3>
<h3><%=a %></h3>

</body>
</html>