package com.syntax.class08;

import java.util.Scanner;

public class task111 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		System.out.println("please enter item name");
		String item=input.nextLine();
		
		System.out.println("please enter price");
		int price=input.nextInt();
		 
		System.out.println("please enter money ");
		int money=input.nextInt();
		int change=0;
		while (money<price) {
			change=price-money;
			System.out.println("need more money $"+change);
			System.out.println("please enter money ");
			money=input.nextInt();
			if (money>price) {
				change=money-price;
				System.out.println("Your change " +change);}else {System.out.println("thank you");}
		}
	}

}
