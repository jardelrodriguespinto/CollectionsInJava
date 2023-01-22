package com.arraylist;

import java.util.ArrayList;
import java.util.List;

//remove
//removeAll()
//clear()
public class RemoveElementsArrayList {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("apple");
        fruits.add("pinapple");
        fruits.add("grapes");
        fruits.add("grapes");
        System.out.println(fruits);
        fruits.remove("apple");
        System.out.println("After removing element index 4 =>" + fruits);
        // using this approach to delete repeated elements
//        fruits.removeAll(List.of("grapes"));
//        System.out.println("After removing all the elements =>" + fruits);
        List<String> subFruitsElements = new ArrayList<>();
        subFruitsElements.add("apple");
        subFruitsElements.add("banana");
        subFruitsElements.add("grapes");
        fruits.removeAll(subFruitsElements);
        System.out.println("After removing all the elements => " + fruits);

        fruits.clear();
        System.out.println(fruits);
    }
}
