package com.github.pamanne.exercises.javase012.exercise2;

import com.github.pamanne.exercises.javase012.exercise2.Computer.Memory;

public class Main {
    public static void main(String[] args) {
        Computer computer1=new Computer("HP","EliteBook",1000.0);
        Computer.Processor computer1Processor = new Computer.Processor("intel i5",3.0,4);
        Computer.Memory computer1Memory = computer1.new Memory("8GB", "512GB SSD");

        Computer computer2=new Computer("Dell", "Inspiron 15", 1500.0);
        Computer.Processor computer2Processor = new Computer.Processor("intel i7",4.0,6);
        Computer.Memory computer2Memory = computer2.new Memory("16GB", "512GB SSD");


        computer1.displayInfo();
        System.out.println(computer1Processor.toString()); 
        System.out.println(computer1Memory.toString()); 
 
        computer2.displayInfo();
        System.out.println(computer2Processor.toString()); 
        System.out.println(computer2Memory.toString()); ;
    }
}
