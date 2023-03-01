package com.demo;

import jakarta.servlet.ServletException;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import jakarta.servlet.*;
/**
 * Servlet implementation class ckCreate
 */
public class ckCreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ckCreate() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
	/*	// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	*/
		 response.setContentType("text/html");
		String name=request.getParameter("name");
		String loc=request.getParameter("loc");
		
		PrintWriter pw=response.getWriter();
		Cookie ck= new Cookie("user",name);
		response.addCookie(ck);
		ck.setMaxAge(1800);
		pw.write("user name = "+name);
		pw.write("cookie created @ "+loc);
		pw.println("<html><body>");
		pw.println("<h1><a href='ckDisplay'>click here to show the session</a>\"</h1>");
		pw.println("</body></html>");
		}

}
