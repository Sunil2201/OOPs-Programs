package com.Sunil.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }

    public BoxWeight(double weight) {
        this.weight = weight;
    }

//    @Override
    static void greeting(){
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this? call the parent class constructor
//        used to initialize values present in parent class

//        System.out.println(super.weight);

        this.weight = weight;
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight = weight;
    }

    public BoxWeight(BoxWeight other){
        super(other);
    }
}
