package com.syntax.class20;

public class MathTeacher extends teacher {
   int experienceInTeachingAlgebra;
    int experienceInTeachingCalculus;
    int experienceInTeachingProbability;

    MathTeacher(String name, int experience, String degree, String subject) {
        super(name, experience, degree, subject);
    }
    void print(){
        System.out.println("Algebra");
    }
}
