package com.github.pamanne.exercises.javase012.exercise2;

public class Computer {
    protected  String brand;
    protected  String model;
    protected double price;

   public Computer(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    
    public static class Processor {
        private String type;
        private double speed;
        private int cores;

        public Processor(String type,double speed,int cores){
            this.type=type;
            this.speed =speed;
            this.cores=cores;
        }

        public String toString() {
            return "Processor: " + type + ", " + speed + "GHz, " + cores + " cores";
        }

        
        
    }
    public class Memory{
        private String ram;
        private String storage;

        public Memory(String ram, String storage) {
            this.ram = ram;
            this.storage = storage;
        }

        public String toString() {
            return "Memory: " + ram + " RAM, " + storage + " storage";
        }
    }

    public void displayInfo(){
            System.out.println("\t COMPUTER SPECIFICATIONS");
            System.out.println("Brand: " + brand);
            System.out.println("Model: "+ model);
            System.out.println("Price:$ " + price);
        }


}
