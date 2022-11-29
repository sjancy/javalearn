package com.jerin.project.bank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.jerin.project.bank.model.Transaction;

public class TransactionDao {
	
	public void createTransaction(Transaction transaction)  {
		Connection con= null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			String insertTransactionQuery = "insert into transaction values ("+transaction.getTransactionId()+", "+transaction.getAccountId()+", '"+transaction.getTransactionType()+"', '"+transaction.getTransactionAmount()+"', NOW(), NOW(), 'SYSTEM', null, null)";
			System.out.println("Insert Transaction Query: "+insertTransactionQuery);
			stmt = con.createStatement();
			stmt.execute(insertTransactionQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}
	
	public Transaction getTransaction(Integer transactionId) {
		Transaction transaction = null;
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();

			String selectTransactionQuery = "select transaction_id,account_id,transaction_type,transaction_amount, transaction_time, created_date, created_by, updated_date, updated_by from transaction WHERE TRANSACTION_ID="+transactionId;
			System.out.println("Get Transaction Query: "+selectTransactionQuery);
			ResultSet rs = stmt.executeQuery(selectTransactionQuery);
			transaction = new Transaction();
			
			if(rs.next()) {
	
				// int custId=rs.getInt("TRANSACTION_ID");
				Integer accountId=rs.getInt("ACCOUNT_ID");
				String transactionType=rs.getString("TRANSACTION_TYPE");
				Double transactionAmount=rs.getDouble("TRANSACTION_AMOUNT");
				Date transactionTime=rs.getDate("TRANSACTION_TIME");
				Date createdDate = rs.getDate("CREATED_DATE");
				String createdBy = rs.getString("CREATED_BY");
				Date updatedDate = rs.getDate("UPDATED_DATE");
				String updatedBy = rs.getString("UPDATED_BY");
	
				transaction.setTransactionId(transactionId);
				transaction.setAccountId(accountId);
				transaction.setTransactionType(transactionType);
				transaction.setTransactionAmount(transactionAmount);
				transaction.setTransactionTime(transactionTime);
				transaction.setCreatedDate(createdDate);
				transaction.setCreatedBy(createdBy);
				transaction.setUpdatedDate(updatedDate);
				transaction.setUpdatedBy(updatedBy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
		
		return transaction;
	}

	public void updateTransaction(Transaction transaction) {
		
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();
			
			String updateTransactionQuery = "update transaction set account_id='"+transaction.getAccountId()+"',transaction_type='"+transaction.getTransactionType()+"',transaction_amount='"+transaction.getTransactionAmount()+"',updated_date=NOW(), updated_by='SYSTEM' WHERE TRANSACTION_ID="+transaction.getTransactionId();
			System.out.println("Update Transaction Query: "+updateTransactionQuery);
			stmt.execute(updateTransactionQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}

	public void deleteTransaction(Integer transactionId) {

		Connection con = null;
		Statement stmt = null;
		try {
			con = DBUtils.getConnection();
			stmt = con.createStatement();

			String deleteTransactionQuery = "delete from transaction WHERE TRANSACTION_ID=" + transactionId;
			System.out.println("Delete Transaction Query: " + deleteTransactionQuery);
			stmt.execute(deleteTransactionQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}
	
	public Integer getNewTransactionId() {
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();

			String getNewCustIdQuery = "select max(TRANSACTION_ID)+1 as TRANSACTION_ID from transaction";
			System.out.println("New Transaction ID Query: " + getNewCustIdQuery);
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(getNewCustIdQuery);

			while (rs.next()) {
				int cid = rs.getInt("TRANSACTION_ID");
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
