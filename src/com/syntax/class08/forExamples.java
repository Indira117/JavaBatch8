package com.syntax.class08;

public class forExamples {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a;

for (a=1;a<6; a++) {
	System.out.println("inside loop"+a);
}System.out.println("outside loop   "+a);

System.out.println("-----------------");
int result=1;
for (int i=10; i>=1;i-=2) {
	result*=i;
}
 System.out.println(result);
	System.out.println("--------------------");	
 int result1=1;
 for (int c=10; c>=1;c-=2) {
 	result1*=c;
 	 System.out.println(result1);
 }
 // System.out.println(result1);
 			}

}
