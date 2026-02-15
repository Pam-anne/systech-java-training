package com.github.pamanne.exercises.javase017.exercise1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Even numbers
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        System.out.println("Even numbers: " + CollectionFilterUtils.filterEvenNumbers(numbers) + "\n");

        // Short strings
        List<String> words = Arrays.asList("Hi", "Java", "Me", "Sun", "No");
        System.out.println("Filtered strings: " + CollectionFilterUtils.filterShortStrings(words) + "\n");

        // Students with grade below C
        List<Student> students = Arrays.asList(
                new Student(1, "Alice", 'A'),
                new Student(2, "Bob", 'D'),
                new Student(3, "Clara", 'B'),
                new Student(4, "David", 'F'));
        System.out.println("Filtered students with grade below C: " + CollectionFilterUtils.filterByGrade(students));
    }
}
