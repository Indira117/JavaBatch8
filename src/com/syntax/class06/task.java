package com.syntax.class06;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		Scanner input= new Scanner (System.in);
		System.out.println("Check a store has sale: true or false");
		boolean sale=input.nextBoolean();
		
		if (!sale) {
			System.out.println("no shopping");
		}
		
		if (sale) {
			System.out.println("enter price");
			double price=input.nextDouble();
		if (price>=10  && price<50) {
			System.out.println("discount 10%, total  "+ (price-(price*0.1)));;
		}
		else if (price>=50  && price<100) {
			System.out.println("discount 20%, total  "+ (price-(price*0.2)));;
		} else if (price>=100  && price<500) {
			System.out.println("discount 40%, total  "+ (price-(price*0.4)));;
		}else  if (price>=500) {
			System.out.println("discount 50%, total  "+ (price-(price*0.5)));;
		} 
		}
	}

}
