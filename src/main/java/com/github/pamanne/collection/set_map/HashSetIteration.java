package com.github.pamanne.collection.set_map;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.LinkedHashSet;



public class HashSetIteration{
    public static void main(String[] args) {
        Set<String> colors = new HashSet<>();
        colors.add("Green");
        colors.add("Red");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add(null);

        // random order
        System.out.println("Colors:" + colors );

        // Foreach loop method
        System.out.println("Enhanced fo loop: ");
        for(String color:colors){
            System.out.println(color);
        }

        // using iterator
        System.out.println("Iterator: ");
        Iterator<String> iterator = colors.iterator();
        while(iterator.hasNext()){
            String color=iterator.next();
            System.out.println("Color: "+color);

        }

        Set<String> colors2 = new LinkedHashSet<>();
        colors2.add("Green");
        colors2.add("Red");
        colors2.add("Blue");
        colors2.add("Yellow");
        colors2.add(null);

        // insertion order
        System.out.println("Colors:" + colors2 );
    }
}