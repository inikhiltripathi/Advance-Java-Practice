package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.ConnectionPro;
import classes.Dto;


public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Login() {
        super();
       
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw = response.getWriter();
		response.setContentType("text/html");
		
		String uname=request.getParameter("username");
		String pass=request.getParameter("password");
		
		Dto d=new Dto();
		d.setUname(uname);
		d.setPass(pass);
		
		Connection c=ConnectionPro.getConnection();
		
		String q="select * from user where username='"+uname+"' and password="+pass;
		
		try {
			PreparedStatement ps=c.prepareStatement(q);
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				pw.println("<h1>Login Successful</h1>");
				pw.println("Name : "+rs.getString(1));
				pw.println("Mobile No : "+rs.getString(2));
				pw.println("E-mail : "+rs.getString(3));
			} else {
				pw.println("<h1>not found<h1>");

			}
			
		} catch (SQLException e) {
			System.out.println(e);
			e.printStackTrace();
		}
		
	}

}
