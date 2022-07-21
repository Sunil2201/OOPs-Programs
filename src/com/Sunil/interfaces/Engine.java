package com.Sunil.interfaces;

public interface Engine {

    static final int PRICE = 78000;
    static void func(){
        System.out.println("This is a static function");
    }
    void start();
    void stop();
    void acc();
}
