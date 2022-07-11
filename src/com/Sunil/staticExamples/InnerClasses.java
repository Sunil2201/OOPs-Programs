package com.Sunil.staticExamples;

public class InnerClasses {
    static class Test{
//        static String name;
        String name;
        public Test(String name){
//            Test.name = name;
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sunil Ballani");
        Test b = new Test("Rohit Sharma");

//        System.out.println(Test.name);
//        System.out.println(Test.name);
//        System.out.println(a.name);
//        System.out.println(b.name);
        System.out.println(a);
    }
}
