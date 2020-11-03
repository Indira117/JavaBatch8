package com.syntax.class16;

public class HomeWorkMethods { //Task1
    public void creatEmail(String name, String Fname){
        System.out.println(name.concat(Fname)+"@gmail.com");
    }
    public void prime(int number){  //Task2
        int i, k = 0, num = 0;
        k = number / 2;
        if (number == 0 || number == 1) {
            System.out.println(number + " is not a prime number.");
        } else {
            for (i = 2; i <= k; i++) {
                if (number % i == 0) {
                    System.out.println(number + " is not a prime number.");
                    num = 1;
                    break;
                }
            }
            if (num == 0) {
                System.out.println(number + " is a prime number.");
            }
        }
    }
public void getGrade(int grade){ //Task3
        if(grade>=90){
            System.out.println("Grade A");}
            else if (grade >=80 && grade<90) {
                System.out.println("Grade B");
            }else if (grade >=70 && grade<80) {
                System.out.println("Grade C");
            }else if (grade >=50 && grade<70) {
                System.out.println("Grade D");
            }else {
            System.out.println("Grade F");
        }
}
}
