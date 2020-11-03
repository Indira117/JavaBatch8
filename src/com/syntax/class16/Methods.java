package com.syntax.class16;

import com.syntax.class13.Dog;

public class Methods {
    public static void main (String[]args){
        System.out.println("First "+addNumbers());
        System.out.println(addNumbers1(10,20));
        System.out.println(addNumbers1(20,30));
        System.out.println(addNumbers1(50,20));
    }
    public static int addNumbers(){
        return 10+20;
    }
    public static int addNumbers1(int num1,int num2){
        return num1+num2;
    }

}
