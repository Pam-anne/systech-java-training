package com.github.pamanne.exercises.javase015.exercise1;

public class Student {
    private int id;
    private char grade;
    private String name;

    public Student(int id, String name, char grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public char getGrade() {
        return grade;
    }

    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', grade='" + grade + "'}";
    }

}
