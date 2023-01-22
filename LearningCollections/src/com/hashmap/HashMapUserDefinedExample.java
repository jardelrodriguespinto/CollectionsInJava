package com.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapUserDefinedExample {
    public static void main(String[] args) {
        //create hashmap
        Map<Integer, Student> studentMap = new HashMap<>();
        studentMap.put(1, new Student("João", "Pereira"));
        studentMap.put(2, new Student("Roberto", "Peixoto"));
        studentMap.put(3, new Student("Marcos", "Vieira"));
        System.out.println(studentMap.values());
    }
}
