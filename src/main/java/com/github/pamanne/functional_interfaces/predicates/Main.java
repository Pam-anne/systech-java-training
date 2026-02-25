package com.github.pamanne.functional_interfaces.predicates;

import java.util.function.Predicate;
public class Main {
    public static void main(String[] args) {
        Predicate<Integer> isEven = (Integer num) ->{
            if(num%2==0)
                return true;
            return false;
        };

        System.out.println(isEven.test(9));
    }
}
