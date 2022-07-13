package com.Sunil.properties.inheritance;

public class Box {
    double l;
    double h;
    double w;
    double weight;

    Box(){

       // super(); Object class

        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    static void greeting(){
        System.out.println("Hey, I am in Box class. Greetings!");
    }

    //cube
    Box(double side){
        this.l = side;
        this.h = side;
        this.w = side;
    }
    Box(double l, double h, double w) {
        System.out.println("Box class constructor");
        this.l = l;
        this.h = h;
        this.w = w;
    }
    Box(Box old){
        this.h = old.h;
        this.l = old.l;
        this.w = old.w;
    }
    public void information(){
        System.out.println("Running the box");
    }
}
