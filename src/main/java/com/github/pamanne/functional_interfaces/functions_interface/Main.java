package com.github.pamanne.functional_interfaces.functions_interface;

import java.util.function.Function;

public class Main{
    public static void main(String[] args) {
        Function<Integer,String> convertIntToString=(Integer num) ->{
            return num.toString();
        };

        convertIntToString.apply(62);
    }
}