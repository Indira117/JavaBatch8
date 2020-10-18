package com.syntax.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		Scanner input= new Scanner (System.in);
		String name;
		int number=1;
		
		while (number<=5) {
		System.out.println("Please tell me you name");
		name=input.nextLine();
		System.out.println("Nice to meet you "+name);
		number++;
		}
		
		System.out.println("-------------------------------------");
		
		
	} 

}
