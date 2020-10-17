package com.syntax.class06;

import java.util.Scanner;

public class swiTH {

	public static void main(String[] args) {
	//Allow user to enter grade and then provide explanation:
		//A-Excellent, B-Good, C-Average, D-Bad, any other grade --> Not Acceptable.
		//At the end your program should print which grade was entered by a user with explanation.
 Scanner input= new Scanner(System.in);
 System.out.println("please enter your grade");
 String grade=input.next();
 String message;
 switch (grade.toUpperCase()) {
 case "A":
	 message="Excelent";
	 break;
 case "B":
	 message="Good";
	 break;
 case "C":
	 message="Average";
	 break;
 case "D":
	 message="Bad";
	 break;
default:
	message="Invalid";
    
 }
 System.out.println(message);
	}

}
