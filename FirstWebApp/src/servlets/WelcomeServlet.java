package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String name= request.getParameter("name");
		String lname = request.getParameter("lname");
		PrintWriter writer= response.getWriter();
		
		writer.append("<html>");
			
			writer.write("<h3>Welcome to Java Web App,");
			writer.write(name + " " + lname + "</h3>");
		
		
		writer.append("</html>");
		writer.flush();
		
		
		
	}
	



	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
