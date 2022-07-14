package com.Sunil.singleton;

import com.Sunil.access.A;

public class SubClass extends A {
    public SubClass(int num, String name) {
        super(num, name);
    }

    public static void main(String[] args) {
        SubClass obj = new SubClass(45, "Sunil");
        int n = obj.num;

    }
}
