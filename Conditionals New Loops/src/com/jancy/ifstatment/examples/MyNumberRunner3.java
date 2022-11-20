package com.jancy.ifstatment.examples;

public class MyNumberRunner3 {

	public static void main(String[] args) {
		int num = 5;
		MyNumber number=new MyNumber();
		
		boolean isPrime=number.isPrime(num);
		System.out.println("isprime " +isPrime);
		
		if(isPrime) {
			num = num +2;
			boolean isPrime2 = number.isPrime(num);
			System.out.println("isPrime2 " +isPrime2);

		}else {
			int sum=number.sumUptoN();
			boolean sumPrime = number.isPrime(sum);
			System.out.println("sumPrime " +sumPrime);

		}
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





