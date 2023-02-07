package com.jancy.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import com.jancy.web.model.Account;

public class AccountDao {
	
	public Account addAccount(Account account) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jancy1","root","jerin");
			Statement st=con.createStatement();
			String insertAccountQuery = "insert into account values ("+account.getAccountId()+", "+account.getCustomerId()+", "+account.getAccountBalance()+", NOW(), 'SYSTEM', null, null)";
			System.out.println("Insert Account Query: "+insertAccountQuery);
			st = con.createStatement();
			st.execute(insertAccountQuery);
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return account;
	}

}
