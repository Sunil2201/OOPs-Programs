package com.Sunil.enumExamples;

public class Basic {
    enum Week{
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // These are enum constants
        // public, static & final
        // since its final, you can't create child enums
        // type is Week


        Week() {
            System.out.println("Constructor called for " + this);
        }
        // this is not public or protected, only private or default
        // why? we don't want to create new objects
        // this is not the enum concept, thats why

        // internally : public static final Week Saturday = new Week();
    }

    public static void main(String[] args) {
        Week week;
        week = Week.Saturday;

//        for(Week day : Week.values()){
//            System.out.println("Today is " + day);
//        }
//        System.out.println(week.ordinal());
    }
}
