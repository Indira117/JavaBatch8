package com.syntax.class13;


import java.util.Scanner;

public class Account {
    String accountId;
    String userName;
    String password;
    String typeOfAccount;
    double balance;
    double limit;
    boolean isBlocked;
   // Scanner input =new Scanner (System.in);
   // System.out.println("Enter transfer amount")
    double transfer(double transferAmount){
        if (transferAmount<balance){
            return balance=balance-transferAmount;
        }else {return 0;}
    }






    boolean login(String entereduserName, String enteredpassword){
        if(userName.equals(entereduserName)&&password.equals(enteredpassword)){
            return true;
        }else {return false;}
    }
}
