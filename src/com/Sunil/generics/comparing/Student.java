package com.Sunil.generics.comparing;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;

    @Override
    public String toString() {
        return marks + "";
    }

    @Override
    public int compareTo(Student o) {
//        System.out.println("In compareto method");
        int diff = (int)(this.marks - o.marks);
        return diff;
        // if diff == 0 : means both are equal
        // if diff < 1 : means o is bigger else o is smaller
    }



    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }
}
