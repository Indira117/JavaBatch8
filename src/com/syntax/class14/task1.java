package com.syntax.class14;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        String username, password,confirmdPassword;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter username");
       username= input.nextLine();
        System.out.println("Please enter password");
        password=input.nextLine();
        System.out.println("Please enter confirm password");
        password=input.nextLine();
        confirmdPassword=input.nextLine();
        if (username.isEmpty()||password.isEmpty()){
            System.out.println("Username and Password cannot be empty");
        }else {if (password.length()<8) {System.out.println("Password is too short");}
        else{ if (password.contains(username)){
            System.out.println("Password contain username");
        }else{if (!password.equals((confirmdPassword))){
            System.out.println("Password do not match");}else{
            System.out.println("Your username and password has been created");
        }
        }
        }}
    }
}