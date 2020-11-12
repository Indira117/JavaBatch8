package com.syntax.prosto;


public class Bird extends Animal {
    public Bird(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }

    @Override
    public void move() {
        System.out.println("flapping wings...");
    }

    public void fly(){
        System.out.println("Flying....");
    }
}
