package com.github.pamanne.functional_interfaces.unaryoperators;

import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Integer> numMultiplication = (a) -> {
            return a * 5;
        };

        System.out.println(numMultiplication.apply(6));

        // 5. UnaryOperator<T> - takes T, returns T (special case of Function)
        UnaryOperator<String> toUpper = s -> s.toUpperCase();
        System.out.println("Uppercase: " + toUpper.apply("hello"));
    }
}
