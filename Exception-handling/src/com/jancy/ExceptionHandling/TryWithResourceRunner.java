package com.jancy.ExceptionHandling;

import java.util.Scanner;

public class TryWithResourceRunner {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)){//this trywith resource.we no need to use catch and finally.

		int[] numbers = { 12, 3, 4, 5 };
		int number = numbers[2];


		}
	}

}
