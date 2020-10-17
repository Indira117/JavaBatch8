package com.syntax.class03;

public class RelationOperators {

	public static void main(String[] args) {
		int a=10, b=15;
		
		System.out.println(a>b); //false
		System.out.println(a<b);//true
		System.out.println(a==b);//false
		System.out.println(a!=b);//true
		
		
		int x=100, y=90;
		boolean result=x>y;
		System.out.println(result);
		
		result=x==y;
		System.out.println(result);
		
		System.out.println(x=y);//90
		
		boolean result1=x==y;
		System.out.println(result1);
		
		byte num=10,num1=10;
		boolean boo =num>=num1;//true
		System.out.println("Result of boo "+boo);
		
		
	}

}
