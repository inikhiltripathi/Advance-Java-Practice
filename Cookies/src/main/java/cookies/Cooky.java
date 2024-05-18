package cookies;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Cooky extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Cooky() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	   PrintWriter out=response.getWriter();
	   
	   String name =request.getParameter("username");
	   String pass =request.getParameter("password");
	   
	   Cookie cname=new Cookie("name", name);
	   Cookie cpass=new Cookie("pass", pass);
	   
	   response.addCookie(cname);
	   response.addCookie(cpass);
	   
	   out.println(name);
	   out.println(pass);
	   
	   response.setContentType("text/html");
	   
	   out.println("<a href='Cooky3'>Next</a>");
	   
	  
	   
	   /*
	   out.println("<html><head></head><body>");
	   out.println("<form action='Cooky2' method='post'>");
	   out.println("");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	   out.println("pass");
	*/
	
	}

}
