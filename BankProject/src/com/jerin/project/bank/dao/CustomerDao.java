package com.jerin.project.bank.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;

import com.jerin.project.bank.model.Customer;

public class CustomerDao {
	
	public void createCustomer(Customer customer)  {
		Connection con= null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			String insertCustomerQuery = "insert into customer values ("+customer.getCustomerId()+", '"+customer.getCustomerName()+"', '"+customer.getCustomerAddress()+"', '"+customer.getCity()+"', NOW(), 'SYSTEM', null, null)";
			System.out.println("Insert Customer Query: "+insertCustomerQuery);
			stmt = con.createStatement();
			stmt.execute(insertCustomerQuery);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}
	
	public Customer getCustomer(Integer customerId) {
		Customer customer = null;
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();

			String selectCustomerQuery = "select customer_id,customer_name,address,city, created_date, created_by, updated_date, updated_by from customer WHERE CUSTOMER_ID="+customerId;
			System.out.println("Get Customer Query: "+selectCustomerQuery);
			ResultSet rs = stmt.executeQuery(selectCustomerQuery);
			customer = new Customer();
			
			if(rs.next()) {
	
				// int custId=rs.getInt("CUSTOMER_ID");
				String customerName=rs.getString("CUSTOMER_NAME");
				String customerAddress=rs.getString("ADDRESS");
				String city=rs.getString("CITY");
				Date createdDate = rs.getDate("CREATED_DATE");
				String createdBy = rs.getString("CREATED_BY");
				Date updatedDate = rs.getDate("UPDATED_DATE");
				String updatedBy = rs.getString("UPDATED_BY");
	
				customer.setCustomerId(customerId);
				customer.setCustomerName(customerName);
				customer.setCustomerAddress(customerAddress);
				customer.setCity(city);
				customer.setCreatedDate(createdDate);
				customer.setCreatedBy(createdBy);
				customer.setUpdatedDate(updatedDate);
				customer.setUpdatedBy(updatedBy);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
		
		return customer;
	}

	public void updateCustomer(Customer customer) {
		
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();
			
			String updateCustomerQuery = "update customer set customer_name='"+customer.getCustomerName()+"',address='"+customer.getCustomerAddress()+"',city='"+customer.getCity()+"',updated_date=NOW(), updated_by='SYSTEM' WHERE CUSTOMER_ID="+customer.getCustomerId();
			System.out.println("Update Customer Query: "+updateCustomerQuery);
			stmt.execute(updateCustomerQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}

	public void deleteCustomer(Integer customerId) {

		Connection con = null;
		Statement stmt = null;
		try {
			con = DBUtils.getConnection();
			stmt = con.createStatement();

			String deleteCustomerQuery = "delete from customer WHERE CUSTOMER_ID=" + customerId;
			System.out.println("Delete Customer Query: " + deleteCustomerQuery);
			stmt.execute(deleteCustomerQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBUtils.closeStatement(stmt);
			DBUtils.closeConnection(con);
		}
	}
	
	public Integer getNewCustomerId() {
		Connection con = null;
		Statement stmt= null;
		try {
			con = DBUtils.getConnection();
			stmt=con.createStatement();

			String getNewCustIdQuery = "select max(CUSTOMER_ID)+1 as CUSTOMER_ID from customer";
			System.out.println("New Customer ID Query: " + getNewCustIdQuery);
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(getNewCustIdQuery);

			while (rs.next()) {
				int cid = rs.getInt("CUSTOMER_ID");
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
