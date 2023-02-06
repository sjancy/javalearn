package com.jancy.web.dao;

import com.jancy.web.model.Customer1;
import java.sql.*;

public class Customer1Dao {
	
	public Customer1 getcustomer1(int customer_Id)
	{
		Customer1 c=new Customer1();
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jancy2","root","jerin");
			Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from customer1 where customer_Id=" +customer_Id);

			if(rs.next()) {
				c.setCustomerId(rs.getInt("customer_Id"));
			    c.setCustomername(rs.getString("customer_name"));
			    c.setAddress(rs.getString("address"));
				c.setCity(rs.getString("city"));
				c.setPhoneno(rs.getInt("phone_no"));
			}

		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
		return c;
	}
	
	

}
