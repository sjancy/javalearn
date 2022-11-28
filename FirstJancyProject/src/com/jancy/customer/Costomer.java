package com.jancy.customer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Costomer {

	public static void main(String[] args) throws SQLException {
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jancy","root","jerin");
		Statement stmt=con.createStatement();
		
		Scanner sc=new Scanner(System.in);
	
		System.out.println("Enter your choice:");
		System.out.println("1.Customer details");
		System.out.println("2.Account details");
		System.out.println("3.Transcation details");
		
		System.out.println("Enter your choice:");
		int a=sc.nextInt();
	
		System.out.println("Customer details are:");
		System.out.println("1.Add");
		System.out.println("2.View");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		
		
		System.out.println("Enter your choice:");
		int add=sc.nextInt();
		
		if(add==1) {
		System.out.println("Enter your ID:");
		int id=sc.nextInt();
		System.out.println("Enter your name:");
		String name=sc.next();
		System.out.println("Enter your address:");
		String address=sc.next();
		address+=sc.nextLine();
		System.out.println("Enter your phone no:");
		int pno=sc.nextInt();

		String s="INSERT INTO CUSTOMER VALUES ("+id+",'"+name+"','"+address+"',"+pno+")";
		System.out.println("query: "+s);
		stmt.execute(s);
		//con.close();

		}
		//test
		
		
		if(add==2) {
			System.out.println("Enter your ID:");
			int viewid=sc.nextInt();
			
			String view="select CUTOMER_ID,CUSTOMER_NAME,ADDRESS,PHONENUMBER from customer WHERE CUTOMER_ID="+viewid+"";
	 		//System.out.println("query: "+view);	

			ResultSet rs=stmt.executeQuery(view);
			
			while(rs.next()) {
				int cid=rs.getInt("CUTOMER_ID");
				String cname=rs.getString("CUSTOMER_NAME");
				String caddress=rs.getString("ADDRESS");
				int cph=rs.getInt("PHONENUMBER");
				
				System.out.println(cid+"   "+cname+"   "+caddress+ "   "+cph);
			}
				con.close();
				
			


		}
		
		
		
		if(add==3) {
		System.out.println("Enter your ID:");
		int uid=sc.nextInt();
		System.out.println("Enter your name:");
		String uname=sc.next();
 		String ud="UPDATE CUSTOMER SET CUSTOMER_NAME='"+uname+"' WHERE CUTOMER_ID="+uid+"";
 		System.out.println("query: "+ud);	
		stmt.execute(ud);
		//con.close();
		}
		
		
		if(add==4) {
		System.out.println("Enter your ID:");
		int uid=sc.nextInt();
 		String udelete="DELETE FROM CUSTOMER WHERE CUTOMER_ID="+uid+"";
 		System.out.println("query: "+udelete);	
		stmt.execute(udelete);
		//con.close();
		}


	}

}
