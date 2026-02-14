package com.github.pamanne.collection.set_map;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("Alice");
        names.add("Bob");
        names.add("Alice"); //will be ignored

        System.out.println(names.contains("Bob"));


        
    }
}
