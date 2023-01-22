package com.linkedlist;

import java.util.LinkedList;

//How to remove the first element in the LinkedList
//How to remove the last element in the LinkedList
//How to remove the first occurence of a given element in the LinkedList
//How to clear the LinkedList completely
public class RemoveElementFromLinkedListExample {
    public static void main(String[] args) {

        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("mango");
        fruits.add("grapes");
        System.out.println("Initial LinkedList --> " + fruits);

        //Remove the first element in the LinkedList
        String removeFirstElement = fruits.removeFirst();
        System.out.println("After removing firstElement -> " + removeFirstElement);

        //Remove the last element in the LinkedList
        String removeLastElement = fruits.removeFirst();
        System.out.println("After removing lastElement -> " + removeLastElement);

        //Removing an element by its value
        fruits.remove("apple");
        System.out.println("After removing element in a given index -> " + fruits);
        //Clearing the list completely
        fruits.clear();
        System.out.println("After all the elements being delete " + fruits);
    }
}
