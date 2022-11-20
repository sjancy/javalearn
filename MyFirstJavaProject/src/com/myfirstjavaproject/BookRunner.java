package com.myfirstjavaproject;

public class BookRunner {

	public static void main(String[] args) {
		Book artOfComputerProgramming=new Book(100);
		Book effectiveJava=new Book(50);
		Book cleanCode=new Book(40);
		
		artOfComputerProgramming.setNoOfCopies(100);
		artOfComputerProgramming.increaseNoOfCopies(100);
		System.out.println(artOfComputerProgramming.getnoOfCopies());
		
		effectiveJava.setNoOfCopies(50);
		cleanCode.setNoOfCopies(40);
		
		
	}

}
