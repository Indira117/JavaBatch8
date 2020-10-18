package com.syntax.class08;

public class task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int result=0, result1=0;		
		for (int l=1;l<50; l++ ) {
			if ((l%2)==0) {
			result+=l;	
			
		}
			}System.out.println("result even "+result);
		System.out.println("");
		for (int b=1;b<50; b++) {
			if ((b%2)!=0)
				result1+=b;		
			
		}System.out.println("result odd "+result1);
	}
	

}
