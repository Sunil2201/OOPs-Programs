package com.Sunil.properties.polymorphism;

public class Circle extends Shapes{
    @Override // this is called annotation
    void area(){
        System.out.println("Area is pie * r * r");
    }
}
