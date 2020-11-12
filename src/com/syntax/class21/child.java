package com.syntax.class21;

public class child extends Father{
    child(String Property, double money) {
        super(Property, money);
    }

    public static void main(String[] args) {
        child chil1=new child("true",12);
        chil1.printF();
    }
}
