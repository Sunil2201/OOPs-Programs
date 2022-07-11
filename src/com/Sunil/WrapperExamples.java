package com.Sunil;

public class WrapperExamples {
    public static void main(String[] args) {
        int a  = 10;
        Integer num = 45;
        final A sunil = new A("Sunil Ballani");
        sunil.name = "A new name";
        System.out.println(sunil.name);

//        When a non-primitive is final, you cannot reassign it
//        sunil = new A("")

        A obj;

        for(int i=0; i<1000000000; i++){
            obj = new A("Random name");
        }
    }

}
class A{
    String name;
    A(String name){
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object is destroyed");
    }
}
