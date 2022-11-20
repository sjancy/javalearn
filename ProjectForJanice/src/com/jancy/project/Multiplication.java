package com.jancy.project;

import java.util.Random;
import java.util.Scanner;

public class Multiplication {

	public static void main(String[] args) {
		Random rm = new Random();
		Scanner sc = new Scanner(System.in);

		int randomone = 0, randomtwo = 0, count = 1;
		int youranswer = 0, correct = 0, Incorrect = 0, product = 0;

		while (count <= 5) {
			System.out.println("Problem No:" + count);
			randomone = rm.nextInt(13);
			randomtwo = rm.nextInt(13);

			product = randomone * randomtwo;
			System.out.println(randomone + " * " + randomtwo);
			System.out.print("Answer: ");
			youranswer = sc.nextInt();
			if (youranswer == product) {
				System.out.println("Correct" + "\n");
				correct++;
			} else {
				System.out.println("Incorrect" + "\n");
				Incorrect++;
			}
			count++;
		}
		
		System.out.println("Correct:" +correct);
		System.out.println("InCorrect:" +Incorrect);
	}
}
