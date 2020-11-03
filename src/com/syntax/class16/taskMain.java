package com.syntax.class16;

import java.util.Scanner;

public class taskMain {
    public static void main (String[]args) {

        TaskMethods numbers = new TaskMethods();
        numbers.larger(5, 6);


        TaskMethods numberOddEven = new TaskMethods();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num5 = input.nextInt();
        numberOddEven.EvenOdd(num5);

        TaskMethods checkWord = new TaskMethods();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Enter word");
        String word1 = input1.nextLine();
        checkWord.palindrome(word1);


        TaskMethods say = new TaskMethods();
        Scanner input2 = new Scanner(System.in);
        System.out.println("Enter language");
        String word3 = input1.nextLine();
        say.Salem(word3);

        TaskMethods say1 = new TaskMethods();
        Scanner input3 = new Scanner(System.in);
        System.out.println("Enter language");
        String word4 = input1.nextLine();
        say1.Salem1(word3);


    }
}
