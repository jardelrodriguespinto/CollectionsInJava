package com.arraylist;

import java.util.ArrayList;
import java.util.List;

//How to create an ArrayList from another collection
//using the ArrayList (Collection c) constructor
//How to add all the elements from an existing collection
//to the new ArrayList using the addAll() method
public class CreateArrayListFromCollectionExample {
    public static void main(String[] args) {
        //create arraylist object
        List<Integer>  firstFivePrimeNumebers = new ArrayList<>();
        firstFivePrimeNumebers.add(2);
        firstFivePrimeNumebers.add(3);
        firstFivePrimeNumebers.add(5);
        firstFivePrimeNumebers.add(7);
        firstFivePrimeNumebers.add(11);

        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumebers);
//        System.out.println(firstTenPrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);

        System.out.println(firstTenPrimeNumbers);
    }
}
