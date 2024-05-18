<%@page import="classes.ConnectionPro"%>
<%@page import="classes.Dto"%>
<%@page import="java.sql.Connection"%>
<%@page import= "java.sql.PreparedStatement" %>
<%@page import="java.sql.ResultSet" %>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="dto" class="classes.Dto"></jsp:useBean> 
<jsp:setProperty property="*" name="dto"/>

<%
String a=dto.getName(); 
%>

<h3>Hello - <%= a %></h3>

</body>
</html>