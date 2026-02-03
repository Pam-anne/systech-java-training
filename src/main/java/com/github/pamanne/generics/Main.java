package com.github.pamanne.generics;

public class Main {
    public static void main(String[] args) {
     
        Printer<Dog> example = new Printer<>(new Dog());
        example.print();


        shout("cat",30);
    }

    public static <T> void shout(T thing1 ,T thing2){
        System.out.println(thing1 + "!!" +thing2);
    }
}
