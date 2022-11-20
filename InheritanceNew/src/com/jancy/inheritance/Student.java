package com.jancy.inheritance;

public class Student extends Person{
	private String CollegeName;
	private int Year;
	
	
	public Student(String name,String collegeName) {
		super(name);
		this.CollegeName=collegeName;
	}
	
	public String getCollegeName() {
		return CollegeName;
	}
	public void setCollegeName(String collegeName) {
		CollegeName = collegeName;
	}
	public int getYear() {
		return Year;
	}
	public void setYear(int year) {
		Year = year;
	}
	
	

}
