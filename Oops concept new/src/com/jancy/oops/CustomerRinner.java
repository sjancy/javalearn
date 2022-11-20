package com.jancy.oops;

public class CustomerRinner {

	public static void main(String[] args) {
		
		Address homeAddress=new Address("line1","coppell","75019");
		Customer customer=new Customer("Jancy", homeAddress);
		
		
		Address workAddress=new Address("line1 for work","coppell","750192");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);

	}

}
