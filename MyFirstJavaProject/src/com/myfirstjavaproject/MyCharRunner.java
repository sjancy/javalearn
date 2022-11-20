package com.myfirstjavaproject;

public class MyCharRunner {

	public static void main(String[] args) {
		MyChar mychar=new MyChar('B');
		
		System.out.println(mychar.isVowel());
		System.out.println(mychar.isDigit());
		System.out.println(mychar.isAlphabet());
		System.out.println(mychar.isConsonant());
		
		MyChar.printLowerCaseAlphabets();
		MyChar.printUpperCaseAlphabets();
		
		
	}

}
