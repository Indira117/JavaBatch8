package com.syntax.class20;

public class ParrentDav extends GrandParDav {
    ParrentDav(){
        System.out.println("Constractor from Parent");
    }
    ParrentDav(int money){
        super(money);
    }
}
