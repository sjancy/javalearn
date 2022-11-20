package com.jancy.ifstatment.examples;

import java.util.Scanner;

public class DoWhileExercise {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int choice=0;
		int number1=0;
		int number2=0;
		

	       do { 
				System.out.print("Enter Number1: ");
			   number1=scanner.nextInt();
			   System.out.print("Enter Number2: ");
			   number2=scanner.nextInt();
			   System.out.print("Enter Choice: ");
			   choice=scanner.nextInt();
					  // System.out.println("Choices Available are: ");
		       //System.out.println("1 - Add");
		       //System.out.println("2 - Subtract");
		       //System.out.println("3 - Divide");
		       //System.out.println("4 - Multiply");
			if(choice==1) {
	   			System.out.println("Result :" + (number1 + number2));
			}
			else if(choice==2) {
	   			System.out.println("Result :" + (number1 - number2));
	   		}
			else if(choice==3) {
	   			System.out.println("Result :" + (number1 / number2));
	   		}
			else if(choice==4) {
	   			System.out.println("Result :" + (number1 * number2));
	   		}
				

     
	   	}while(choice<4);
	   		System.out.println("Thany You!");
	   	

	}
	
	

}
