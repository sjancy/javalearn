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
	if(a==1) {
		System.out.println("Customer details are:");
		System.out.println("1.Add");
		System.out.println("2.View");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		System.out.println("5.Back to the Main Menu");
	
		
	System.out.println("Enter your choice:");
	int customer=sc.nextInt();

		if(customer==1) {
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
		
		if(customer==2) {
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
				//con.close();
		}
		
		if(customer==3) {
		System.out.println("Enter your ID:");
		int uid=sc.nextInt();
		System.out.println("Enter your name:");
		String uname=sc.next();
 		String ud="UPDATE CUSTOMER SET CUSTOMER_NAME='"+uname+"' WHERE CUTOMER_ID="+uid+"";
 		System.out.println("query: "+ud);	
		stmt.execute(ud);
		//con.close();
		}
		if(customer==4) {
		System.out.println("Enter your ID:");
		int uid=sc.nextInt();
 		String udelete="DELETE FROM CUSTOMER WHERE CUTOMER_ID="+uid+"";
 		System.out.println("query: "+udelete);	
		stmt.execute(udelete);
		con.close();
		}
		
	
	}
		
	
	/*if(a==2) {
			System.out.println("Account details are:");
			System.out.println("1.Add");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			//System.out.println("5.Back to Main Menu");

		System.out.println("Enter your choice:");
		int Account=sc.nextInt();
		

			if(Account==1) {
			System.out.println("Enter your Cust_ID:");
			int Cid=sc.nextInt();
			System.out.println("Enter your Acc_ID:");
			int Aid=sc.nextInt();
			System.out.println("Enter your Amount:");
			int amount=sc.nextInt();
		
			String accountinsert="INSERT INTO ACCOUNT VALUES ("+Cid+","+Aid+","+amount+")";
			System.out.println("query: "+accountinsert);
			stmt.execute(accountinsert);
			//con.close();
			}
			
			if(Account==2) {
				System.out.println("Enter your ID:");
				int viewCid=sc.nextInt();
				
				String view="select CUTOMER_ID,ACC_ID,AMOUNT from ACCOUNT WHERE CUTOMER_ID="+viewCid+"";
		 		//System.out.println("query: "+view);	

				ResultSet rs=stmt.executeQuery(view);
				
				while(rs.next()) {
					int cid=rs.getInt("CUTOMER_ID");
					int Aid=rs.getInt("ACC_ID");
					int amount=rs.getInt("AMOUNT");
					System.out.println(cid+"   "+Aid+"   "+amount);
				}
					//con.close();
			}
			if(Account==3) {
				System.out.println("Enter your ID:");
				int uid=sc.nextInt();
				System.out.println("Enter your ammount:");
				int amount=sc.nextInt();
		 		String accountupdate="UPDATE ACCOUNT SET AMOUNT="+amount+" WHERE CUTOMER_ID="+uid+"";
		 		System.out.println("query: "+accountupdate);	
				stmt.execute(accountupdate);
				//con.close();
				}
			if(Account==4) {
				System.out.println("Enter your ID:");
				int aid=sc.nextInt();
		 		String accountdelete="DELETE FROM ACCOUNT WHERE CUTOMER_ID="+aid+"";
		 		System.out.println("query: "+accountdelete);	
				stmt.execute(accountdelete);
				//con.close();
				}
		}


	if(a==3) {
		System.out.println("Transation details are:");
		System.out.println("1.Withdraw");
		System.out.println("2.Deposit");
		System.out.println("3.View Recent Transation");

	System.out.println("Enter your choice:");
	int Transation=sc.nextInt();
	
	if(Transation==1) {
		System.out.println("Enter your Acc_ID:");
		int Accid=sc.nextInt();
     	System.out.println("Enter your T_ID:");
	   int Transid=sc.nextInt();
	   System.out.println("Enter the Type:");
	   String type=sc.next();
	   System.out.println("Enter your Amount:");
	   int withdrawAmount=sc.nextInt();

	   String withdraw="INSERT INTO TRANSATION VALUES ("+Accid+","+Transid+",'"+type+"',"+withdrawAmount+")";
	   System.out.println("query: "+withdraw);
	   
	   stmt.execute(withdraw);
	   
	   //Insert transation done.
	   String view="select AMOUNT from ACCOUNT WHERE ACC_ID="+Accid+"";
		ResultSet rs=stmt.executeQuery(view);
		
		int currentBalance = 0;
		while(rs.next()) {
			currentBalance = rs.getInt("AMOUNT");
			System.out.println(currentBalance);
		}
		
		int newBalance = currentBalance - withdrawAmount;

	  		   
	   String up="UPDATE ACCOUNT SET AMOUNT="+newBalance+" WHERE ACC_ID="+Accid+"";
	   stmt.execute(up);
	   System.out.println("up: "+up);
		
		    //con.close();
	}
	
	
	if(Transation==2) {
		System.out.println("Enter your Acc_ID:");
		int Accid=sc.nextInt();
     	System.out.println("Enter your T_ID:");
	   int Transid=sc.nextInt();
	   System.out.println("Enter the Type:");
	   String type=sc.next();
	   System.out.println("Enter your Amount:");
	   int depositwAmount=sc.nextInt();

	   String deposit="INSERT INTO TRANSATION VALUES ("+Accid+","+Transid+",'"+type+"',"+depositwAmount+")";
	   System.out.println("query: "+deposit);
	   
	   stmt.execute(deposit);
	   
	   //Insert transation done.
	   String view="select AMOUNT from ACCOUNT WHERE ACC_ID="+Accid+"";
		ResultSet rs=stmt.executeQuery(view);
		
		int currentBalance = 0;
		while(rs.next()) {
			currentBalance = rs.getInt("AMOUNT");
			System.out.println(currentBalance);
		}
		
		int newBalance = currentBalance + depositwAmount;

	  		   
	   String up="UPDATE ACCOUNT SET AMOUNT="+newBalance+" WHERE ACC_ID="+Accid+"";
	   stmt.execute(up);
	   System.out.println("up: "+up);
		
		    //con.close();
		    
	}
	
	if(Transation==3) {
		System.out.println("Enter your ID:");
		int viewLastTransation=sc.nextInt();
		
		String view="select ACC_ID,T_ID,TYPE,MONEY from TRANSATION WHERE ACC_ID="+viewLastTransation+"";
 		//System.out.println("query: "+view);	

		ResultSet rs=stmt.executeQuery(view);
		
		while(rs.next()) {
			
			int Aid=rs.getInt("ACC_ID");
			int tid=rs.getInt("T_ID");
			String type=rs.getString("TYPE");
			int money=rs.getInt("MONEY");
			System.out.println(Aid+"   "+tid+"   "+type+"  "+money);
		}
			//con.close();
	}*/

	
	}
	

}
