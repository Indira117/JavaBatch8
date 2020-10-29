package com.syntax.class14;

public class myLaptop {
    public static void main (String[]args){
        laptop myLaptop= new laptop();
        myLaptop.make="Mac";
        myLaptop.model="pro 16";
        myLaptop.storage=1;
        myLaptop.Ramcapacity=16;
        myLaptop.color="color";
        myLaptop.proccesor="Core i7";
        myLaptop.GPU="Nvida rtx 30390 12 gb ddr6x";
        myLaptop.playMovies();
        myLaptop.browseInternet();
        myLaptop.makeVideoCall("7845859486054-Alma");
        myLaptop.getModel();
       String model=myLaptop.getModel();
        System.out.println(model);
        System.out.println(myLaptop.getModel());//second way
        System.out.println(myLaptop.getRamcapacity());
        System.out.println(myLaptop.upgradeRam(23));
    }
}
