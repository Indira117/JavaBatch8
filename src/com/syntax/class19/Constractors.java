package com.syntax.class19;

public class Constractors {
     int number;
    String name;
     char character;
    double decimalNumber;
    Constractors(){
        System.out.println("I will be called everytime you create an object of this class");
    }
    Constractors(int numberValue, String nameValue,char characterValue ){
        System.out.println("i am not useless constarctor i am initializing you fields");
        number=numberValue;
        name=nameValue;
        character=characterValue;
    }
    void print(){
        System.out.println("Number "+number+" name "+name+" caharacter "+character);
    }

    public static void main(String[] args) {
    Constractors constractors = new Constractors();
        Constractors constractors2 = new Constractors(100, "Vlad", 'A');
   constractors2.print();
    //constractors.character='A';
    }
}
