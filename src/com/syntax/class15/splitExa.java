package com.syntax.class15;

public class splitExa {
public static void main (String[]args){
    String subject="I love Java and I want to learn more";
    //Using space “ ” as a delimiter Split returns an array of Strings
    String [] splittedSub = subject.split(" ");
    System.out.println(splittedSub.length);
    //Looping through the array to get all the values
    for (int i = 0; i< splittedSub.length; i++)
    {System.out.println(splittedSub[i]);}

}

}

