package com.syntax.class18;

 class array {


     void arraySum(int []arrayNum){
         int sum=0;
        for (int i=0;i<arrayNum.length;i++){
            sum=sum+arrayNum[i];

        }System.out.println(sum);
    }

    public static void main (String []args){
        array Array =new array();
        int [] set6= {1,2,34};
        Array.arraySum(set6);
    }
}
