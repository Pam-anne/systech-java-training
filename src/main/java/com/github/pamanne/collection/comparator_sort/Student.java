package com.github.pamanne.collection.comparator_sort;

public class Student {
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
    public String toString(){
        return "Name: " + getName() +", Age: " +getAge()+", Gpa:"+getGpa();
    }

}
