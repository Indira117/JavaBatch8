package com.syntax.class04;

public class prac5 {

	public static void main(String[] args) {
		boolean diploma =false;
		float gpa=3.5f;
		if (diploma) {
			System.out.println("Congratulations!");
			if (gpa>= 3.5) {
				System.out.println("You are eligible for scolarship");
			}else {
				System.out.println("you have study harder");
			}
		
		
		}else { System.out.println("get a degree");}
		
		
System.out.println("______________");

float rate=3;
int price=15000;

if (rate < 4.5) {
	System.out.println("user will not buy house");
	if (price > 200000) {
		System.out.println("User will take loan");
	}else {
		System.out.println("User will pay cash");
	}

}else {
	System.out.println("User consider buying");}



	}

}
