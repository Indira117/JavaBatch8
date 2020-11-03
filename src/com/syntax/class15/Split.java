package com.syntax.class15;

public class Split {
    public static void main (String[]args){
        String name="Burju maria Qasim";
        String[]arrayName= name.split(" ");
        for (String name1:arrayName){
            System.out.println(name1);
           // System.out.print(name1.toString(arrayName()));
        }


        //name = "Burju*Maria*Qasim";
        //String[] array = name.split("[^A-Z a-z]");
       // System.out.println(Arrays.toString(array));
    }

}
