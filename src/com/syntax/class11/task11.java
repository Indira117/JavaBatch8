package com.syntax.class11;

public class task11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String [][] array={
	{"Mr.","Mrs.","Ms.","Miss."},
	{"Smith", "Jordan", "Jackson", "Obama"}
	
};

//System.out.println();
   // for (int i=0; i<array.length; i++) {
    //	for(int j=0;j<array[i].length;j++) {
    	
   
System.out.println(array[0][0] +" " + array[1][0]);
System.out.println(array[0][1] +" " + array[1][1]);
System.out.println(array[0][2] +" " +array[1][2]);
System.out.println(array[0][3] +" " + array[1][3]);
	
System.out.println("-----------------------------------");
	
String[][] arrays= {
		{"Jeep", "Ford", "Dodge"},
		{"Audi", "Porsche", "BMW"},
		{"Kia", "Hyundai", "Hyundai sonata"},
		{"Ferrari", "Maserati", "Lamborghini"},
};
	
for (int i=0; i<arrays.length; i++) {
	for(int a=0; a<arrays[i].length; a++) {
		String car=arrays[i][a];
		System.out.print(arrays[i][a] + ",");
		System.out.println(car);
	}System.out.println();

System.out.println("-----------------------------------------------");

for(String [] car1:arrays) {
	for (String car2:car1) {
		System.out.print(car2+"  is car   ");
	}System.out.println();
}



int []number={45,78,12,67,55,89,23,77,88};

for (i=0; i>=number.length; i++){
 
  if ((number[i]%2)==0){
    System.out.println(number[i]);
  }








}


	
	
	
	
	
	}
	

	}}


