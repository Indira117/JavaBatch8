package com.syntax.class21;

public class userClass {
    private String name;
    private int mobilNum;
    userClass(String name,int mobilNum){
        this.mobilNum=mobilNum;
        this.name=name;
    }

    public int getMobilNum() {  //if var private
        return mobilNum;
    }

    public String getName() {   //if var private
        return name;
    }
}
