package com.github.pamanne.exercises.javase017.exercise1;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

public class CollectionFilterUtils {

    private CollectionFilterUtils(){}

    // filter even numbers

    public static List<Integer> filterEvenNumbers(List<Integer> numbers){
        List<Integer> filtered = new ArrayList<>(numbers);
        Iterator<Integer> iterator = filtered.iterator();

        while(iterator.hasNext()){
            int number =  iterator.next();
            if(number % 2 !=0){
                iterator.remove();
            }

        }
        return filtered;

    }


    // remove short strings
    public static List<String> filterShortStrings(List<String> strings){
        List<String> filtered = new ArrayList<>(strings);
        Iterator<String> iterator = filtered.iterator();

        while(iterator.hasNext()){
            String string = iterator.next();
            if(string.length()<3){
                iterator.remove();
            }

        }
        return filtered;
    }

    // filter  student with grade below C

    public static List<Student> filterByGrade(List<Student> students){
        List<Student> filtered = new ArrayList<>(students);
        Iterator<Student> iterator =filtered.iterator();

        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getGrade() > 'C'){
                iterator.remove();

            }

        }
        return filtered;

    }

}
