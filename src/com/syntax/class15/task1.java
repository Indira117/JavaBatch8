package com.syntax.class15;

import java.util.Scanner;

public class task1 {
    public static void main (String []args) {
        String momN,dadN,gender,babyName;

        Scanner input =new Scanner (System.in);
        System.out.println("Mom's first name?");
        momN=input.nextLine();
        System.out.println("Dad's first name?");
        dadN=input.nextLine();
        System.out.println("Boy or girl?");
        gender=input.nextLine();

        if (gender.equalsIgnoreCase("boy")){
            System.out.println(dadN.substring(0,3)+momN.substring(2));
        }else{ System.out.println(momN.substring(0,2)+dadN.substring(3));}

        if (gender.toLowerCase().startsWith("b")){
            babyName=(dadN.substring(0,dadN.length()/2))+(momN.substring((momN.length()/2)));
            System.out.println("2 way  "+babyName);
        }else if (gender.toLowerCase().startsWith("g")){
            babyName=((momN.substring(0,momN.length()/2))+dadN.substring((dadN.length()/2)));
            System.out.println("2 way  "+babyName);
        }else {
            System.out.println("------");
        }
    }}
