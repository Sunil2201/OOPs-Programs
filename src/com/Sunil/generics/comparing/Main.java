package com.Sunil.generics.comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student sunil = new Student(22, 90.89f);
        Student rohit = new Student(33, 97.77f);
        Student ramesh = new Student(23, 92.71f);
        Student suresh = new Student(13, 60.37f);
        Student pranav = new Student(43, 89.32f);

        Student[] list = {sunil, rohit, ramesh, suresh, pranav};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));

//        if(sunil.compareTo(rohit) < 0){
//            System.out.println("Rohit got more marks");
//        }
    }
}
