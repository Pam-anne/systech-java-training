package com.github.pamanne.collection.comparator_sort;


import java.util. *;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22, 3.2));
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 21, 3.5));

        System.out.println("Original order:");
        students.forEach(System.out::println);

        // Sort by age using Comparator
        Collections.sort(students, new AgeComparator());
        System.out.println("\nSorted by age:");
        students.forEach(System.out::println);
        // Sort by GPA (descending) using Comparator
        Collections.sort(students, new GpaComparator());
        System.out.println("\nSorted by GPA (descending):");
        students.forEach(System.out::println);
        
        
        
       
    }
}