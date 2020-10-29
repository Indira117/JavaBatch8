package com.syntax.class14;

public class task {
    public static void main (String[]args){

        String Username="Indira";
         String       Password="1234Indira";
         String ConfirmPassword="1234Indira";
        if (Username.isEmpty()&& Password.isEmpty()){
            System.out.println("Username and Password cannot be empty");}
         else if  (Password.length()<8){
            System.out.println("Password is too short");}

         else if (Password.contains("Indira")){
            System.out.println("Password contain username");}

        else if ((Password!=(ConfirmPassword))){
            System.out.println("Password do not match");}
        else {
            System.out.println("Your username and password has been created");
        }

    }

}
