package com.github.pamanne.exercises.javase016.exercise3;


public class Main {
    public static void main(String[] args) throws InvalidStudentException {
        StudentManager manager = new StudentManager();

        Student s1 = new Student("S001", "Alice", "alice@gmail.com");
        Student s2 = new Student("S002", "Pam", "pam@gmail.com");
        Student s3 = new Student("S003", "Bob", "alice@gmail.com"); 
        Student s4 = new Student("S001", "Sharone", "sharone@gmail.com"); 

        // adding students
        manager.addStudent(s1);
        manager.addStudent(s2);
        manager.addStudent(s3);
        manager.addStudent(s4);

        manager.listAllStudents();


        manager.findStudent("S002");
        manager.removeStudent("S001");
        manager.listAllStudents();
        
    }
}
