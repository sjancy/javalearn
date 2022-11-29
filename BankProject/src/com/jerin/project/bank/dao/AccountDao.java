package com.jerin.project.bank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.jerin.project.bank.model.Account;

public class AccountDao {
	
	public void createAccount(Account account)  {
		Connection con= null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			String insertAccountQuery = "insert into account values ("+account.getAccountId()+", "+account.getCustomerId()+", "+account.getAccountBalance()+", NOW(), 'SYSTEM', null, null)";
			System.out.println("Insert Account Query: "+insertAccountQuery);
			stmt = con.createStatement();
			stmt.execute(insertAccountQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}
	
	public Account getAccount(Integer accountId) {
		Account account = null;
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();

			String selectAccountQuery = "select account_id,customer_id, account_balance, created_date, created_by, updated_date, updated_by from account WHERE ACCOUNT_ID="+accountId;
			System.out.println("Get Account Query: "+selectAccountQuery);
			ResultSet rs = stmt.executeQuery(selectAccountQuery);
			account = new Account();
			
			if(rs.next()) {
				// int acctId=rs.getInt("ACCOUNT_ID");
				Integer customerId=rs.getInt("CUSTOMER_ID");
				Double accountBalance=rs.getDouble("ACCOUNT_BALANCE");
				Date createdDate = rs.getDate("CREATED_DATE");
				String createdBy = rs.getString("CREATED_BY");
				Date updatedDate = rs.getDate("UPDATED_DATE");
				String updatedBy = rs.getString("UPDATED_BY");
	
				account.setAccountId(accountId);
				account.setCustomerId(customerId);
				account.setAccountBalance(accountBalance);
				account.setCreatedDate(createdDate);
				account.setCreatedBy(createdBy);
				account.setUpdatedDate(updatedDate);
				account.setUpdatedBy(updatedBy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
		
		return account;
	}

	public void updateAccount(Account account) {
		
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();
			
			String updateAccountQuery = "update account set account_balance="+account.getAccountBalance()+",updated_date=NOW(), updated_by='SYSTEM' WHERE ACCOUNT_ID="+account.getAccountId();
			System.out.println("Update Account Query: "+updateAccountQuery);
			stmt.execute(updateAccountQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}

	public void deleteAccount(Integer accountId) {

		Connection con = null;
		Statement stmt = null;
		try {
			con = DBUtils.getConnection();
			stmt = con.createStatement();

			String deleteAccountQuery = "delete from account WHERE ACCOUNT_ID=" + accountId;
			System.out.println("Delete Account Query: " + deleteAccountQuery);
			stmt.execute(deleteAccountQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}
	
	public Integer getNewAccountId() {
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();

			String getNewAcctIdQuery = "select max(ACCOUNT_ID)+1 as ACCOUNT_ID from account";
			System.out.println("New Account ID Query: " + getNewAcctIdQuery);
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(getNewAcctIdQuery);

			while (rs.next()) {
				int cid = rs.getInt("ACCOUNT_ID");
				return cid;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}

		return 0;
	}

}
