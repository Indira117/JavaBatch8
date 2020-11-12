package com.syntax.class16;

import java.util.Scanner;

public class HomeWorkMain {
    public static void main(String[]args){
        HomeWorkMethods creatEmailnew= new HomeWorkMethods();//Task1
        Scanner input = new Scanner(System.in);
        System.out.println("Enter name");
        String name1 = input.nextLine();
        System.out.println("Enter Family name");
        String name2 = input.nextLine();
        creatEmailnew.creatEmail(name1,name2);

        HomeWorkMethods checkPrime= new HomeWorkMethods();//task2
        System.out.println("Enter number");
        int number = input.nextInt();
        checkPrime.prime(number);

        HomeWorkMethods checkGrade= new HomeWorkMethods();//Task3
        System.out.println("Enter score");
        int grade1=input.nextInt();
        checkGrade.getGrade(grade1);

    }


}
