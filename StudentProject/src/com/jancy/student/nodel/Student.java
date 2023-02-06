package com.jancy.student.nodel;

public class Student {
	
	private Integer studentID;
	private String name;
	private Integer age;
	private String address;
	
	
	public Integer getSutdentID() {
		return studentID;
	}
	public void setSutdentID(Integer sutdentID) {
		this.studentID = sutdentID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	@Override
	public String toString() {
		return "Student [studentID=" + studentID + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	
	

}
