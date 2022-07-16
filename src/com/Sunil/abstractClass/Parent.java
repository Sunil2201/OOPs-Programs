package com.Sunil.abstractClass;

abstract public class Parent {
    int age;

    public Parent(int age) {
        this.age = age;
    }

    // We cannot create abstract constructors
    // abstract Parent(){};

    static void hello(){
        System.out.println("Hey");
    }

    void normal(){
        System.out.println("This is a normal method");
    }

    abstract void career();
    abstract void partner();
}
