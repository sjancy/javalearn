package com.jancy.Array;

import java.util.Arrays;

public class BasicArray {

	public static void main(String[] args) {
		int[] number= {1,7,5,3,5,7,8,2};
		
		for (int i = 0; i < number.length; i++) {//this is one way to get the element from array
			System.out.println(number[i]);
			
			//or 
			//for(int numbers:number) {    //this is called enhanced for Loop
			//	System.out.println(numbers);
			//}
		}
		
		System.out.println(Arrays.toString(number));//this is another way
		
		System.out.println("length:"+  number.length);
		
		
		
		int[] marks=new int[5];
		Arrays.fill(marks,100);
		for(int mark:marks) {
		System.out.println(mark);
		}
		
		Arrays.sort(number);
		for(int numbers:number) {   
				System.out.println(numbers);
			}
		
		int[] num= {1,1,1,2,1};
		int sumleft=0;
		int sumright=0;
		for(int i=0;i<num.length/2+1;i++){
		    sumleft+=num[i];
		  }
		
		for(int j=num.length/2+1;j<num.length;j++){
		    sumright+=num[j];
		  }
		System.out.println("sumleft:" +sumleft);
		System.out.println("length:"+num.length/2);
		
		System.out.println("sumright:" +sumright);
		
		
		

	}

}
