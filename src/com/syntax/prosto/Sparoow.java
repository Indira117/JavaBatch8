package com.syntax.prosto;

public class Sparoow extends Bird implements Flyable{
    public Sparoow(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }
    public void fly(){
        System.out.println("Sparrow flying high...");
    }
}
