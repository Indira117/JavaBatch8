package com.syntax.class09;

public class ArrayDemo {

	public static void main(String[] args) {
		
		int[] num =new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		num[4]=50;
		
		System.out.println(num[3]);
		System.out.println(num[1]+num[4]);
		
		//to change elements
		num[4]=100;
		System.out.println(num[4]);
		String[] array=new String[4];
		array [0]= "Hello";
	}

}
