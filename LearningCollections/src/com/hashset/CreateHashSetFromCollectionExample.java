package com.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//1. Create a HashSet from another collection using the HashSet(Collection o) constructor
//2. Add all the elements from a collection to the HashSet using the addAll() method
public class CreateHashSetFromCollectionExample {
    public static void main(String[] args) {
        //frist 5 even numbers
        List<Integer> firstEvenNumbers = new ArrayList<>();
        firstEvenNumbers.add(2);
        firstEvenNumbers.add(4);
        firstEvenNumbers.add(6);
        firstEvenNumbers.add(8);
        firstEvenNumbers.add(10);

        //Create a HashSet from another collection usign the HashSet(Collection c) constructor
        Set<Integer> tenEvenNumebers = new HashSet<>(firstEvenNumbers);
        System.out.println(tenEvenNumebers);

        List<Integer> nextFiveEvenNumbers = new ArrayList<>();
        nextFiveEvenNumbers.add(12);
        nextFiveEvenNumbers.add(14);
        nextFiveEvenNumbers.add(16);
        nextFiveEvenNumbers.add(18);
        nextFiveEvenNumbers.add(20);

        //Add all the elements from a collection to the HashSet using the AddAll() method
        tenEvenNumebers.addAll(nextFiveEvenNumbers);
        System.out.println(tenEvenNumebers);

    }
}
