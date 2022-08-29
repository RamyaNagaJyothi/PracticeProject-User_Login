package com.validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Dashboard")
public class DashboardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("Welcome to the Dashboard.");
		out.println("This is an e-commerce Web application.");
		out.println("<br>");
		out.println("<form action=logOut>");
		out.println("<input type = submit value = LogOut>"); 
		out.println("</form>");
		out.println("</body>");
		out.println("</html>");

	
		
		
		
	}

}
