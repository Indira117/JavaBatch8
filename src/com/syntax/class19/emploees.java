package com.syntax.class19;

public class emploees {
    int age;
    String name;
    char grade;
    emploees(){
        System.out.println("I will be called every time you create object");
    }



    emploees(int ageValue, String nameValue, char charracterValue){
        System.out.println("i'm not useless constractor");
        if (ageValue>60|ageValue<18){
            System.out.println("you should not be working");
        }else{
            age=ageValue;
            name=nameValue;
            grade=charracterValue;
        }
        if (nameValue.length()>25){
            System.out.println("Please use short name");
        }
    }
    void print(){
        System.out.println("number "+age+" name "+name+" character "+grade);
    }
}
