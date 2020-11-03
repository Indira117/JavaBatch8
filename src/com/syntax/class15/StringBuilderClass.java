package com.syntax.class15;

public class StringBuilderClass {
    public static void main (String[]args){
        StringBuilder nameBuilder=new StringBuilder("Hello");
        nameBuilder.append(" world");

        String string="Hello";
        string.concat("world");
        System.out.println(string);
        System.out.println(nameBuilder);


    }
}
