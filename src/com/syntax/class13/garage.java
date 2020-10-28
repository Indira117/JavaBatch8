package com.syntax.class13;

public class garage {
    public static void main (String[]args){
      car car1= new car();
      car1.NumberOfDoors=4;

      car1.size=4;
      car1.make="BMV";
      car1.model="i8";

      car car2=new car();
      car2.NumberOfDoors=2;
      car2.size=2;
      car2.color="blue";
      car2.make="lamborghini";
      car2.model="Gallardo";

        System.out.println("car1.make"+car1.make);
        System.out.println("car1.make"+car2.make);

    }
}
