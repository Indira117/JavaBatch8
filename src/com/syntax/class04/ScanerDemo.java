package com.syntax.class04;
// shortcut to import ctrl+shift+o
import java.util.Scanner;

public class ScanerDemo {

	public static void main(String[] args) {
		
		int num=80;
		String str="I am string";
		Scanner scan=new Scanner(System.in);// enable input to the console
		System.out.println("Please enter any text");
		String value=scan.nextLine();// waits for your input and once you provided input____> hit enter
		
		System.out.println("Captured  " +value);
		
		System.out.println("please enter yuor name");
		String name=scan.nextLine();
		System.out.println("Nice to meet you "+name);
	}

}
