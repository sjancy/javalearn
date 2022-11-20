package com.jancy.ExceptionHandling;

public class CheckedExceptionRunner {

	public static void main(String[] args) {
		/*		try {
					SomeOtherMthod();
				Thread.sleep(2000);
				}catch(InterruptedException e) {
					e.printStackTrace();
				}*/
		SomeOtherMthod2();
	}
	
	private static void SomeOtherMthod2() throws RuntimeException{

		
	}

	private static void SomeOtherMthod() throws InterruptedException{
		Thread.sleep(2000);
		
	}

}
