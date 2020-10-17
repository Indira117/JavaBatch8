package com.syntax.class05;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class logicalOr {

	public static void main(String[] args) {

		String day = "Sunday";

		if (day.equals("Saturday") || day.equals("Sunday")) {
			System.out.println("Today i have a Java class at Syntax");
		}

		System.out.println("The end");

		System.out.println("_______________________________________________");

		/*
		 * if day is 1 or 5>>>>i am off from syntax if 2 or 3>>>>>>GIT classes if is
		 * 4>>>>>review class if day 6 or 7>>>>>java everyelse will be invailid day
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter today day using numbers only");

		int today = scan.nextInt();
		if (today == 1 || today == 5) {
			System.out.println("I am off syntax");
		} else if (today == 2 || today == 3) {
			System.out.println("Today is GIT class");
		} else if (today == 4) {
			System.out.println("Today is review class");
		} else if (today == 6 || today == 7) {
			System.out.println("Today is Java class");
		}else {System.out.println("Please enter a valid day from 1 to 7");}
	}

}
