package com.Sunil.properties.polymorphism;

public class ObjectPrint {

    int num;

    public ObjectPrint(int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "ObjectPrint{" +
                "num=" + num +
                '}';
    }

    public static void main(String[] args) {
        ObjectPrint obj = new ObjectPrint(24);
        System.out.println(obj);
    }
}
