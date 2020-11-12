package com.syntax.class20;

public class GrandParDav {
    int money;
    GrandParDav(){
        System.out.println("Constartor from Grand");
    }
    GrandParDav(int money){
        this.money=money;
        System.out.println("onstructer from Grand to init money");
    }
    void print(){
        System.out.println(" i have this money"+money);
    }
}
