package com.Sunil.singleton;

import com.Sunil.access.A;

public class Main {
    public static void main(String[] args) {
        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();
        Singleton obj3 = Singleton.getInstance();

//        All 3 reference variables are pointing towards the same object
        A a = new A(25, "Sunil");
        a.getNum();
    }
}
