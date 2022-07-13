package com.Sunil.properties.inheritance;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box(6, 7, 8);
        Box box2 = new Box(box1);
//
//        System.out.println(box1.l + " " + box1.w + " " + box1.h);
//        System.out.println(box2.l + " " + box2.w + " " + box2.h);
//        BoxWeight box3 = new BoxWeight(23);
//        BoxWeight box4 = new BoxWeight(2,3,4,5);

//        Box box5 = new BoxWeight(4,5,7,9); // The type of reference variables determine what variables
//                                                            // can be accessed
//        System.out.println(box5.w);
        // there are many variables in both parent and child class
        // you are given access to variables that are in ref type i.e. Boxweight
        // hence, you should have access to weight variable
        // this means that once you are trying to access are initialized
        // but here, when the object itself is of the parent class, how will you call the constructor of the child class
        // this is why error
//        BoxWeight box6 = new Box(2,3,4);


//        BoxPrice box = new BoxPrice(5, 10, 30);
//        Box.greeting();

        Box box = new BoxWeight();
        box.greeting();
    }
}
