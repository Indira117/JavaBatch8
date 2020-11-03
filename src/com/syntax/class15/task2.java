package com.syntax.class15;

import java.util.Scanner;

public class task2 {
    public static void main (String []args) {
        Scanner input =new Scanner (System.in);
        System.out.println("enter word");
        String sen=input.nextLine();

        if (!sen.isEmpty()){
           // if (sen.length()>3 && ((sen.length())%2)!=0){
                System.out.println(sen.charAt(sen.length()/2));
            }
        }
    }

