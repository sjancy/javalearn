package com.jancy.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jancy.web.dao.CustomerDao;
import com.jancy.web.model.Customer;

public class UpdateBankCustomerController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int customerid=Integer.parseInt(request.getParameter("customerId"));
		String customername=request.getParameter("customerName");
		String customeraddress=request.getParameter("customerAddress");
		String customercity=request.getParameter("customerCity");
		int customerphoneno=Integer.parseInt(request.getParameter("customerPhoneNo"));

	
		CustomerDao dao=new CustomerDao();
		Customer c=new Customer();
		c.setCustomerId(customerid);
		c.setCustomerName(customername);
		c.setCustomerAddress(customeraddress);
		c.setCity(customercity);
		c.setPhone_no(customerphoneno);
		
		dao.viewCustomer(c);
	
		request.setAttribute("addcust", c);
 		RequestDispatcher rd1=request.getRequestDispatcher("viewCustomerDetailsjsp.jsp");
 		rd1.forward(request, response);

		}

}
