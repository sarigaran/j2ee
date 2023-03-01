package com.demo;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ckDisplay
 */
public class ckDisplay extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ckDisplay() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		/*// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	*/
		 response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		Cookie[] ckie=request.getCookies();
		for(Cookie i:ckie) {
			pw.print(i.getName()+" "+i.getValue());
		}
		
	pw.close();
	}

}
