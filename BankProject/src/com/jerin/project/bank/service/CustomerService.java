package com.jerin.project.bank.service;

import java.util.Scanner;

import com.jerin.project.bank.dao.CustomerDao;
import com.jerin.project.bank.model.Customer;

public class CustomerService {
	
	private Scanner sc=new Scanner(System.in);
	
	CustomerDao customerDao = new CustomerDao();
	
	public void createCustomer() {
		
		System.out.println("Enter Customer name:");
		String name=sc.next();
		System.out.println("Enter Customer address:");
		String address=sc.next();
		address+=sc.nextLine();
		System.out.println("Enter Customer city:");
		String city=sc.next();
		System.out.println("Enter Customer phone_no:");
		int phoneno=sc.nextInt();


		Customer customer = new Customer();
		customer.setCustomerName(name);
		customer.setCustomerAddress(address);
		customer.setCity(city);
		customer.setPhone_no(phoneno);
		
		Integer newCustomerId = customerDao.getNewCustomerId();
		customer.setCustomerId(newCustomerId);
		customerDao.createCustomer(customer);
	}
	
	public void updateCustomer() {
		
		System.out.println("Enter Customer ID:");
		int customerId=sc.nextInt();
		System.out.println("Enter Customer name:");
		String name=sc.next();
		System.out.println("Enter Customer address:");
		String address=sc.next();
		address+=sc.nextLine();
		System.out.println("Enter Customer city:");
		String city=sc.next();
		System.out.println("Enter Customer phone_no:");
		int phoneno=sc.nextInt();


		Customer customer = new Customer();
		customer.setCustomerId(customerId);
		customer.setCustomerName(name);
		customer.setCustomerAddress(address);
		customer.setCity(city);
		customer.setPhone_no(phoneno);

		
		customerDao.updateCustomer(customer);
	}
	
	public void getCustomer() {
		
		System.out.println("Enter Customer ID:");
		int customerId=sc.nextInt();
		
		Customer customer = customerDao.getCustomer(customerId);
		System.out.println(customer);
	}
	
	public void deleteCustomer() {
		System.out.println("Enter Customer ID:");
		int customerId=sc.nextInt();

		customerDao.deleteCustomer(customerId);
		
		System.out.println("Customer "+customerId+" deleted.");
	}
	
	

}
