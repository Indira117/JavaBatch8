package com.syntax.class20;

public class NoStatNoVoidMain {
    public static void main(String[] args) {
       // NoStatNoVoid.add10(100); error
        NoStatNoVoid myVar; //data NoStatNoVoid var-myVar(adress to obj), instatance
        myVar=new NoStatNoVoid();
        myVar.add10(100);
    }
}
