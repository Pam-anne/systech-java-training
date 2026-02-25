package com.github.pamanne.collection.comparator_sort;

import java.util.*;

public class ModernComparator {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Charlie", 22, 3.2));
        students.add(new Student("Alice", 20, 3.8));
        students.add(new Student("Bob", 21, 3.5));
        students.add(new Student("Alice", 19, 3.9));
        // Using Comparator.comparing() - method reference
        Comparator<Student> byName = Comparator.comparing(Student::getName);
        Collections.sort(students, byName);
        System.out.println("Sorted by name:");
        students.forEach(System.out::println);
        // Using Comparator.comparing() with lambda
        Comparator<Student> byAge = Comparator.comparing(s -> s.getAge());
        Collections.sort(students, byAge);
        System.out.println("\nSorted by age:");
        students.forEach(System.out::println);
        // Reverse order
        Comparator<Student> byNameReverse = Comparator.comparing(Student::getName).reversed();
        Collections.sort(students, byNameReverse);
        System.out.println("\nSorted by name (reverse)");
    }
}