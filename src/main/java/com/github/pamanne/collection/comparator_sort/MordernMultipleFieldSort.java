package com.github.pamanne.collection.comparator_sort;

import java.util.*;

public class MordernMultipleFieldSort {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 21, 3.5));
        students.add(new Student("Charlie", 22, 3.2));
        students.add(new Student("Alice", 19, 3.9));
        students.add(new Student("Bob", 21, 3.6));
        // Traditional way - multiple comparators
        Comparator<Student> byNameThenAge = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int nameCompare = s1.getName().compareTo(s2.getName());
                if (nameCompare != 0) {
                    return nameCompare;
                }
                return Integer.compare(s1.getAge(), s2.getAge());
            }
        };
        Collections.sort(students, byNameThenAge);
        System.out.println("Sorted by name, then age:");
        students.forEach(System.out::println);
        // Modern way - using Comparator composition
        Comparator<Student> modernMultiField = Comparator.comparing(Student::getName)
                .thenComparing(Student::getAge)
                .thenComparing(Student::getGpa);
        Collections.sort(students, modernMultiField);
        System.out.println("\nSorted by name, then age, then GPA:");
        students.forEach(System.out::println);
        // Mixed ascending/descending
        Comparator<Student> mixedOrder = Comparator.comparing(Student::getName)
                .thenComparing(Comparator.comparing(Student::getGpa).reversed());

        Collections.sort(students, mixedOrder);
        System.out.println("\nSorted by name (asc), then GPA (desc):");

    }
}
