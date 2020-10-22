package com.syntax.class08;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		System.out.println("please enter start range");
		int a= input.nextInt();
		System.out.println("please enter start end");
		int b= input.nextInt();
		
		for (int r=a;r<=b; r++ ) {
			System.out.print(r+" ");
		}
	System.out.println("--------------------");
	
	System.out.println("please enter item name");
	String item=input.nextLine();
	
	System.out.println("please enter price");
	int price=input.nextInt();
	 
	System.out.println("please enter money ");
	int money=input.nextInt();
	int change=0;
	while (money<price) {
		change=price-money;
		System.out.println("need more money"+change);
	}
	
	}
	

}
