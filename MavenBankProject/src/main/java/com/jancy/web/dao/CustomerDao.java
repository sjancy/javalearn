package com.jancy.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.jancy.web.model.Customer;

public class CustomerDao {
	public Customer getCustomer(int customerId)
	{
	
	Customer c=new Customer();
	
	try {
		
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jancy1","root","jerin");
		Statement st=con.createStatement();
	ResultSet rs=st.executeQuery("select * from customer where customer_id=" +customerId);

		if(rs.next()) {
			c.setCustomerId(rs.getInt("customer_id"));
		    c.setCustomerName(rs.getString("customer_name"));
		    c.setCustomerAddress(rs.getString("address"));
			c.setCity(rs.getString("city"));
			c.setPhone_no(rs.getInt("phone_no"));
			c.setCreatedDate(rs.getDate("created_date"));
			c.setCreatedBy(rs.getString("created_by"));
			c.setUpdatedDate(rs.getDate("updated_date"));
			c.setUpdatedBy(rs.getString("updated_by"));
		}

	}
	catch(Exception e) {
		e.printStackTrace();
		System.out.println(e);
	}
	return c;
}

	
	public Customer addCustomer(Customer customer) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jancy1","root","jerin");
			Statement st=con.createStatement();
			st.execute("insert into customer values("+customer.getCustomerId()+",'"+customer.getCustomerName()+"','"+customer.getCustomerAddress()+"','"+customer.getCity()+"',"+customer.getPhone_no()+",NOW(), 'SYSTEM', null, null)");

	}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		return customer;

	}
	
	
	public Customer viewCustomer(Customer customer) {
		

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jancy1","root","jerin");
			Statement st=con.createStatement();

			String updatequery="update customer set customer_name='"+customer.getCustomerName()+"',address='"+customer.getCustomerAddress()+"',city='"+customer.getCity()+"',phone_no="+customer.getPhone_no()+",created_date=NOW(),created_by='SYSTEM' WHERE CUSTOMER_ID="+customer.getCustomerId();

			System.out.println("executed updatequery:" +updatequery);
			st.execute(updatequery);
		}
		
			catch(Exception e) {
				e.printStackTrace();
				System.out.println(e);
			}

			return customer;
	}
	
	
	
	public void deleteCustomer(Integer customerId) {
		
		System.out.println("deleteCustomer called with customerId: "+customerId);

		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jancy1","root","jerin");
			Statement st=con.createStatement();
       
            String deletequery="delete from customer WHERE CUSTOMER_ID=" + customerId;
            System.out.println("executed deletequery" +deletequery);
			st.execute(deletequery);


		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
	}

}
