package com.github.pamanne.exercises.javase016.exercise3;

import java.util.*;

public class StudentManager {

    private Map<String, Student> studentsMapId;
    private Set<String> emails;

    public StudentManager() {
        this.studentsMapId = new HashMap<>();
        this.emails = new HashSet<>();
    }

    public void addStudent(Student student) {
        if (studentsMapId.containsKey(student.getId())) {
            System.out.println("\n Student with ID " + student.getId() + " already exists!");
            return;
        }

        if (emails.contains(student.getEmail())) {
            System.out.println("\n Student with email " + student.getEmail() + " already exists!");
            return;
        }

        studentsMapId.put(student.getId(), student);
        emails.add(student.getEmail());
        System.out.println("\n Student added successfully");
    }

    public Student findStudent(String id) {
        Student student = studentsMapId.get(id);
        if (student == null) {
            System.out.println("\n Student with ID: " + id + "found");
        }
        return student;
    }

    public void removeStudent(String id) {
        Student studentRemove = studentsMapId.remove(id);
        if (studentRemove != null) {
            emails.remove(studentRemove.getEmail());
            System.out.println("\n Removed student: " + studentRemove.getName());
        } else {
            System.out.println("\n No student found with ID: " + id);
        }
    }

    public void listAllStudents() {
        if (studentsMapId.isEmpty()) {
            System.out.println("\n No students found in the database.");
        } else {
            System.out.println("\n All Students:");
            for (Student student : studentsMapId.values()) {
                System.out.println(student);
            }
        }
    }
}
