package com.github.pamanne.exercises.javase016.exercise2;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Map;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.print("Input: ");
        String text = scanner.nextLine();
        text=text.toLowerCase().replaceAll("[^a-z ]","");

        String[] words = text.split("\\s+");

        // Map<String,Integer> wordsCountMap = new HashMap<>();
        Map<String,Integer> wordsCountMap = new LinkedHashMap<>();
        for(String word :words){
            if (wordsCountMap.containsKey(word)){
                int count = wordsCountMap.get(word);
                wordsCountMap.put(word,count +1);
            }else{
                wordsCountMap.put(word,1);
            }
        }

        System.out.println("Words Frequency Counter: ");
        for(Map.Entry<String,Integer> entry : wordsCountMap.entrySet()){
            System.out.println(entry.getKey()+": " + entry.getValue());

        }




        scanner.close();
    }
}
