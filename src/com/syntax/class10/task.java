package com.syntax.class10;

public class task {

	public static void main(String[] args) {
		char[] grades= {'A','B','D','C','E','F'};
System.out.println("GRADE "+ grades[1]);

System.out.println("-----------------");

char[]grades1=new char[6];

grades1[0]='A';
grades1[1]='B';
grades1[2]='C';
grades1[3]='D';
grades1[4]='E';
grades1[5]='F';
System.out.println("GRADE "+grades1[1]);

System.out.println("---------------------");
String[] names= {"Alan","Mary","Vanessa"};
System.out.println(names[2]);
System.out.println("----------------------");
String[]names1=new String[3];
names1[0]="Alan";
names1[1]="Mary";
names1[2]="Vanessa";
System.out.println(names1[0]);
	
String[] sen= {"Java ","Saturday ","day ","coding ","is "};
System.out.println(sen[1]+sen[4]+sen[0]+sen[3]+sen[2]);

	
	
	
	}
	

}
