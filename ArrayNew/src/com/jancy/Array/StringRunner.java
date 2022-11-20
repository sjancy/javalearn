package com.jancy.Array;

public class StringRunner {

	public static void main(String[] args) {
		String[] daysOfWeek= {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
		
		String dayWithMostChar="";
		
		for(String day:daysOfWeek) {
			if(day.length() > dayWithMostChar.length()) {
				dayWithMostChar=day;
			}
		}

		 System.out.println("Day with Most Number:" +dayWithMostChar);
		 
		 for(int i=daysOfWeek.length-1;i>=0;i--) {
			 System.out.println(daysOfWeek[i]);
			 
		 }
	}

}
