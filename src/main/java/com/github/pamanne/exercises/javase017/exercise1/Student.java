package com.github.pamanne.exercises.javase017.exercise1;

public class Student {
    private int id;
    private String name;
    private char grade;

    public Student(int id,String name,char grade){
        this.id =id;
        this.name=name;
        this.grade =grade;

    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public char getGrade(){
        return grade;
    }

    @Override
    public String toString(){
        return "Student{ Id:" + id + ", name:" + name + ",grade:" +grade +"}";
    }
}
