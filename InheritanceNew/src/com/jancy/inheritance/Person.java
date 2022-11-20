package com.jancy.inheritance;

public class Person extends Object{
	private String Name;
	private String Email;
	private String PhoneNo;
	
	
	
	
	
	public Person(String name) {
		super();
		Name = name;
		System.out.println("Person Constructor");
	}
	
	
	public String getName() {
		return Name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getPhoneNo() {
		return PhoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		PhoneNo = phoneNo;
	}
	
	public String toString() {//this is we are overridding the implementaion from the object
        return Name +"#" +Email + "#" +PhoneNo;
    }
	

}
