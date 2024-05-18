package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import classes.Dao;
import classes.Dto;


public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public Register() {
        super();
    }


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		response.setContentType("text/html");
		
		String name=request.getParameter("name");
		String mobile=request.getParameter("mob");
		String mail=request.getParameter("mail");
		String usern=request.getParameter("usern");
		String pass=request.getParameter("pass");
		
		Dto dt=new Dto(name,mobile,mail,usern,pass);
		
		Dao da=new Dao();
		boolean b=da.getDao(dt);
		if (b) {
			pw.println("<h1>Registration Successful</h1>");
		} else {
			pw.println("<h1>Something went wrong</h1>");
		}
		
//		pw.println(name);
//		pw.println(mobile);
//		pw.println(mail);
//		pw.println(usern);
//		pw.println(pass);
//	
	}

}
