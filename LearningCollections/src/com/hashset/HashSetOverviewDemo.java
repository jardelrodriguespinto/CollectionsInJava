package com.hashset;

import java.util.HashSet;
import java.util.Set;

public class HashSetOverviewDemo {
    public static void main(String[] args) {
        //nullValueDemo();
        //duplicateValueDemo();
        unorderedDemo();


    }
    //Set can contain one null value
    private static void nullValueDemo(){
        Set<String> set = new HashSet<>();
        set.add(null);
        set.add(null);
        System.out.println(set.toString());
    }

    // it does not contain duplicate elements
    private static void duplicateValueDemo(){
        Set<String> set = new HashSet<>();
        set.add("Element1");
        set.add("Element1");
        // display only one element
        System.out.println(set.toString());
    }
    //it is an unordered collection
    private static void unorderedDemo(){
        Set<String> set = new HashSet<>();
        set.add("Element 1");
        set.add("Element 2");
        set.add("Element 4");
        set.add("Element 5");
        set.add("Element 7");
        set.add("Element 6");
        // displays only one element
        System.out.println(set.toString());

    }
}
