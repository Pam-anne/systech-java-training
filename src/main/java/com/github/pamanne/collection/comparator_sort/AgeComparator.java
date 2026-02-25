package com.github.pamanne.collection.comparator_sort;

import java.util.*;

public class AgeComparator implements Comparator<Student> {
    // Comparator for sorting Students by age
    @Override
    public int compare(Student s1,Student s2){
        return Integer.compare(s1.getAge(),s2.getAge());
    }

    
}
