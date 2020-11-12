package com.syntax.class19;

public class students {
    String nameStud;

    int gradeSub1,gradeSub2,gradeSub3;

    students(String valName, int sub1, int sub2, int sub3){
        nameStud=valName;
        gradeSub1=sub1;
        gradeSub2=sub2;
        gradeSub3=sub3;

    }
void printAver(){
    System.out.println(nameStud+" Average Grade "+ ((gradeSub3+gradeSub2+gradeSub1)/3));
}
public students(int gradeSub1){
        //a method initializes instance variables
        this.gradeSub1=gradeSub1;
}
}
