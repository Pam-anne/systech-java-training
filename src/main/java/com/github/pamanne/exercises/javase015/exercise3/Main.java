package com.github.pamanne.exercises.javase015.exercise3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager(new ArrayList<>());

        manager.addProduct(new Product(1,"Pen",100.0,50));
        manager.addProduct(new Product(1,"Book",200.0,60));
        manager.addProduct(new Product(1,"Laptop",1300.0,70));
        manager.displayAllProducts();

        // remove product
        manager.removeProduct(1);
        System.out.println("List after removing a Product:");
        manager.displayAllProducts();
        
        // find product
        System.out.println(manager.findProduct("pen"));

    }
}
