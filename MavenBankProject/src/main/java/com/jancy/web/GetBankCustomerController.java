package com.jancy.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jancy.web.dao.CustomerDao;
import com.jancy.web.model.Customer;

public class GetBankCustomerController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		int customerid=Integer.parseInt(request.getParameter("customerId"));
		CustomerDao cdao=new CustomerDao();
		Customer c=cdao.getCustomer(customerid);
	    request.setAttribute("customer",c);
 		RequestDispatcher rd=request.getRequestDispatcher("showCustomer.jsp");
 		rd.forward(request, response);
 		

 		
	}

}
