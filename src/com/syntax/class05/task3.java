package com.syntax.class05;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Write a program that will print whether it is a weekend or weekday. 
		//If any day from 1-5 → output “It is a weekday”, 
		//anyday from 6-7 → output “It is a weekend”, 
		//any other day → output “Invalid day”
		Scanner input= new Scanner (System.in);
		System.out.println("please enter number of day");
		int day=input.nextInt();
		if (day>=1 && day<=5) {System.out.println("It is weekday");
		}else if (day==6 || day==7 ) {
			System.out.println("it is weekend");
		}else {System.out.println("Invailid day");}
	}

}
