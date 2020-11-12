package com.syntax.class22;

public class MethodOverLoading {
    public void print(){
        System.out.println("Hello");
    }
    public void print(String name,int number){
        for (int i = 0; i < number; i++) {
            System.out.println("hello"+name);

        }
    }
    public void print(int num,String name){
        System.out.println("Hello"+name+"number"+num);
    }
    public void print(int num,String name,String uji){
        System.out.println("Hello"+name+"number"+num+"  "+uji);
    }
    public String print(String name){
        System.out.println("Hello"+name+"number");
        return name;
    }
    public static void main(String[] args) {
        MethodOverLoading obj1=new MethodOverLoading();
        obj1.print();
        obj1.print("frf",3);
        obj1.print(2,"gtg");
        obj1.print(12,"kjhgfghj","hgf");
    }
}
