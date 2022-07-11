package com.Sunil.staticExamples;

public class Main {
    public static void main(String[] args) {
        Human sunil = new Human(21,"Sunil Ballani", 5000, false);
        Human rahul = new Human(34,"Rahul", 15000, true);

        System.out.println(Human.population);
        System.out.println(Human.population);

//        greeting();
        Main funn = new Main();
        funn.fun2();
    }
    // This is not dependent on objects
    static void fun(){
//        greeting();// you can't use this because this requires an instance
        // but the function you are using it in does not depend on instances

//      you cannot access non-static stuff without referencing their instances in
//        a static context


//      hence, here I am referencing it
        Main obj = new Main();
        obj.greeting();
    }
    // We know that something which is not static belongs to an object

    void fun2(){
        greeting();
    }
    void greeting(){
        System.out.println("Hello world");
    }
}
