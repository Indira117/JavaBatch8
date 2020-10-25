package com.syntax.class11;

public class TwoDementionalArray {

	public static void main(String[] args) {
		char [][] $array=new char[3][4];
		//add values to first row
		$array[0][0]='A';
		$array[0][1]='B';
		$array[0][2]='C';
		$array[0][3]='D';
		//2 ROW
		$array[1][0]='W';
		$array[1][1]='X';
		$array[1][2]='Y';
		$array[1][3]='Z';
		//3 ROW
		$array[2][0]='Q';
		$array[2][1]='W';
		$array[2][2]='B';
		$array[2][3]='R';
		
		System.out.println($array[1][3]);//Z
		System.out.println("$size "+$array.length);
		
		System.out.println("-------------------ANoTHER WAY______________");
		
		int [][] NameArray= {
				{10,20,30},
				{1,2,3},
				{100,200,300},
		};
		System.out.println(NameArray[2][1]);//200
		System.out.println(NameArray[0][0]);//10
		System.out.println("size "+NameArray.length);
	}

}
