package com.syntax.class14;

public class EqualsMethod {
    public static void main (String[]args){

        String name="sabeen", name1="Eduard", name2="sabeen";

        System.out.println(name.equals(name1));
        System.out.println(name1.equals(name2));
        System.out.println(name.equals(name2));

        name=new String("sabeen");
        name1=new String("eduard");
        name2=new String("sabeen");

    }
}
