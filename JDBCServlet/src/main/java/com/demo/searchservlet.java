package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class searchservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public searchservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	String q=request.getParameter("p");	
	String b=request.getParameter("btn");	
	if (b.equals("Bing")) {
		response.sendRedirect("https://www.bing.com/search?q="+q);	
	}
	else if(b.equals("Google")) {
		response.sendRedirect("https://www.google.com/search?q="+q);
	}
	else {
       response.sendError(404,"serevr not found");
	
	}

}
	}
