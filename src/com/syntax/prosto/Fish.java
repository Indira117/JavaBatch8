package com.syntax.prosto;

public class Fish extends Animal{
    public Fish(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }


    public void move() {
        System.out.println("Fish is swimming");
    }

    public void swim(){
        System.out.println("Swimming...");
    }
}
