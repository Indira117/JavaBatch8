package com.syntax.class08;

import java.util.Scanner;

public class Recap {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		
		int money, waterPrice=5;
		
		System.out.println("Please pay for your water ");
		money=input.nextInt();
		
		while(money!=waterPrice) {
			if (money>waterPrice) {
				System.out.println("This too much, you need to enter less money");
				//money=input.nextInt();
			}else {
				System.out.println("Please insert more money");
				//money=input.nextInt();
			}money=input.nextInt();
		} System.out.println("enjoy your water");

	}

}
