package servlet.req;
import java.io.*;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public servlet1() {
        super();
    }
		protected void doGet(HttpServletRequest request, HttpServletResponse response) 
				throws ServletException, IOException {

		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
	String user=request.getParameter("email");
	String pass=request.getParameter("password");
	PrintWriter pw=response.getWriter();
	pw.print("process the request for "+user);
	if(pass.equals("pass")) {
		RequestDispatcher rd=request.getRequestDispatcher("servlet2");
		rd.forward(request, response);
		
	}
	else {
		RequestDispatcher rd=request.getRequestDispatcher("login.html");
		rd.include(request, response);
		pw.print("invalid user");
	}
	}

}
