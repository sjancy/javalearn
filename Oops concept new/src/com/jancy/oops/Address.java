package com.jancy.oops;

public class Address {
	//state
	private String line1;
	private String city;
	private String zip;
	
	//creation
	public Address(String line1, String city, String zip) {
		super();
		this.line1 = line1;
		this.city = city;
		this.zip = zip;
	}
	
	public String toString() {
		return String.format("line1-%s, city- %s, zip-%s",line1,city,zip);
	}

}
