package com.jancy.enums;

import java.util.Arrays;

public class EnumRunner {

	enum Season {
		WINTER(1), SPRING(2), FALL(3), SUMMER(4);

		//constructor
		private int value;

		private Season(int value) {
			this.value = value;
		}

		public int getValue() {
			return value;
		}
		
		
		

		//0,1,2,3
	}

	public static void main(String[] args) {

		Season season1 = Season.valueOf("WINTER");
		System.out.println(season1);
		
		 
		
		
		System.out.println(Season.SPRING.ordinal());

		System.out.println(Season.SPRING.getValue());

		System.out.println(Arrays.toString(Season.values()));

	}

}
