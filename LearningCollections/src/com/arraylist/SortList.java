package com.arraylist;

import java.util.*;

public class SortList {
    public static void main(String[] args) {
        // create list
//        List<Integer> list = new ArrayList<>();
//        list.add(10);
//        list.add(30);
//        list.add(20);
//        list.add(50);
//        list.add(40);
//
//        Collections.sort(list); // ascending order
//        System.out.println(list);
//
//        Collections.reverse(list); //descending order
//        System.out.println(list);

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(15, "João", 25, 3500L));
        employees.add(new Employee(40, "Roberta", 21, 1980L));
        employees.add(new Employee(12, "Maurício", 25, 2100L));
        employees.add(new Employee(4, "Maria", 49, 5500L));

        Collections.sort(employees, new MySort());// ascending order
        System.out.println(employees);
        Collections.sort(employees, new DescSort());// descending order
        System.out.println(employees);

        //sort in ascending order by id
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o1.getId() - o2.getId());
            }
        });
        System.out.println(employees);
        // sort in descending order by id
        Collections.sort(employees, new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return (int) (o2.getId() - o1.getId());
            }
        });
        System.out.println(employees);
        // sorting in ascending order by age using lambda expression
        Collections.sort(employees, (o1, o2) -> (int) (o1.getAge() - o2.getAge()));
        System.out.println(employees);
        // sorting in descending order by age using lambda expression
        Collections.sort(employees, (o1, o2) -> (int) (o2.getAge() - o1.getAge()));
        System.out.println(employees);
        // sorting by name using lambda expression
        Collections.sort(employees,(o1,o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println(employees);


    }
    //This method sort in ascending order based in their salary
    static class MySort implements Comparator<Employee>{
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }
    }
    //this method sort in descending order based on their salary
    static class DescSort implements Comparator<Employee>{
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o2.getSalary() - o1.getSalary());
        }
    }
}
