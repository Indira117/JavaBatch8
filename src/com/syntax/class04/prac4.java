package com.syntax.class04;

public class prac4 {

	public static void main(String[] args) {
		boolean assignment= true;
		int score=56;
		
		if (assignment) {
			if (score> 90) {
				System.out.println("You did great!!!");
			}else if (score>80) {
				System.out.println("You did good!");
			}else if (score>70) {
				System.out.println("Probably you need to study more");
			}else {
				System.out.println("Good job for trying but you must study");
			}
		}else {
			System.out.println("You should always complete all assignments");
		}
				
			
	}

}
