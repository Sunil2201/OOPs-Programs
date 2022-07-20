package com.Sunil.properties.polymorphism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Shapes circle = new Circle();
        circle.area();
        Square square = new Square();
    }
}
