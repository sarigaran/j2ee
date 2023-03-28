package demo.serv;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ckcreate extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public ckcreate() {
        super();
       }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
	 	PrintWriter pw=response.getWriter();
	 	String s1=request.getParameter("name");
	 	String s2=request.getParameter("mnumber");
	 	String s3=request.getParameter("email");
	 	String s4=request.getParameter("qualification");
	 	String[] lan=request.getParameterValues("lang");
	 	String s5="";
	 	  for(String i : lan) {
	 	        s5=s5+i+" ";
	 	    }
	 	pw.println("NAME : "+s1);
	 	pw.println("<br>");
	 	pw.println("Mobile Number : "+s2);
		pw.println("<br>");
	 	pw.println("E mail : "+s3);
		pw.println("<br>");
	 	pw.println("Qualification : "+s4);
	 	pw.println("<br>");
	 	pw.println("language known : "+s5);	 
	 	pw.println("<br>");
	 	pw.print("<br><a href=\'Register.html'><button type='button'>BACK</button></a>");
	 	
	 	    pw.print("Host = " + request.getServerName());
	 	    pw.print("Port = " + request.getServerPort());
	 	
	}

}
