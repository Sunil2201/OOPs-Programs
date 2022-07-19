package com.Sunil.cloning;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Human sunil = new Human(21, "Sunil Ballani");
        // It's gonna take time because we are using the new keyword
//    Human twin = new Human(sunil);

        Human twin = (Human) sunil.clone();
        System.out.println(twin.age + " " + twin.name);
        System.out.println(Arrays.toString(twin.arr));

        twin.arr[0] = 100;

        System.out.println(Arrays.toString(sunil.arr));
    }
}
