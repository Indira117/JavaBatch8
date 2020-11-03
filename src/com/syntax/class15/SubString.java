package com.syntax.class15;

public class SubString {
    public static void main(String[]main){
        String name="Good morning world";
        System.out.println(name.substring(5)); //ignoring first 8 char
        System.out.println(name.substring(0));//redundant
        //System.out.println(name.substring(-1));//error
        System.out.println(name.substring(5,13)+name.substring(0,4));
    }
}
