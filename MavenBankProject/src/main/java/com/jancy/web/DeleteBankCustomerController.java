package com.jancy.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jancy.web.dao.CustomerDao;
import com.jancy.web.model.Customer;

public class DeleteBankCustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("DeleteBankCustomerController::doGet called");
		
		int customerid=Integer.parseInt(request.getParameter("customerId"));
		System.out.println("DeleteBankCustomerController::doGet customerid: "+customerid);
		CustomerDao dao=new CustomerDao();
		
		dao.deleteCustomer(customerid);

 		RequestDispatcher rd=request.getRequestDispatcher("deleteCustomerDetails.jsp");
 		rd.forward(request, response);

	}

}
