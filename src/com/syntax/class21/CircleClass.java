package com.syntax.class21;

import java.util.Scanner;

public class CircleClass extends ShapeClass{

    CircleClass(int radius) {
        super(radius);
    }

    void calcul(){

        System.out.println("Circle area "+(3.14*(radius*radius)));
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter radius");
        radius=input.nextInt();
        CircleClass obj1=new CircleClass(input.radix());
        obj1.calcul();
    }
}
