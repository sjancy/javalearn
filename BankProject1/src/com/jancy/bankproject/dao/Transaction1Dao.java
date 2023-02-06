package com.jancy.bankproject.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jancy.bankproject.Transaction1;

public class Transaction1Dao {

	public void createtransaction(Transaction1 transaction1) {
		Connection con=null;
		Statement stmt=null;
		
		try {
		con=DataBaseUtils.getConnection();
		
		String inserttransaction="insert into transaction1 values("+transaction1.getTransactionId()+", "+transaction1.getAccountId()+", '"+transaction1.getTransactionType()+"', "+transaction1.getTransactionAmount()+")";
		System.out.println("execute InserttransactionQuery"+ inserttransaction);
		stmt = con.createStatement();
		stmt.execute(inserttransaction);

		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
	}
	
	public Transaction1 gettransaction(Integer transactionId) {
		Connection con=null;
		Statement stmt=null;
		Transaction1 transaction1 =null;
		
		try {
		con=DataBaseUtils.getConnection();
		stmt = con.createStatement();
		
		String gettransaction="select transaction_id,account_id,transaction_type,transaction_amount from transaction1 WHERE TRANSACTION_ID="+transactionId;
		System.out.println("execute gettranscation:" +gettransaction);
		ResultSet rs=stmt.executeQuery(gettransaction);
		transaction1 =new Transaction1();
		 if(rs.next()) {
			 
				Integer accountId=rs.getInt("ACCOUNT_ID");
				String transactionType=rs.getString("TRANSACTION_TYPE");
				Double transactionAmount=rs.getDouble("TRANSACTION_AMOUNT");
				
				transaction1.setAccountId(accountId);
				transaction1.setTransactionId(transactionId);
				transaction1.setTransactionType(transactionType);
				transaction1.setTransactionAmount(transactionAmount);
		 }

		 }catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DataBaseUtils.closeStatement(stmt);
				DataBaseUtils.closeConnection(con);
			}
		
		return transaction1;
		}
	
	public void updatetransaction(Transaction1 transaction1) {
		Connection con=null;
		Statement stmt=null;
		try {
		con=DataBaseUtils.getConnection();
		stmt = con.createStatement();
		
		String upadtetransactionquery="update transaction1 set account_id='"+transaction1.getAccountId()+"', transaction_type='"+transaction1.getTransactionType()+"',transaction_amount='"+transaction1.getTransactionAmount()+"' where TRANSACTION_ID="+transaction1.getTransactionId();
		
		System.out.println("execute upadtequery:" +upadtetransactionquery);
		stmt.execute(upadtetransactionquery);
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
	}
	
	public void deletetransaction(Integer transactionId) {
		Connection con=null;
		Statement stmt=null;
		try {
		con=DataBaseUtils.getConnection();
		stmt = con.createStatement();
		String deletetransactionquery="delete from transaction1 WHERE TRANSACTION_ID=" + transactionId;
		
		System.out.println("execute upadtequery:" +deletetransactionquery);
		stmt.execute(deletetransactionquery);
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
	}
	
	public Integer getNewTransactionId() {
		Connection con=null;
		Statement stmt=null;
		try {
		con=DataBaseUtils.getConnection();
		

		String getNewCustIdQuery = "select max(TRANSACTION_ID)+1 as TRANSACTION_ID from transaction1";
		System.out.println("New Transaction ID Query: " + getNewCustIdQuery);
		stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(getNewCustIdQuery);

		while (rs.next()) {
			int cid = rs.getInt("TRANSACTION_ID");
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
	

