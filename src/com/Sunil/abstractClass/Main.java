package com.Sunil.abstractClass;

public class Main {
    public static void main(String[] args) {
        Son son = new Son(30);
        son.career();
        son.partner();
        son.normal();

        Daughter daughter = new Daughter(26);
        daughter.career();
        daughter.partner();

        // We cannot create objects of an abstract class
        //Parent mom = new Parent();
    }
}
