package com.github.pamanne.collection.sorting;

import java.util.*;
public class ComparableSorting {
    public static void main(String[] args) {
         String [] fruits={"ME","Us","aba"};
        Arrays.sort(fruits);

        for(String f : fruits){
        System.out.println(f);
        }

        List<String> fruitLists = Arrays.asList(fruits);

        Iterator<String> f = fruitLists.iterator();
        while(f.hasNext()){
            System.out.println(f.next());
        }
    }
   
    
}
