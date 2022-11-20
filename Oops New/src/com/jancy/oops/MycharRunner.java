package com.jancy.oops;

public class MycharRunner {

	public static void main(String[] args) {
		MyChar mychar=new MyChar('b');
		
		System.out.println(mychar.isVowel());
		System.out.println(mychar.isDigit());
		System.out.println(mychar.isAlphabet());
		System.out.println(mychar.isConsonant());
		
		MyChar.printUpperCaseAlphabet();
		MyChar.printLowerCaseAlphabet();
	}

}
