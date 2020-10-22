package com.syntax.class10;

public class arrayAnotherWay {

	public static void main(String[] args) {
		String[] names= {"Mike","Burju","Jack","Danilo","Brayan","Evgeniya"};
System.out.println(names[3]);

int size=names.length;
System.out.println("Size of name array= "+size);
	
	System.out.println(names[names.length-2]);//Danilo
	int a=2;
	System.out.println(names[a]);//Jack
	
	a+=2;
	System.out.println(names[a]);//Bryan
	System.out.println("------------------------");
	for (int i=0;i<names.length;i++) {
		System.out.println(names[i]);
	}
	System.out.println("------------------------");
	for (int i=0;i<=names.length-1;i++) {
		System.out.println(names[i]);
	}
	
	
	}
	

}
