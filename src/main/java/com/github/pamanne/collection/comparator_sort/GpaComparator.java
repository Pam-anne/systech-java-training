package com.github.pamanne.collection.comparator_sort;

import java.util.*;
public class GpaComparator implements Comparator<Student>{
    // Comparator for sorting Students by GPA (descending)
    public int compare(Student s1,Student s2){
        return Double.compare(s1.getGpa(),s2.getGpa());
    }
}
