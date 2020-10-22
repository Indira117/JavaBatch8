package com.syntax.class10;

public class ArraysIntro {

	public static void main(String[] args) {
		double average;
		int[] grades=new int[5];
        grades[0]=98;
        grades[1]=80;
        grades[2]=89;
        grades[3]=67;
        grades[4]=77;
        
       average= (grades[0]+grades[1]+grades[2]+grades[3]+grades[4])/5;
       
       System.out.println("average "+average);
       
       
       double[] nameArray;
       nameArray=new double[3];
       nameArray[0]=12.99;
       nameArray[1]=10.89;
       
       System.out.println("value of last element "+nameArray[2]);
       nameArray[2]=5.99;
       System.out.println("value of last element "+nameArray[2]);
       
       System.out.println("------------------------------");
       String[]liquid=new String[4];
       liquid[2]="Water";
       liquid[1]="Tea";
       System.out.println(liquid[0]);
	}

}
