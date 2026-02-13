package com.github.pamanne.collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // listUtility1();
        listConversion();
        
    }


    public static void listUtility1(){
        List<String> fruits = new ArrayList<>();
        fruits.add("Pears");
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");

        // sorting
        Collections.sort(fruits);
        System.out.println("Sorted List: " +fruits);

        // for binary search the list must be sorted
        int index = Collections.binarySearch(fruits,"Mango");
        System.out.println(fruits.get(index)+" found at index: " + index);
        // Reversing
        Collections.reverse(fruits);
        System.out.println("Reversed:  " + fruits);

        //Shuffling
        Collections.shuffle(fruits);
        System.out.println("Shuffled:  " + fruits);

        // frequency number of times an itme appears
        fruits.add("Mango");
        int frequency = Collections.frequency(fruits,"Mango");
        System.out.println("Mango appears " + frequency + " times");

        // sublist
        List<String> a =fruits.subList(1,3);
        System.out.println("sublist: " +a);

    }

    public static void listConversion(){
        String [] fruits ={"Apple","Banana","Orange"};
        List <String> listFromArray = Arrays.asList(fruits);
        // System.out.println("Array: " +fruits); prints the hashcode
        System.out.println("Array: " + Arrays.toString(fruits));
        System.out.println("List from Fruits Array: "+listFromArray);

        // mutable list
        List<String> mutableList =new ArrayList<> (Arrays.asList(fruits));
        mutableList.add("Grapes");
        System.out.println("Mutable list: " + mutableList);

        // Converting list to arrays
        List<String> fruits2 = new ArrayList<>();
        fruits2.add("Apple");
        fruits2.add("Ban");
        fruits2.add("Orange");

        String[] arrayFromList = fruits2.toArray(new String[0]);
        System.out.println("Arrays from the list: " + Arrays.toString(arrayFromList));


    }
}
