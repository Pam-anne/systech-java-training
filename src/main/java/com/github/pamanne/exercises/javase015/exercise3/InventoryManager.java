package com.github.pamanne.exercises.javase015.exercise3;

import java.util.*;
public class InventoryManager {
    private List<Product> products;

    public InventoryManager(List<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product){
        products.add(product);
    }

    public void removeProduct(int id){
        for(Product product : products){
            if(product.getId()==id){
                products.remove(product);
                return;
            }

        }
        System.out.println("Product with id " + id +" not found");

    }

    public Product findProduct(String name){
        for(Product product : products){
            if(product.getName() != null && product.getName().equalsIgnoreCase(name)){
                return product;
            }
        }
        return null;

    }
    public void updateStock(){

    }

    public void displayAllProducts(){
        System.out.println("List of Products: ");
        System.out.println(products);
    }

}
