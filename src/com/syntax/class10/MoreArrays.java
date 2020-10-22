package com.syntax.class10;

public class MoreArrays {

	public static void main(String[] args) {
		
		char[] grades= {'A','B','D','C','E','F','G'};
		char sendValue=grades[1];
		
		String[] names= {"Mike","Burju","Jack","Danilo","Brayan","Evgeniya"};
		String secondVal=names[1];
		for (int i=0;i<grades.length;i++) {
			char ValueFromArray=grades[i];
			System.out.println(ValueFromArray);
		}
	}

}
