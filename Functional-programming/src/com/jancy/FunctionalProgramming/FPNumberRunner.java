package com.jancy.FunctionalProgramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numbers=List.of(4,7,8,15,8);
		
   /*numbers.stream().forEach(element->System.out.println(element));*/
		
     int sum = FPSum(numbers);
      System.out.print(sum);
     

	}

	private static int FPSum(List<Integer> numbers) {
		return numbers.stream() .filter(number->number%2==1) .reduce(0, (number1,number2)->number1+number2);
	}

	private static int normalSum(List<Integer> numbers) {
		int sum=0;
		for(int number:numbers) {
			sum+=number;
			
		}
		return sum;
	}
	
	

}
