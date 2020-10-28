package com.syntax.class13;

public class BankApplication {
    public static void main (String[]args){
     Account BurjusAccount=new Account();
    BurjusAccount.accountId="123";
     BurjusAccount.userName="Burju";
     BurjusAccount.password="pass123";
     BurjusAccount.balance=100000;
     BurjusAccount.typeOfAccount="cheking";
     BurjusAccount.limit=125;
boolean isLoggedIn=BurjusAccount.login("Burju","pass123");
 if (isLoggedIn){
     System.out.println("Welcome to Syntax bank");
 }else{
     System.out.println("Invalid user name or password");
 }
double transferAmount=BurjusAccount.transfer(200);
 if (transferAmount==0){
     System.out.println("insufficient balance");
 }else{
     System.out.println(transferAmount+" Transferred");
 }

        System.out.println(isLoggedIn);
        Account IliasAccount=new Account();
        IliasAccount.accountId="123";
        IliasAccount.userName="Burju";
        IliasAccount.password="pass123";
        IliasAccount.balance=100000;
        IliasAccount.typeOfAccount="cheking";
        IliasAccount.limit=125;
    }
}
