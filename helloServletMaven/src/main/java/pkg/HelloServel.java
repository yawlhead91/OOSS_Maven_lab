package pkg;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.joda.time.DateTime;

/**
 * Servlet implementation class HelloServel
 */
@WebServlet("/hello")
public class HelloServel extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServel() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		java.util.Date juDate = new Date();
		DateTime dt = new DateTime();
		int day = dt.getDayOfMonth();
		int maxDay = dt.dayOfMonth().getMaximumValue();
		int left = maxDay - day;
		
		
		response.setContentType("text/html");
		StringBuffer buf = new StringBuffer();
		buf.append("<HTML><HEAD><TITLE>\n");
		buf.append("Hello Servlet\n");
		buf.append("</TITLE></HEAD><BODY>\n");
		buf.append("<H1>Welcome to OOSSP!</H1>\n");
		buf.append("<H2>Day of the month: </H2>"+day+"\n");
		buf.append("<H2>Days left in the month: </H2>"+left+"\n");
		buf.append("<H3>Alex Kirwan </H3>\n");
		buf.append("<H3>Student Number: R00132481 </H3>\n");
		buf.append("</BODY></HTML>");
		
		
				
		response.getWriter().println(buf.toString());
		response.getWriter().close();
	}

}
