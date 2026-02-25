package com.github.pamanne.functional_interfaces.bifunctions;

import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        
    
    BiFunction<Integer,Integer,Integer> converTwoIntToString = (a,b) -> {
        return a+b;
    };
    System.out.println(converTwoIntToString.apply(2,4));
}
    
}
