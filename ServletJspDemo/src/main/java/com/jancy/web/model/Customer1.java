package com.jancy.web.model;

public class Customer1 {

	private Integer customerId;
	private String customername;
	private String address;
	private String city;
	private Integer phoneno;
	
	
	public Integer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String adress) {
		this.address = adress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(Integer phoneno) {
		this.phoneno = phoneno;
	}
	
	
	public String toString() {
		return "Customer1[customerId= " + customerId + ",customername= " +customername + ",adress= " +address+ ", city= " + city +", phoneno=" + phoneno +"]";
		
	}
	
}
