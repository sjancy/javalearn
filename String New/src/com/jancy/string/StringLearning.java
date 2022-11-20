package com.jancy.string;

public class StringLearning {

	public static void main(String[] args) {
		String str="Jancy";
		
		String h=str.toLowerCase();
		String hhh=str.substring(str.length()-3, str.length());
	
		for(int i=0;i<str.length();i++) {
			System.out.println(str.charAt(i));
			
			
		}
		
		System.out.println(hhh);

	}

}
