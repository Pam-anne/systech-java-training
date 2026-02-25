package com.github.pamanne.exercises.javase017.exercise2;

public class Product implements Comparable<Product>{
    private String category;
    private double price;
    private String name;
    
    public Product(String category,double price,String name){
        this.category=category;
        this.price =price;
        this.name=name;
    }

    public String getCategory(){
        return category;
    }

    public double getPrice(){
        return price;
    }

    public String getName(){
        return name;
    }


    @Override
    public int compareTo(Product other){
        int categoryCompare=this.category.compareTo(other.category);
        int priceCompare=Double.compare(this.price,other.price);
        if(categoryCompare != 0){
            return categoryCompare;
        }
        if(priceCompare != 0){
            return priceCompare;
        }
        return this.name.compareTo(other.name);
        

    }

    @Override
    public String toString(){
        return "Product{ Category:" +category + ", Price:"+ price + ", Name:" + name +"}";
    }
}
