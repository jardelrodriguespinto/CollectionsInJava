package com.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
//        list.add("element1");
//        list.add("element2");
//        list.add("element2");
        System.out.println(list);

        //list allows us to have 'null' elements
//        list.add(null);
//        System.out.println(list);

        //insertion order
        list.add("element1");
        list.add("element2");
        list.add("element3");
        list.add("element4");
        list.add("element5");
        System.out.println(list);

        //access elements from list

        System.out.println(list.get(0));
        System.out.println(list.get(4));
    }
}
