package com.syntax.prosto;

public class Chicken extends Bird{

    public Chicken(int age, String gender, int weightInlbs) {
        super(age, gender, weightInlbs);
    }
    public void fly(){ //overriding the defined in bird=replace
        System.out.println("not able to fly");
    }
}
