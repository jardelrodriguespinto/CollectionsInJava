package com.arraylist;

import java.util.ArrayList;
import java.util.List;

//How to check if an ArrayList is empty using the isEmpty() method
//How to find the size of an ArrayList suing the size() method
//How to modify the element at a particular index is an ArrayList using
// the set() method
public class AccessElementsFromArrayListExample {
    public static void main(String[] args) {
        List<String> topProgramLanguage = new ArrayList<>();
        topProgramLanguage.add("Java");
        topProgramLanguage.add("C#");
        topProgramLanguage.add("Python");
        topProgramLanguage.add("C++");

        //check if an ArrayList is empty
        System.out.println("Is the topProgramLanguage list is empty? : " + topProgramLanguage.isEmpty());
        // find the size of an ArrayList
        System.out.println("Here are the top " + topProgramLanguage.size()
        + " programming language in the world!!!");
        //Retrieve the element at a given index
        String bestProgrammingLanguages = topProgramLanguage.get(3);
        System.out.println("bestProgrammingLanguages -> " + bestProgrammingLanguages);
        //Modify the element in a given index
        topProgramLanguage.set(3, "Rust");
        System.out.println(topProgramLanguage);
    }
}
