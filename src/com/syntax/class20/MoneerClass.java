package com.syntax.class20;

public class MoneerClass extends ParentClass{
    int money;
   MoneerClass(int money){
super(money);
       System.out.println("from child");
   }
    void marry() {
        super.marry();
        System.out.println("i will marry katarina "+super.money);
    }

    public static void main(String[] args) {
        MoneerClass mon1=new MoneerClass(13);
        mon1.marry();
    }
}
