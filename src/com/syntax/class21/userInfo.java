package com.syntax.class21;

import java.sql.SQLOutput;

public class userInfo extends userClass{
    String userAdr;
    userInfo(String name,int mobilNum, String userAdr){
        super(name, mobilNum);

        this.userAdr=userAdr;
    }


    void userDetails(){
        System.out.println("User name: "+getName()+" mobile number: "+getMobilNum()+" adress "+userAdr);
    }

    public static void main(String[] args) {
        userInfo obj1=new userInfo("Ella",384848,"Brooklyn");
        obj1.userDetails();
    }
}
