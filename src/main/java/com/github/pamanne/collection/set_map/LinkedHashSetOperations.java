package com.github.pamanne.collection.set_map;

import java.util.*;

public class LinkedHashSetOperations {
    public static void main(String[] args) {
        Set<String> students = new LinkedHashSet<>();
        students.add("Alice");
        students.add("Pam");
        students.add("Logan");
        students.add("Charlie");

        System.out.println("Students: " + students);

        String firstElement = students.iterator().next();
        System.out.println("First Element: "+firstElement);

        students.remove("Bob");
        System.out.println("After ramoval: "+students);
    }
}
