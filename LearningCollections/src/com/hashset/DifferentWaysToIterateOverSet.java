package com.hashset;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DifferentWaysToIterateOverSet {
    public static void main(String[] args) {
        Set<Integer> primeNumbers = new HashSet<>();
        primeNumbers.add(1);
        primeNumbers.add(3);
        primeNumbers.add(5);
        primeNumbers.add(7);
        primeNumbers.add(9);
        primeNumbers.add(11);
        primeNumbers.add(13);
        //Enhanced for loop
        for (int number : primeNumbers){
            System.out.print(number + " ,");
        }
        //Bassic loop with Iterator
        for (Iterator iterator = primeNumbers.iterator(); iterator.hasNext();){
            Integer primeNumber = (Integer) iterator.next();
            System.out.println(primeNumber);
        }
        //While loop with iterator
            Iterator iterator = primeNumbers.iterator();
            while(iterator.hasNext()){
                System.out.println(iterator.next());
            }
        //JDK 8 forEach() method with lambda
        primeNumbers.forEach(primeNumber -> System.out.println(primeNumber));
        //JdK 8 streaming + forEach() + lambda expression
        primeNumbers.stream().forEach(primeNumber -> System.out.println(primeNumber));
    }


}
