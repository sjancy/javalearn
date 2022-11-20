package com.jancy.ifstatment.examples;

public class SwitchExerciseRunner {

	public static void main(String[] args) {
		System.out.println(dertermineNameOfDay(6));
		System.out.println(isWeekDay(5));

	}
	
	public static boolean isWeekDay(int dayNumber) {
		switch(dayNumber) {
		case 0: return false;
		case 1: return true;
		case 2: return true;
		case 3: return true;
		case 4: return true;
		case 5: return true;
		case 6: return false;
		}
		return false;
	}
	
	//we can use this code also.because we can reduce the code.we used fall threw.
	/*	public static boolean isWeekDay(int dayNumber) {
			switch(dayNumber) {
			//case 0: return false;
			//case 1: return true;
			case 2: 
			case 3: 
			case 4: 
			case 5: 
			case 6: return false;
			}
			return false;
		}
	*/	
	
	
	public static String dertermineNameOfDay(int dayNumber) {
		switch(dayNumber) {
		case 0:
		       return "Sunday";		
		case 1:
		       return "Monday";	
		case 2:
		       return "Tuesday";		
		case 3:
		       return "Wednesday";		
		case 4:
		       return "Thursday";		
		case 5:
		       return "Friday";		
		case 6:
		       return "Saturday";		
	}
		return "Invalid-day";
	}
}
