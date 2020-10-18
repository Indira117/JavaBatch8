package com.syntax.class07;

import java.util.Scanner;

public class LuckyNumber {

	public static void main(String[] args) {
		Scanner input=new Scanner (System.in);
		int numberfromuser, luckynum=7;
		
	do {	System.out.println("enter number");
	numberfromuser=input.nextInt();
		//System.out.println("Try again");
		}while (numberfromuser!=luckynum);
		System.out.println("You win");
		
	}

}
