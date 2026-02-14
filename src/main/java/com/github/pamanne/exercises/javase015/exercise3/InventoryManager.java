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

    public void updateStock(int id, int newQuantity) {
        for (Product product : products) {
            if (product.getId() == id) {
                product.setQuantity(newQuantity);
                System.out.println("\n Updated stock for ID " + id + " to " + newQuantity);
                return;
            }
        }
        System.out.println("Product not found for update");
    }

    public void sortByPrice() {
        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product a, Product b) {
                return Double.compare(a.getPrice(), b.getPrice());
            }
        });
    }

    public void sortByName() {
        Collections.sort(products, new Comparator<Product>() {
            public int compare(Product a, Product b) {
                return a.getName().compareToIgnoreCase(b.getName());
            }
        });
    }

    public void displayAllProducts(){
        System.out.println("List of Products: {" + products +"}");
        // for(Product product:products){
        //     System.out.println(product);
        // }
    }

    

}
