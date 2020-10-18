package com.syntax.class07;

import java.util.Scanner;

public class LuckynumberWhile {

			public static void main(String[] args) {
			Scanner input=new Scanner (System.in);
			int numberfromuser, luckynum=7;
			
			System.out.println("enter number");
			numberfromuser=input.nextInt();
			
			while (numberfromuser!=luckynum) {System.out.println("enter number");
			numberfromuser=input.nextInt();}
			
	}

}
