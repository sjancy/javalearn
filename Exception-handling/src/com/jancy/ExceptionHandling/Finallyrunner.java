package com.jancy.ExceptionHandling;

import java.util.Scanner;

public class Finallyrunner {

	public static void main(String[] args) {
		 Scanner scanner=null;

		try {
  scanner=new Scanner(System.in);
  
  int[] numbers= {12,3,4,5};
  int number=numbers[2];

 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			 System.out.println("Before scanner Close");
			 if(scanner!=null) {
			scanner.close();
			 }
		}
  
		System.out.println("Just before closing out main");
	}

}
