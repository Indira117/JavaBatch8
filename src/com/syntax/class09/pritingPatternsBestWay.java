package com.syntax.class09;

public class pritingPatternsBestWay {

	public static void main(String[] args) {
		for (int r=1;r<=4;r++) {
			for (int c=1;c<=5;c++) {
				System.out.print(c);
			}System.out.println();
		}

		for (int r=1;r<=4;r++) {
			for (int c=1;c<=5;c++) {
				System.out.print("*");
			}System.out.println();
		}

		for (int r=1;r<=7;r++) {
			for (int c=1;c<=7;c++) {
				
				System.out.print(r);//
			}System.out.println();
		}	
		
		for (int r=1;r<=5;r++) {
			for (int c=7;c>=1;c--) {
				
				System.out.print("?");//
			}System.out.println();
		}	
	}

}
