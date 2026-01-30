package com.github.pamanne.exercises.javase013.exercise2;

public class Main {
    public static void main(String[] args) {

        StudentGrade student = new StudentGrade();

        try {
            student.addStudent("Charlie");
            student.addStudent("alice");
        } catch (DuplicateStudentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            student.findStudent("Charlie");
            student.findStudent("Roy");
        } catch (StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            student.setGrade(120);
        } catch (InvalidGradeException e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
