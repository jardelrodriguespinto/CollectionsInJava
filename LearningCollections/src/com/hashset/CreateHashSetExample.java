package com.hashset;

import java.util.HashSet;
import java.util.Set;

public class CreateHashSetExample {
    public static void main(String[] args) {
        //create a HashSet using the HashSet() constructor
        //unordered collection
        Set<String> programmingLanguages = new HashSet<>();
        //add new elements to it using the add() method
        programmingLanguages.add("Java");
        programmingLanguages.add("C++");
        programmingLanguages.add("C");
        programmingLanguages.add("Python");
        programmingLanguages.add("Scala");
        programmingLanguages.add("JavaScript");

        System.out.println(programmingLanguages);
        // adding duplicate element
        programmingLanguages.add("Scala");
        System.out.println(programmingLanguages);


    }
}
