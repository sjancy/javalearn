package com.jancy.bankProjectService;

import java.util.Scanner;

import com.jancy.bankproject.Customer1;
import com.jancy.bankproject.dao.Customer1Dao;

public class CustomerBankService {
	
	private Scanner sc=new Scanner(System.in);
	Customer1Dao customer1Dao=new Customer1Dao();
	
	
	public void createCustomer() {
		
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the address:");
		String address=sc.next();
		address+=sc.nextLine();
		System.out.println("Enter the city: ");
		String city=sc.next();
		System.out.println("Enter the phone no: ");
		int phone_no=sc.nextInt();
		
		Customer1 customer1=new Customer1();
		customer1.setCustomername(name);
		customer1.setAddress(address);
		customer1.setCity(city);
		customer1.setPhoneno(phone_no);
		
		Integer NewCustomerId=customer1Dao.getNewCustomerId();
		customer1.setCustomerId(NewCustomerId);
		customer1Dao.createcustomer(customer1);
		
		
		}
	
	
	public void updateCustomer() {
		
		System.out.println("Enter the customerId");
		int customerId=sc.nextInt();
		System.out.println("Enter the name:");
		String name=sc.next();
		System.out.println("Enter the address:");
		String address=sc.next();
		address+=sc.nextLine();
		System.out.println("Enter the city: ");
		String city=sc.next();
		System.out.println("Enter the phone no: ");
		int phone_no=sc.nextInt();
		
		Customer1 customer1=new Customer1();
		customer1.setCustomerId(customerId);
		customer1.setCustomername(name);
		customer1.setAddress(address);
		customer1.setCity(city);
		customer1.setPhoneno(phone_no);
		
		customer1Dao.updatecustomer(customer1);
	}
	
	
	public void getCustomer() {
		
		System.out.println("Enter the customerId:");
		int customerId=sc.nextInt();
		
		Customer1 customer1=customer1Dao.getcustomer(customerId);
		System.out.println(customer1);
	}
	
	
	public void deleteCustomer() {
		
		System.out.println("Enter the customerId:");
		int customerId=sc.nextInt();
		
		customer1Dao.deletecustomer(customerId);
		
		System.out.println("customerId "+customerId+" deleted");

	}
	
}
