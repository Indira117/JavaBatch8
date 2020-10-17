package com.syntax.class04;

public class Nested {

	public static void main(String[] args) {

		boolean allergy = true, peanutAllergy = true, petAllergy = false, pollenAllergy = false;

		if (allergy) { // true> second if

			System.out.println("Lets do further check");

			if (petAllergy) {
				System.out.println("Please no pets on the house");
			} else {
				System.out.println("that is good you do not have pet allergy");
			}

		} else {
			System.out.println("You are lucky");
		}
 System.out.println("---------------");
 
 			boolean isFriday=false;
 			int date=13;
 			
 			if (isFriday) {
 				if (date==13) {
 					System.out.println("I will watch scary movie");
 				}else {
 					System.out.println("i WILL WATCH pk MOVIE WITH aMIR kHAN");
 				}
 			}else {
 				System.out.println("Today is not Friday, I am studying");}
 			}

}
