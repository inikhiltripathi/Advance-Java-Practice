package newpack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class newServlet
 */
public class newServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public newServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
	
		ServletConfig servletConfig = this.getServletConfig();
	    //ServletContext servletContext = servletConfig.getServletContext();
	    ServletContext servletContext2 = this.getServletContext();
	    out.println(servletConfig);
	    //out.print(servletContext);
	    out.println(servletContext2);
	    servletContext2.setAttribute("username","hathi");
	    String dr = servletContext2.getInitParameter("driver");
	    String u = servletContext2.getInitParameter("url");
	    String n = servletContext2.getInitParameter("username");
	    String p = servletContext2.getInitParameter("password");
	    
	    out.println(dr);
	    out.println(u);
	    out.println(n);
	    out.println(p);
	}

	

}
