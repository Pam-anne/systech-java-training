package com.github.pamanne.exercises.javase013.exercise2;

import java.util.ArrayList;

public class StudentGrade {
    private int grade;
    private ArrayList<String> students = new ArrayList<>();
   
    public int getGrade() {
        return grade;
    }

    public void addStudent(String name) throws DuplicateStudentException {
        for (String student: students) {
            if (student.equalsIgnoreCase(name)) {
                throw new DuplicateStudentException("Student " + name + " already exists!");
            }
        }

        students.add(name);
        System.out.println("Student added: " + name);
    }

    public String findStudent(String name) throws StudentNotFoundException {
        for (String student: students) {
            if (student.equalsIgnoreCase(name)) {
                System.out.println("Student " + name + " found");
                return student; 
                
            }
        }
        throw new StudentNotFoundException("Student " + name + " not found!");
    }

    public void setGrade(int grade) throws InvalidGradeException {
        if (grade < 0 || grade > 100) {
            throw new InvalidGradeException("Grade must be between 0 and 100.");
        }
        this.grade = grade;
        System.out.println("Grade: "+ grade +" Added successfully");

    }
}
