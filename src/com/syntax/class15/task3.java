package com.syntax.class15;

public class task3 {
    public static void main(String[] args) {


        String day = "Sunday";
        char[] sunday = new char[day.length()];
        for (int i = 0; i < day.length(); i++) {
            sunday[i] = day.charAt(i);
        }
        for (int i = sunday.length - 1; i >= 0; i--) {
            System.out.print(sunday[i]);
        }
    }
}