package com.github.pamanne.exercises.javase015.exercise1;

public class Main {
    public static void main(String[] args) {
        StudentManager manager = new StudentManager();

        manager.addStudent(new Student(1, "Alice", 'A'));
        manager.addStudent(new Student(2, "Bob", 'B'));
        manager.addStudent(new Student(3, "Pam", 'C'));

        System.out.println("Students:");
        manager.displayAllStudents();

        System.out.println("\nFinding student with id 2:");
        Student s = manager.findStudent(2);
        if (s != null) {
            System.out.println("Found: " + s);
        } else {
            System.out.println("Student not found.");
        }

        System.out.println("\nRemoving student with id 1:");
        manager.removeStudent(1);

      

    }
    
}
