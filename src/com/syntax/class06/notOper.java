package com.syntax.class06;

public class notOper {

	public static void main(String[] args) {
		
		boolean b=!true;  //reverse to false
		System.out.println(b);
		
		boolean anotherBoolean=false;
		System.out.println(anotherBoolean);
System.out.println("________________________________________________");
		boolean isCold=false;
		
		if (!isCold)//reverse to true
			{
			System.out.println("I am going to the beach");
		}
		System.out.println("----------------------------------------");
		
		String day="Monday";
		
	if (!(day.equals("Sunday") || day.equals("Saturday"))) {
		System.out.println("I am going to work");
	}
		
	}

}
