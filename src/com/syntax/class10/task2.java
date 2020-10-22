package com.syntax.class10;

public class task2 {

	public static void main(String[] args) {
		String[] cars= {"BMV","Mersedes","Jeep","Chevrolet","Toyota","Dodje"};
		for (int i=0;i<cars.length;i++) {
			System.out.print(cars[i]+" ");
		}
		System.out.println("---------------------");
		System.out.println("enchanced for Loop");
		
		for(String car:cars) {
			System.out.println(car);
		}
		System.out.println("-------------------------");
		int[] numbers= {10,10,90,600,89};
		for (int num:numbers) {
			System.out.println(num);
		}
		boolean[] arrayOfBoolean= {true,false,true,true};
		for(boolean boo:arrayOfBoolean) {
			System.out.println(boo);
		}
	}

}
