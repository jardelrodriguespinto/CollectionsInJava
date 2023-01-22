package com.learningcollections;

import java.util.*;

public class NeedOfCollection {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;

        // limitations of an array
        // 1. Arrays are fixed in size
        // 2. Arrays can hold only homogeneous data elements
        //this case the problem is the fact that Student array cannot hold a diffente kind of object
//        Student[] students = new Student[10];
//        students[0] = new Student();
//        students[1] = new Student();
//        students[2] = new Book();
        //here, it can hold different objects, however, it can't grow in size
        // because once the array size is set it can't grow - it's immutable
//        Object[] objects = new Object[10];
//        objects[0] = new Student();
//        objects[1] = new Student();
//        objects[2] = new Book();
        // 3 ready made APIS support is not available in array
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);

    }
}
//class Student{
//
//}
//class Book{
//
//}