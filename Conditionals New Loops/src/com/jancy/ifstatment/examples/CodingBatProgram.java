package com.jancy.ifstatment.examples;

public class CodingBatProgram {

	public static void main(String[] args) {
		CodingBatProgram cb=new CodingBatProgram();
		
		int output=cb.sumDouble(3,3);
		System.out.println(output);
		
		int output1=cb.diff21(23);
		System.out.println(output1);
		
		String output2=cb.missingChar("kitten", 1);
		System.out.println(output2);



	}
	
	public int sumDouble(int a, int b) {
		if(a==b) {
			int c=2*(a+b);
			return c;
		}
		int c=a+b;
		return c;
		  
	}
	
	
	public int diff21(int n) {
		int diff=0;
		if(n<=21) {
			 diff=21-n;
		}
		if(n>21) {
			 diff=2*(n-21);
		}
		return diff;
		  
	}
	
	
	public String missingChar(String str, int n) {
		  String front=str.substring(0,n) ;
		  //return front;
		  String back=str.substring(n+1,str.length());
		  //return back;
		  return front+back;

		}




}
