package com.syntax.class21;

public class grandFather {
    String Property;
    double money;
    grandFather (String Property,double money){
        this.Property=Property;
        this.money=money;
    }
    public void printF(){
        System.out.println("Property from Grand Father"+Property+" Money from GrandFather"+money);
    }
}
