package com.jancy.ifstatment.examples;

import java.util.Scanner;

public class DoWhileRunner {

	public static void main(String[] args) {

      Scanner scanner=new Scanner(System.in);
      int number=-1;// why we initialize -1 or else "the cube is 0" showing always. 
      
      
      do {
    	  if(number!=-1) {
    		  System.out.println("Cube is " +(number*number*number));
    	  }
    	  System.out.print("Enter a number: "); 
    	  number=scanner.nextInt();
    	  
      }while(number>=0);
      System.out.print("Thank You! Have Fun!");

	}

}
