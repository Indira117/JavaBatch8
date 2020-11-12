package com.syntax.class19;

public class emploeesTester {
    public static void main(String[] args) {
        emploees object1=new emploees();
        object1.age=200;
        object1.name="salma";
        object1.grade='M';
        System.out.println(object1.age);

        emploees object2=new emploees(34,"Vlad",'a');
        object2.print();

    }
}
