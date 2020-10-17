package com.syntax.class04;

import java.util.Scanner;

public class ScannerDemo2 {

	public static void main(String[] args) {
		
		Scanner indi=new Scanner (System.in);
		System.out.println("Please enter boolean value for rain");
		
		boolean rain=indi.nextBoolean();
		
		if (rain) {
			System.out.println("Please take an umbrella");
		}else {
			System.out.println("It is a nice day");
		}
System.out.println("________________________");
System.out.println("please ener your name");

String name=indi.next();

System.out.println("Please enter your age");
int num=indi.nextInt();
System.out.println("Your name  " + name+ " your age  "+ num);



	}

}
