package com.Sunil.interfaces;

public class Implementation implements ExampleA, ExampleB {
    @Override
    public void run() {
        System.out.println("Hey!! See I am running");
    }

    public static void main(String[] args) {
        Implementation a = new Implementation();
        a.run();
    }
}
