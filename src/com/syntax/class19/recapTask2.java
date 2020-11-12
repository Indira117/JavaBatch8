package com.syntax.class19;

public class recapTask2 {
    public static String reverseString(String string)
    //static-accessible by class name
    {
        StringBuilder stringBuilder=new StringBuilder(string);
       return stringBuilder.reverse().toString();
    }
}
