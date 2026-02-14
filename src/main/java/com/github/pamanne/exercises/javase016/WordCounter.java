package com.github.pamanne.exercises.javase016;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;


public class WordCounter {
    public static void main(String[] args) {
   
    Scanner scanner = new Scanner(System.in);

    System.out.print("Input: ");
    String text = scanner.nextLine();
    text = text.toLowerCase().replaceAll("[^a-z ]", "");


    String[] words = text.split("\\s+");


    // using hashset
    Set<String> uniqueWordSet = new HashSet<>();
    for(String word: words){
        uniqueWordSet.add(word);
    }
    System.out.println("\t Using HashSet: ");
    
    System.out.println("Unique Words: " + uniqueWordSet.size());
    System.out.println("Words:" + uniqueWordSet);


    // Using linkedHashset
    Set<String> linkedUniqueWordSet = new LinkedHashSet<>();
    for(String word: words){
        linkedUniqueWordSet.add(word);
    }
    
    System.out.println("\t Using LinkedHashSet: ");
    System.out.println("Unique Words: " + linkedUniqueWordSet.size());
    System.out.println("Words:" + linkedUniqueWordSet);   

     
    }
    
}
