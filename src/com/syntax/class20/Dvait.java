package com.syntax.class20;

public class Dvait extends ParrentDav {
    Dvait(){
        System.out.println("From Davit Contractor");
    }
    Dvait(int money){
        super (money);

        System.out.println("From Davit Contractor");
    }
    public static void main(String[] args) {
        Dvait davit=new Dvait(1000);
        davit.print();
    }
}
