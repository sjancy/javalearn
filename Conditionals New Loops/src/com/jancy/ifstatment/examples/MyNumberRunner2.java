package com.jancy.ifstatment.examples;

public class MyNumberRunner2 {

	public static void main(String[] args) {
		int num = 5;
		MyNumber number=new MyNumber(num);
		
		boolean isPrime=number.isPrime();
		System.out.println("isprime " +isPrime);
		
		if(isPrime) {
			num = num +2;
			MyNumber number2=new MyNumber(num);
			boolean isPrime2 = number2.isPrime();
			System.out.println("isPrime2 " +isPrime2);

		}else {
			int sum=number.sumUptoN();
			MyNumber number3=new MyNumber(sum);
			boolean sumPrime = number3.isPrime();
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





