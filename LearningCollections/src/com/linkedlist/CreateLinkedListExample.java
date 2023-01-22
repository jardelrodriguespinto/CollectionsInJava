package com.linkedlist;

import java.util.LinkedList;
import java.util.List;

//add()
//add(2, elementName)
//addFirst()
//addLast()
public class CreateLinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("grapes");
        System.out.println("Initial LinkedList -> " + fruits);

        //Adding an element at the specified position in the LinkedList
        fruits.add(0, "cherry");
        System.out.println("Current LinkedList ->" + fruits);


        //Adding element at the begging in the LinkedList
        fruits.addFirst("watermelon");
        //Adding element at the end in the LinkedList
        fruits.addLast("orange");
        System.out.println("Current LinkedList ->" + fruits);



    }
}
