package com.github.pamanne.functional_interfaces.supliers;

import java.util.function.Supplier;
public class Main {
    public static void main(String[] args) {
        Supplier<String> isLambdaExpression = () -> "This is a lambda expression with only one statement so no need of a block";
    

    System.out.println(isLambdaExpression.get());
    }
}
