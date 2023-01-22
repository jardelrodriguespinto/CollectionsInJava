package com.hashmap;

import java.util.*;

public class CreateHashMap {
    public static void main(String[] args) {
        //example to map numbers to string
        Map<String, Integer> numberMapping = new HashMap<>();
        // add key-value pair to map
        numberMapping.put("One", 1);
        numberMapping.put("Two", 2);
        numberMapping.put("Three", 3);
        numberMapping.put("Four", 4);
        numberMapping.put("Five", 5);
        numberMapping.put(null, 6);
        numberMapping.put(null, 7);

        System.out.println(numberMapping);

        //Check if Hashmap is empty
        System.out.println(numberMapping.isEmpty());

        //Find the size of HashMap
        System.out.println(numberMapping.size());

        //Check if key exists in the HashMap
        boolean containsKey = numberMapping.containsKey("Five");
        System.out.println(containsKey);

        //Check if key exists in the HashMap
        boolean containsValue = numberMapping.containsValue(5);
        System.out.println(containsValue);

        // get value by key

        Integer value = numberMapping.get("One");
        System.out.println(value);

        //how to remove keys from HashMap
        numberMapping.remove("Two");
        System.out.println(numberMapping);

        //how to get only keys from hashmap

        Set<String> keys = numberMapping.keySet();
        System.out.println(keys);

        Collection<Integer> values = numberMapping.values();
        System.out.println(values);

        //different ways to iterate over hashmap

        //for each method
        for (Map.Entry<String, Integer> entry: numberMapping.entrySet()){
            System.out.println("key -> " + entry.getKey() + " --- value -> " + entry.getValue());
        }

        // using iterator
        Set<Map.Entry<String, Integer>> entries = numberMapping.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> entry = iterator.next();
            System.out.println("Key -> " + entry.getKey() + " Value ->" + entry.getValue());
        }
        // hashmap using java 8 forEach
        numberMapping.forEach((K, V) ->{
            System.out.println(" k " + K);
            System.out.println(" V " + V);
        });
    }
}
