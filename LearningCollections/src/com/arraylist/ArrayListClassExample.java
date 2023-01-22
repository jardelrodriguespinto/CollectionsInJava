package com.arraylist;

import java.util.ArrayList;
import java.util.List;

// How to create an ArrayList using the ArrayList() constructor
//Add new elements to an ArrayList using the add() method
public class ArrayListClassExample {
    public static void main(String[] args) {
        //created arraylist object
        List<String> fruits = new ArrayList<>(5);
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("orange");
        System.out.println(fruits);

    }
}
