package com.github.pamanne.exercises.javase015.exercise3;

import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        InventoryManager manager = new InventoryManager(new ArrayList<>());
        // Demonstrate with ArrayList
        manager.addProduct(new Product(1,"Pen",100.0,50));
        manager.addProduct(new Product(2,"Book",200.0,60));
        manager.addProduct(new Product(3,"Laptop",1300.0,70));

        System.out.println("\nAfter sorting by name:");
        manager.sortByName();
        manager.displayAllProducts();

        manager.sortByPrice();
        System.out.println("\nAfter sorting by price:");
        manager.displayAllProducts();
        

        // remove product
        manager.removeProduct(1);
        System.out.println("\n List after removing a Product:");
        manager.displayAllProducts();
        
        // find product
        System.out.println("\n" + manager.findProduct("pen"));


        manager.updateStock(2, 15);
        manager.displayAllProducts();

        // Demonstrate with LinkedList
    
        InventoryManager manager2 = new InventoryManager(new LinkedList<>());
        manager2.addProduct(new Product(4, "Tablet", 600.0, 8));
        manager2.displayAllProducts();

    }
}
