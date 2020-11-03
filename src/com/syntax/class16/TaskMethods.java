package com.syntax.class16;

public class TaskMethods {

    public void larger(int num1, int num2) {
        if (num1 > num2) {
            System.out.println(num1 + " larger then " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " larger then " + num1);
        } else {
            System.out.println("equal");
        }
    }

    public void EvenOdd(int num3) {
        if (num3 % 2 == 0) {
            System.out.println(num3 + " even number");
        } else {
            System.out.println(num3 + " odd number");
        }
    }

    public void palindrome(String word) {
        String reverseWord = new StringBuilder(word).reverse().toString();
        if (word.equalsIgnoreCase(reverseWord)) {
            System.out.println("word is a palindrome");
        } else {
            System.out.println("word is not a palindrome");
        }
    }
    public void isStringpalindrome(String string) {
        int i = 0;
        int j = string.length() - 1;
        while (i < j) {

            if (string.charAt(i) != string.charAt(j)) {
                System.out.println("String is not palindrome");
                return;
            }
            i++;
            j--;
        }
        System.out.println("String is a palindrome");}

    public void Salem(String word2) {

        if (word2.equalsIgnoreCase("english")) {
            System.out.println("Hello");
        } else if ((word2.equalsIgnoreCase("russian"))) {
            System.out.println("privet");
        } else if ((word2.equalsIgnoreCase("kazakh"))) {
            System.out.println("salem");
        }
    }
    static void Salem1(String word7) {

        switch (word7){
            case "english":
                System.out.println("hello!");
                break;
            case "kazakh":
                System.out.println("salem!");
                break;
            case "russian":
                System.out.println("privet!");
                break;
            default:
                System.out.println("not supported!");
        }
    }

}