package com.jancy.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.jancy.web.dao.Customer1Dao;
import com.jancy.web.model.Customer1;


public class GetcustomerConroller extends HttpServlet {
	
 	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

 		int customerid=Integer.parseInt(request.getParameter("customer_Id"));

 		Customer1Dao dao=new Customer1Dao();
 		Customer1 c1=dao.getcustomer1(customerid);
 		
 		
 		HttpSession session=request.getSession();
 		session.setAttribute("customer", c1);
 		
 		response.sendRedirect("showCustomer.jsp");
 		
 		
		/* 		request.setAttribute("customer",c1);
		 		RequestDispatcher rd=request.getRequestDispatcher("showCustomer.jsp");
		 		rd.forward(request, response);
		*/ 		
		}


}
