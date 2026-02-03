package com.github.pamanne.generics;

public class Printer<T extends Animal> {

    T whatToPrint;

    public Printer(T whatToPrint) {
        this.whatToPrint = whatToPrint;
    }

    public void print(){
        whatToPrint.greetings();
        System.out.println(whatToPrint);
    }
    
}
