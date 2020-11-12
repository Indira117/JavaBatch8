package com.syntax.class20;

public class Task3 {
    String name;
    int age;
    double salary;

    /*Write a program  that will have 4 different access levels of constructors
     and create 3 objects of this class: 1 - inside same class; 2 - from outside the class;
      3 - from different class inside different package  and observe result.
     */
    private Task3(String name){ //class
        //create obj of my class from the same class
        this.name=name;
    }
    Task3(int age){ //package
        this.age=age;
    }
   public Task3(double salary){//evrywhere
        this.salary=salary;
    }

    public static void main(String[] args) {
        //Task3 task1=new Task3(); //it doesnt provide default if you provided yours
                                 //Ce as now Java will not create the default constractor

        Task3 task1=new Task3("name11");
        System.out.println(task1.name);
       // System.out.println(task1.age);
      //  System.out.println(task1.salary);

        Task3 task2=new Task3(12);
       // System.out.println(task1.name);
        System.out.println(task1.age);
      //  System.out.println(task1.salary);

        Task3 task6=new Task3(45.7);
      //  System.out.println(task1.name);
        //System.out.println(task1.age);
        System.out.println(task1.salary);

    }
}
