package com.jancy.bankproject.dao;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.jancy.bankproject.Customer1;


public class Customer1Dao {
	
	public void createcustomer(Customer1 customer1) {
		Connection con=null;
		Statement stmt=null;
		
		try {
		con=DataBaseUtils.getConnection();
		String insertcustomerquery="insert into customer1 values("+customer1.getCustomerId()+", '"+customer1.getCustomername()+"', '"+customer1.getAddress()+"', '"+customer1.getCity()+"' ,"+customer1.getPhoneno()+")";	
		System.out.println("Customer Query inserted:" +insertcustomerquery);
		stmt=con.createStatement();
		stmt.execute(insertcustomerquery);
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
	}
	
	
	public Customer1 getcustomer(Integer customerId) {
		Connection con=null;
		Statement stmt=null;
		
		Customer1 customer=new Customer1();
		
		try {
			con=DataBaseUtils.getConnection();
			stmt=con.createStatement();
			String getcustomerquery="select customer_Id,customer_name,address,city,phone_no from Customer1 where customer_Id=" +customerId;
			System.out.println("cusomer query selected:" +getcustomerquery);
			ResultSet rs=stmt.executeQuery(getcustomerquery);
			
			if(rs.next()) {
				String customername=rs.getString("CUSTOMER_NAME");
			    String address=rs.getString("ADDRESS");
			    String city=rs.getString("CITY");
			    int phoneno=rs.getInt("PHONE_NO");
			    
			    customer.setCustomerId(customerId);
			    customer.setCustomername(customername);
			    customer.setAddress(address);
			    customer.setCity(city);
			    customer.setPhoneno(phoneno);
			}
			
			}catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DataBaseUtils.closeStatement(stmt);
				DataBaseUtils.closeConnection(con);
			}
			
			return customer;
	}
	
	
	public void updatecustomer(Customer1 customer1) {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DataBaseUtils.getConnection();
			stmt=con.createStatement();
			
			String customerupdatequery="update Customer1 set customer_name='"+customer1.getCustomername()+"', address='"+customer1.getAddress()+"', city='"+customer1.getCity()+"', "
					+ "phone_no="+customer1.getPhoneno()+" where customer_Id="+customer1.getCustomerId(); 
			System.out.println("execute customerupdatequery:" +customerupdatequery);
			stmt.execute(customerupdatequery);
		}catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DataBaseUtils.closeStatement(stmt);
			DataBaseUtils.closeConnection(con);
		}
		
	}
	
	

	
	public void deletecustomer(Integer customerId) {
			Connection con=null;
			Statement stmt=null;
			try {
				con=DataBaseUtils.getConnection();
				stmt=con.createStatement();
				
				String customerdeletequery="delete from customer1 where CUSTOMER_ID=" +customerId;
				System.out.println("execute customerdeletequery:" +customerdeletequery);
				stmt.execute(customerdeletequery);
			}catch (SQLException e) {
				e.printStackTrace();
			} finally {
				DataBaseUtils.closeStatement(stmt);
				DataBaseUtils.closeConnection(con);
			}
			
	}
	
	
	public Integer getNewCustomerId() {
		Connection con=null;
		Statement stmt=null;
		try {
			con=DataBaseUtils.getConnection();
			stmt=con.createStatement();
			
			String getNewCustomerIdquery="select max(CUSTOMER_ID)+1 as CUSTOMER_ID from customer1";
			System.out.println("execute getNewCustomerId:" +getNewCustomerIdquery);
			ResultSet rs=stmt.executeQuery(getNewCustomerIdquery);
			
			if(rs.next()) {
				int cid = rs.getInt("CUSTOMER_ID");
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
