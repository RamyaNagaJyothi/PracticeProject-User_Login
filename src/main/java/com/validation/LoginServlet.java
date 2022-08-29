package com.validation;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String uname = request.getParameter("username");
		String pass = request.getParameter("password");
		if(uname.equals("simplilearn") && pass.equals("simplilearn")) {
			response.sendRedirect("Dashboard");
			
		}else {
			out.println("You have entered wrong credentials. So please enter correct username and password to login.");
			out.println("<html>");
			out.println("<body>");
			out.println("<br>");
			out.println("If you want to again login. Click on the button below");
			out.println("<form action=index.html>");
			out.println("<input type = submit value = Login>"); 
			out.println("</form>");
			out.println("</body>");
			out.println("</html>");
		}
	}

	
}
