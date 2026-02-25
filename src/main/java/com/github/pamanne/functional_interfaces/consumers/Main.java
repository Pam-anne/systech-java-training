package com.github.pamanne.functional_interfaces.consumers;

import java.util.function.*;

public class Main{
    public static void main(String[] args) {
        Consumer<Integer> loggerObject = (Integer val) ->{
            if(val<10){
                System.out.println("Logging");
            }
        };

        loggerObject.accept(2);
    }
}
