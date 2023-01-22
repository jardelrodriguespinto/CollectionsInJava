package com.linkedlist;

import java.util.Iterator;
import java.util.LinkedList;

//How to get the first element in the LinkedList
//How to get the last element in the LinkedList
//How to get the element at a given index in the LinkedList
//How to get all the elements from LinkedList
public class RetrieveLinkedListElementsExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();
        fruits.add("banana");
        fruits.add("apple");
        fruits.add("mango");
        fruits.add("grapes");

        //Getting the first element in the LinkedList using getFirst()
        System.out.println("First Element ->" + fruits.getFirst());

        //Getting the last element in the LinkedList using getLast()
        System.out.println("Last Element ->" + fruits.getLast());

        //Getting the element at a given position in the LinkedList
        System.out.println("Getting element in a specific index -> " + fruits.get(2));
        // using an enhanced for loop
        for (String fruit : fruits){
            System.out.println("Fruit -> " + fruit);
        }
        // using an iterator with an while loop
        Iterator iterator = fruits.descendingIterator();
        while(iterator.hasNext()){
            System.out.println("Fruit => " + iterator.next());
        }
    }
}
