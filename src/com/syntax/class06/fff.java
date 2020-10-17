package com.syntax.class06;

import java.util.Scanner;

public class fff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner (System.in);
		  System.out.println ("Please enter two strings");
		  String word1=input.nextLine();
		  String word2=input.nextLine();
		  System.out.println("Please enter two numbers");
		  int int1=input.nextInt();
		  int int2=input.nextInt();
		  
		  if ((int1==int2) && (word1.equalsIgnoreCase(word2) )){
		  
		    System.out.println("AND");
		    if ((int1==int2) || (word1.equalsIgnoreCase(word2) )){
		    System.out.println("OR");
		  }if ((int1!=int2) || (word1!=word2))
		  {System.out.println("NONE");}
	     
	}
	}
}
