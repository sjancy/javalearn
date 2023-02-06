package com.jancy.bankproject.dao;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jancy.bankproject.Account1;

public class Account1Dao {
	
	public void createaccount(Account1 account1) {
		
		Connection con=null;
		Statement stmt=null;
		try {
			con=DataBaseUtils.getConnection();
			String insertaccountquery="insert into account1 values("+account1.getAccountId()+", "+account1.getCustomerId()+", "+account1.getAccountBalance()+")";
			System.out.println("execute :" +insertaccountquery);
			stmt = con.createStatement();
			stmt.execute(insertaccountquery);
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
	}
	
	
	public Account1 getaccount(Integer accountId) {
		Account1 account1=null;
		Connection con=null;
		Statement stmt=null;
		try {
			con=DataBaseUtils.getConnection();
			
			String getaccountquery="select account_id,customer_id, account_balance from account1 where account_Id=" +accountId; 
			System.out.println("execute getaccountquery:" +getaccountquery);
			stmt = con.createStatement();
			ResultSet rs=stmt.executeQuery(getaccountquery);
			
			account1=new Account1();
			
			if(rs.next()) {
				Integer customerId=rs.getInt("CUSTOMER_ID");
				Double accountBalance=rs.getDouble("ACCOUNT_BALANCE");
				
				account1.setAccountId(accountId);
				account1.setCustomerId(customerId);
				account1.setAccountBalance(accountBalance);
			}

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
		return account1;
		
	}
	
	
	public void updateaccount(Account1 account1) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DataBaseUtils.getConnection();
			
			String updateaccountquery="update Account1 set account_balance="+account1.getAccountBalance()+" where ACCOUNT_ID="+account1.getAccountId();
			System.out.println("execute updateaccountquery:" +updateaccountquery);
			stmt = con.createStatement();
			stmt.execute(updateaccountquery);
			
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
		
	}
	
	public void deleteaccount(Integer accountId) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DataBaseUtils.getConnection();
			String deleteaccountquery="delete from Account1 WHERE ACCOUNT_ID=" + accountId;
			System.out.println("execute deleteQuery:" +deleteaccountquery);
			stmt = con.createStatement();
			stmt.execute(deleteaccountquery);
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
		
		
	}
	
	
	public Integer getNewAccountId() {
		Connection con = null;
		Statement stmt= null;
		try {
			con = DataBaseUtils.getConnection();
			stmt=con.createStatement();
			
			String getNewAcctIdQuery = "select max(ACCOUNT_ID)+1 as ACCOUNT_ID from account1"; 
			System.out.println("New Account ID Query: " + getNewAcctIdQuery);
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(getNewAcctIdQuery);

			while (rs.next()) {
				int cid = rs.getInt("ACCOUNT_ID");
				return cid;
			}

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
		

return 0;
		
	}
	
	

}
