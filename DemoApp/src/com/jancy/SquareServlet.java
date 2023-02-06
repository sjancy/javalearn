package com.jancy;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/square")
public class SquareServlet extends HttpServlet{
	
	 public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		 
		 int value=0;
		 
		 Cookie cookies[]=req.getCookies();
		 
		 for(Cookie c: cookies) {
			 if(c.getName().equals("k")) 
				 value=Integer.parseInt(c.getValue());
		 }
		 
		/*		 HttpSession session=req.getSession();
				 int value=(int) session.getAttribute("k");
				 
				// int value=Integer.parseInt(req.getParameter("k"));
				 * 		*/	
				 
				 value=value*value;
	 
		 PrintWriter out=res.getWriter();
		 out.println("The result of the Square" +value);
		 System.out.println("square called");
	 }

}
