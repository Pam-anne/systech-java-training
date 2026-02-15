package com.github.pamanne.collection.hashmaps;

import java.util. *;
public class HashMapOps {
public static void main(String[] args) {
    Map<String,String > countryCapitals = new HashMap<>();

    countryCapitals.put("Kenya", "Nairobi");
    countryCapitals.put("USA", "DC");
    countryCapitals.put("Franc", "Paris");
    countryCapitals.put("UK", "London");


    // accessing values
    System.out.println("Value: " + countryCapitals.get("USA"));

    // check existence
    System.out.println("Contains UK? " + countryCapitals.containsKey("UK"));
    System.out.println("Contains Nairobi? " + countryCapitals.containsValue("Nairobi"));

    // removing elements
    countryCapitals.remove("UK","London");
    System.out.println("After   Update: "+ countryCapitals);

    // replace operation
    countryCapitals.replace("USA","Vietnam");
    System.out.println("After   Update: "+ countryCapitals);

    // iteration uisng key set
    System.out.println("Keys: ");
    for(String country :countryCapitals.keySet()){
        System.out.println(country);
    }

    // iteration using values
    System.out.println("Values: ");
    for(String capital: countryCapitals.values()){
        System.out.println(capital);
    }

}
}
