package com.myfirstjavaproject;

public class Book {
	private int noOfCopies;
	
	Book(int noOfCopies){
		this.noOfCopies=noOfCopies;
	}
	
	
	public int getnoOfCopies(){
	return noOfCopies;
	}
	
	
	public void setNoOfCopies(int noOfCopies) {
		if(noOfCopies>0)
		this.noOfCopies=noOfCopies;
	}
	
	public void increaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies+howMuch);
	}
	
	public void decreaseNoOfCopies(int howMuch) {
		setNoOfCopies(this.noOfCopies-howMuch);
	}
	

}
