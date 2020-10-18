package com.syntax.class08;

import java.util.Scanner;

public class RecapDoWhile {

	public static void main(String[] args) {
 Scanner input= new Scanner (System.in);
		
		int money, waterPrice=5;
		
		System.out.println("Please pay for your water ");
		//money=input.nextInt();
		
		do {money=input.nextInt();
			if (money>waterPrice) {
			System.out.println("This too much, you need to enter less money");
			//money=input.nextInt();
		}else if (money<waterPrice){
			System.out.println("Please insert more money");
			//money=input.nextInt();
		}
		//money=input.nextInt();	
		} while(money!=waterPrice); //false
System.out.println("enjoy your water");
	}

}
