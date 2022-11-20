package com.jancy.ifstatment.examples;

public class IfStatementRunner {

	public static void main(String[] args) {
		
		puzzle2();
		/*		int i=25;
				//i=25
				//i=24
				//i is neither 25 or 24
				
				if(i==25) {
					System.out.println("i =25");
				}else if(i==24){
					System.out.println("i =24");
				}else {
					System.out.println("i!=24 and i!=25");
				}
				
		*/			
	}
	
	
	public static void puzzle1() {
		int k=15;
		if(k>20) {
			System.out.println(1);
		}else if(k < 20) {
			System.out.println(2);
		}else if(k > 10) {
			System.out.println(3);
		}else {
			System.out.println(4);
		}
			
	}
	
	
	public static void puzzle2() {
		int number=5;
		
		if(number<0) {
			number=number+10;
		}
		number++;//if condition is not true.but from this line the program will work.
		System.out.println(number);
	}

}
