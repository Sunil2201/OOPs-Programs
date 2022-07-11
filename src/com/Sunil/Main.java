package com.Sunil;

public class Main {

    public static void main(String[] args) {
        Student sunil = new Student(44, "Sunil Ballani", 85.8f);
        Student Raj = new Student(sunil);
        Student random = new Student();
//        sunil.rno = 92;
//        sunil.name = "Sunil Ballani";
//        sunil.marks = 90.0f;

//        sunil.changeName("Dog Lover");
//        sunil.greeting();

        System.out.println(sunil.rno);
        System.out.println(sunil.name);
        System.out.println(sunil.marks);
        System.out.println(Raj.name);
        System.out.println(random.name);
    }
}
class Student{
    int rno;
    String name;
    float marks;

    void changeName(String newName){
        name = newName;
    }

    void greeting(){
        System.out.println("Hello! My name is " + this.name);
    }

//  Copy Constructor
    Student(Student other){
        this.name = other.name;
        this.rno = other.rno;
        this.marks = other.marks;
    }
//  Default Constructor
    Student(){
//     this is how you can call a constructor from another constructor
//     internally : new Student();
        this(13, "Default Person", 95.0f);
    }
//  Parameterized Constructor
    Student(int rno, String name, float marks){
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
