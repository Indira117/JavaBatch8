package com.syntax.rockstar;

public class FibonacciLampkin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int numberLimit=10;
   long[] seriesOfnumber=new long[numberLimit];
   seriesOfnumber[0]=0;
   seriesOfnumber[1]=1;
   
   for (int i=2; i<numberLimit;i++) {
	   seriesOfnumber[i]=seriesOfnumber[i-1]+seriesOfnumber[i-2];
	   
   }System.out.println("The first "+numberLimit+" numbers of the Fibonacci Sequence");
   for (int i=0;i<numberLimit;i++) {
	   System.out.print(seriesOfnumber[i]+ " ");
   }
	}

}
