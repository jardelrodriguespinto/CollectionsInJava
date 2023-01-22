package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListSearchIterationExample {
    public static void main(String[] args) {

        LinkedList<String> programmingLanguages = new LinkedList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("C#");
        programmingLanguages.add("Rust");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Clojure");
        programmingLanguages.add("Python");
        programmingLanguages.add("Rust");

        //checking if the list contain a certain element
        System.out.println(programmingLanguages.contains("Objective-C"));
        boolean result = programmingLanguages.contains("Python");
        System.out.println(result);

        //Find the index of the first occurence of an element is the LinkedList
        int index =  programmingLanguages.indexOf("Rust");
        System.out.println("index -> " + index);

        //Find the index of the last occurence of an element is the LinkedList
        int lastIndex = programmingLanguages.lastIndexOf("Rust");
        System.out.println("last index occurance -> " + lastIndex);
        //Different ways to interate over a LinkedList
        //Iterator
        Iterator iterator = programmingLanguages.iterator();
        while (iterator.hasNext()){
            System.out.println("Fruit -> " + iterator.next());
        }
        //forEach
        programmingLanguages.forEach((element) -> {
            System.out.println(element);
        });

        //for each advanced loop
        for(String element : programmingLanguages){
            System.out.println(element);
        }

    }
}
