package com.syntax.class04;

public class iElseIf {

	public static void main(String[] args) {
		
		int num1=99,num2=99;
		
		if (num1>num2) {
			
			System.out.println(num1+" is bigger than "+num2);
		} else if (num1<num2) {
			System.out.println(num1+" is smaller than "+num2);
		}else {
			System.out.println(num1+" is equal to "+num2);
		
		}
System.out.println("_____________________");
	
	int day=-20;
	
	if (day==1) {
		System.out.println("Today is Monday we have no class");
	} else if (day==2) {
		System.out.println("Todaya is Tuasday we have Manual class");
	}else if (day==3) {
		System.out.println("Today is Wdnesday and we have anual class again");
	}else if (day==4) {
		System.out.println("Today is Thursday and we have Review class");
	}else if (day==5) {
		System.out.println("Today Friday but I class tomarrow and I will prepare");
	}else if (day==6) {
		System.out.println("Today is Saturday, I miss Java Classes");
	}else if (day==7) {
		System.out.println("Today is Sunday, I did a lot of coding");
	}else {
		System.out.println("This is invailid day of a week");
	}
	
	
	
	
	
	
	
	
	}
	

}
