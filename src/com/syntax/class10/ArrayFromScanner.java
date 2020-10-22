package com.syntax.class10;

import java.util.Scanner;

public class ArrayFromScanner {

	public static void main(String[] args) {
		
		Scanner input=new Scanner (System.in);
		String[] names;
		int size;
		System.out.println("How many names?");
		size=input.nextInt();
		names=new String[size];
		
		for(int i=0;i<size;i++) {
			System.out.println("Enter name");
		names[i]=input.next();
		}
		for (int i=0;i<names.length;i++) {
			System.out.print(names[i]+" ");
		}
			
	} 
}
