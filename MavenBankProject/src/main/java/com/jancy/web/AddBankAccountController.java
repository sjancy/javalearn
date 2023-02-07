package com.jancy.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.jancy.web.dao.AccountDao;
import com.jancy.web.model.Account;

public class AddBankAccountController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int accountid=Integer.parseInt(request.getParameter("account_Id"));
		int customerid=Integer.parseInt(request.getParameter("customer_Id"));
		double accountbalance=Double.parseDouble(request.getParameter("account_balance"));
		
		AccountDao dao=new AccountDao();
		Account a=new Account();
		
		a.setAccountId(accountid);
		a.setCustomerId(customerid);
		a.setAccountBalance(accountbalance);
		
		dao.addAccount(a);
		
 		RequestDispatcher rd1=request.getRequestDispatcher("addAccountDetails.jsp");
 		rd1.forward(request, response);

	}

}
