package com.jancy.oops;

public class Bookrunner {

	public static void main(String[] args) {
		Book book=new Book(123,"Object Oriented Programming","Jancy");
		
		System.out.println(book);
		
		book.addReview(new Review(10, "Great Book",5));
		book.addReview(new Review(101, "Awasome",6));
		
		System.out.println(book);
	}

}
