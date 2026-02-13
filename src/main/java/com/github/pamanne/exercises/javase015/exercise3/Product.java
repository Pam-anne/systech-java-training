package com.github.pamanne.exercises.javase015.exercise3;

public class Product {
    private int id;
    private String  name;
    private double price; 
    private int quantity;

    public Product(int id, String name,double price,int quantity){
        this.id=id;
        this.name=name;
        this.price=price;
        this.quantity =quantity;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return id;
    }
    public int getQuantity(){
        return quantity;
    }

      public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            System.out.println("Price cannot be negative!");
        }
    }
    
    public void setQuantity(int quantity) {
        if (quantity >= 0) {
            this.quantity = quantity;
        } else {
            System.out.println("Quantity cannot be negative!");
        }
    }

    @Override
    public String toString(){
        return "Product[ID: "+id +" ,Name: "+name +" ,Price: "+price +" ,Quantity: "+quantity +"]";

    }

    
}
