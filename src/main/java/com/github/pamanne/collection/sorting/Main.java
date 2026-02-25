package com.github.pamanne.collection.sorting;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("abaki",20,6.3));
        students.add(new Student("anne",18,8.3));
        students.add(new Student("abaki",25,2.5));

        Iterator<Student> s = students.iterator();
        while(s.hasNext()){
            System.out.println(s.next());
        }

        System.out.println("After Sorting");
        Collections.sort(students);
        System.out.println(students);
        
    }
}
