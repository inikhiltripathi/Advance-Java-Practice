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
 * Servlet implementation class second
 */
public class second extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public second() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out=response.getWriter();
		
		ServletConfig servletConfig = this.getServletConfig();
	    ServletContext servletContext = servletConfig.getServletContext();
	    ServletContext servletContext2 = this.getServletContext();
	    out.println(servletConfig);
	    out.println(servletContext);
	    out.println(servletContext2);
	    String attribute = (String) servletContext2.getAttribute("username");
	    out.print(attribute);
	}

}
