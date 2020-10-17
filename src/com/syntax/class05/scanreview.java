package com.syntax.class05;

import java.util.Scanner;

public class scanreview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scanner;
scanner=new Scanner (System.in);

String sentence=scanner.nextLine();
System.out.println("You entered sentence: "+sentence);
int number=scanner.nextInt();
System.out.println("You entered number: "+number);
	
char singleCharacter=scanner.next().charAt(0);
System.out.println("You entered sentence: "+singleCharacter);
	}

}
