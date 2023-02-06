package com.jancy.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jancy.web.dao.CustomerDao;
import com.jancy.web.model.Customer;

public class AddBankCustomerController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int customerid=Integer.parseInt(request.getParameter("customer_Id"));
		String customername=request.getParameter("customerName");
		String customeraddress=request.getParameter("customerAddress");
		String customercity=request.getParameter("customerCity");
		int customerphoneno=Integer.parseInt(request.getParameter("customerPhoneNo"));
		//int createddate=Integer.parseInt(request.getParameter("CreatedDate"));
		//int createdby=Integer.parseInt(request.getParameter("CreatedBy"));
		CustomerDao cdao=new CustomerDao();
 		Customer c1=new Customer();
 		c1.setCustomerId(customerid);
 		c1.setCustomerName(customername);
 		c1.setCustomerAddress(customeraddress);
 		c1.setCity(customercity);
 		c1.setPhone_no(customerphoneno);
 		cdao.addCustomer(c1);
 		

 		request.setAttribute("addcust", c1);
 		RequestDispatcher rd1=request.getRequestDispatcher("addCustomerDetails.jsp");
 		rd1.forward(request, response);

		
	}


}
