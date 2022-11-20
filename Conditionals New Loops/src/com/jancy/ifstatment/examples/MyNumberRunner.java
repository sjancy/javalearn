package com.jancy.ifstatment.examples;

public class MyNumberRunner {

	public static void main(String[] args) {
		MyNumber number=new MyNumber(5);
		
	    boolean isPrime = number.isPrime();
		System.out.println("isprime " + isPrime);
		
		
		int sum=number.sumUptoN();
		System.out.println("sumUptoN " +sum);
		
		int sumOfDivisors=number.sumOfDivisors();
		System.out.println("sumOfDivisors "+sumOfDivisors);
		
		number.printNumberTriangle();

	}

	/**
	 * find if the given number is prime.
	 * if it is prime, 
	 * 		add 2 to the number.
	 * 		Check if the new number is prime.
	 * else
	 * 		sum upto n for the number
	 * 		Check if the sum is prime.
	 * 
	 */
}





