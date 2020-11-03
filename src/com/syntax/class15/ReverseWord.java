package com.syntax.class15;

import java.util.Arrays;

public class ReverseWord {
    public static void main (String[]args){
        String sentence="What did u use the most";
        String []stringArray=sentence.split(" ");
        System.out.println(Arrays.toString(stringArray));

        for (int i=0;i<stringArray.length;i++){
            StringBuilder StrBulName =new StringBuilder(stringArray[i]);
            System.out.println(StrBulName);
           stringArray[i]=StrBulName.reverse().toString();
            System.out.println(stringArray[i]);
        }
        System.out.println(Arrays.toString(stringArray));

    }
}
