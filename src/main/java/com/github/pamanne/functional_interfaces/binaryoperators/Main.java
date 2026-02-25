package com.github.pamanne.functional_interfaces.binaryoperators;

import java.util.function.BinaryOperator;

public class Main {
    public static void main(String[] args) {
        BinaryOperator<Integer> adder = (a, b) -> a + b;
        System.out.println("Sum: " + adder.apply(5, 3));
    }

}
