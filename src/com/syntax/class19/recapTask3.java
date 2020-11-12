package com.syntax.class19;

public class recapTask3 {

    //Create a method that will accept a String as a parameter and
    // return a new String that consist only of vowels. Method should be available inside
    // the class only where it was declared and executed by calling it is name.
 private String vowlsOnly(String name){
     name.replaceAll("[^AEIOUaeiou]","");
     return name;
 }

    public void main(String[] args) {
        System.out.println(vowlsOnly("good morning"));
    }
}
