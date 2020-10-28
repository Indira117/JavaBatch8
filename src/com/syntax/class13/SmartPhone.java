package com.syntax.class13;

public class SmartPhone {
    String brand;
    int size;
    String color;
    String model;

    //or first public

    void call(String phoneNumber){
        System.out.println("Calling "+phoneNumber);
    }
    void text(){
        System.out.println(brand + " sending text");
    }
    void pics(){
        System.out.println(brand+" taking picture");
    }
}
