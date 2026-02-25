package com.github.pamanne.collection.sorting;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double gpa;


    public Student(String name,int age,double gpa){
        this.name=name;
        this.age=age;
        this.gpa=gpa;

    }

    public String getName(){
        return name;
    }
     public int getAge(){
        return age;
    }
     public double getGpa(){
        return gpa;
    }

    @Override
    public int compareTo(Student s){
        int nameCompare = this.name.compareTo(s.name);
        if(nameCompare !=0){
            return nameCompare;
        }
        // If names are equal, compare by age
        return Integer.compare(this.age,s.age);

    }

    @Override
    public String toString(){
        return "Name: " + getName() +", Age: " +getAge()+", Gpa:"+getGpa();
    }

}
