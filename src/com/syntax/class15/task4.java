package com.syntax.class15;

public class task4 {
    public static void main (String[]args){


    String sentence = "I love Java!";
System.out.println(sentence.replaceAll("\\s+", ""));

//You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
//How would you find out how many sentences are in that String
        String sen="Is it saturday? Is it raining? Do we have a Java Class today?";
        System.out.println(sen.replaceAll("[\\sA-Za-z0-9]","").length());

        // Create a String that should be combination of letters, numbers and special characters.
        // Find out how many alpha characters are there in the String


        String sen1=" Is 12it saturday? Is it raining? Do 22we hav22e a Java Class today?  ";
        System.out.println(sen1.replaceAll("[^0-9]",""));

        System.out.println(sen1.replaceAll("[^0-9]","").length());

}}
