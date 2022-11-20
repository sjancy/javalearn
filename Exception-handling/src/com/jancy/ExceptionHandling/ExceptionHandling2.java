package com.jancy.ExceptionHandling;

public class ExceptionHandling2 {

	public static void main(String[] args) {
		
		method1();
		System.out.println("Main Endes");

	}

	private static void method1() {
		method2();
		System.out.println("Method1 Endes");

	}

	private static void method2() {
		try {
		String str=null;
		str.length();
		System.out.println("Method2 Endes");
		}
		catch(NullPointerException ex) {
			System.out.println("NullPointerException");
			ex.printStackTrace();
		}
        catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
