package com.Sunil.generics;

import java.util.Arrays;

// here T should either be number or its subclass
public class WildcardExample<T extends Number> {

    private Object[] data;
    private static int DEFAULT_SIZE = 10;
    private int size = 0; // also working as an index value

    public WildcardExample() {
        data = new Object[DEFAULT_SIZE];
    }

    public void add(T num){
        if(isFull()){
            resize();
        }
        data[size++] = num;
    }


    private void resize() {
        Object[] temp = new Object[data.length * 2];

        // copy the current items in new array
        for (int i = 0; i < data.length ; i++) {
            temp[i] = data[i];
        }

        data = temp;
    }

    private boolean isFull() {
        return size == data.length;
    }

    public T remove(){
        T removed = (T)(data[--size]);
        return removed;
    }

    public T get(int index){
        return (T)(data[index]);
    }

    public int size(){
        return size;
    }

    public void set(int index, T value){
        data[index] = value;
    }

    @Override
    public String toString(){
        return "CustomArrayList{" +
                "data=" + Arrays.toString(data) +
                ", size=" + size +
                '}';
    }

    public static void main(String[] args) {
        WildcardExample list = new WildcardExample();
//        list.add(3);
//        list.add(4);
//        list.add(5);

//        for (int i = 0; i <14 ; i++) {
//            list.add(2*i);
//        }

//        System.out.println(list);
        WildcardExample<Integer> list2 = new WildcardExample<>();
        list2.add(2);
        list2.add(3);
        list2.add(4);
        System.out.println(list2);
    }
}
