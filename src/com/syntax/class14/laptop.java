package com.syntax.class14;

public class laptop {
    String make;
    String model;
    int storage;
    int Ramcapacity;
    String color;
    String proccesor;
    String GPU;
    void playMovies(){
        System.out.println("Playing movies");
    }
    void browseInternet(){
        System.out.println("browsing the Internet");
    }
    void makeVideoCall(String contact){
        System.out.println("Video calling to "+contact);
    }
public String getModel(){
        return model;
}
int getRamcapacity(){
        return Ramcapacity*2;
}
int upgradeRam(int newRamunit){
        return newRamunit*Ramcapacity;
}
}
