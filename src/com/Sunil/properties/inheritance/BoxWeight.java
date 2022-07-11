package com.Sunil.properties.inheritance;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(double weight) {
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w); // what is this? call the parent class constructor
//        used to initialize values present in parent class
        this.weight = weight;
    }
}
