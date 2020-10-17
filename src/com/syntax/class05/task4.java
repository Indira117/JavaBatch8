package com.syntax.class05;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
//System.out.println("Please enter score");
		//int score = input.nextInt();
		int quiz, mid, finalScore;
		System.out.println("Please enter quiz score");
		quiz = input.nextInt();
		System.out.println("Please enter mid score");
		mid = input.nextInt();
		System.out.println("Please enter final score");
		finalScore = input.nextInt();
		int score = (quiz + mid + finalScore) / 3;
		System.out.println(score);
		if (score >= 90) {
			System.out.println("grade A");
		} else if (score >= 70 && score < 90) {
			System.out.println("grade B");
		} else if (score >= 50 && score < 70) {
			System.out.println("gradae C");

		} else if (score < 50) {
			System.out.println("grade F");
		}
		System.out.println("_____________________________________");
		System.out.println("Please enter number birth month");

		int month = input.nextInt();

		if (month == 1 || month == 2 || month == 12) {
			System.out.println("You were born in winter");
		} else if (month >= 3 && month <= 5) {
			System.out.println("You were born in spring");
		} else if (month >= 6 && month <= 8) {
			System.out.println("You were born in summer");

		} else if (month >= 9 && month <= 11) {
			System.out.println("You are born in autumn");
		}
	}

}
