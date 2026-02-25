package com.github.pamanne.collection.comparator_sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AnonymousComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22, 3.2));
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 21, 3.5));
        // Anonymous comparator class for sorting by name length
        Comparator<Student> nameLengthComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return Integer.compare(s1.getName().length(), s2.getName().length());
            }
        };
        Collections.sort(students, nameLengthComparator);
        System.out.println("Sorted by name length:");
        students.forEach(System.out::println);
        // Another anonymous comparator for reverse natural order
        Comparator<Student> reverseNameComparator = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s2.getName().compareTo(s1.getName()); // Reverse
            }
        };
        Collections.sort(students, reverseNameComparator);
        System.out.println("\nSorted by name (reverse):");
        students.forEach(System.out::println);
    }
}