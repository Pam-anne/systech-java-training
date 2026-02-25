package com.github.pamanne.exercises.javase017.exercise2;

import java.util.*;

public class Test {

    public static void main(String[] args) {
        // ---- Test Book ----
        List<Book> books = new ArrayList<>();
        books.add(new Book("Java Basics", "Pamela"));
        books.add(new Book("Algorithms", "Brian"));
        books.add(new Book("Java Basics", "Anne"));

        System.out.println("Before sorting (Books):");
        Iterator<Book> book = books.iterator();
        while (book.hasNext()) {
            System.out.println(book.next());
        }

        Collections.sort(books);

        System.out.println("\nAfter sorting by title, then author:");
        book = books.iterator(); 
        while (book.hasNext()) {
            System.out.println(book.next());
        }

        // ---- Test Product ----
        List<Product> products = new ArrayList<>();
        products.add(new Product("Food", 10.5, "Bread"));
        products.add(new Product("Food", 8.0, "Apple"));
        products.add(new Product("Drink", 12.0, "Juice"));
        products.add(new Product("Food", 8.0, "Avocado"));

        System.out.println("\nBefore sorting (Products):");
        Iterator<Product> product = products.iterator();
        while (product.hasNext()) {
            System.out.println(product.next());
        }

        Collections.sort(products);

        System.out.println("\nAfter sorting by category, price, then name:");
        product = products.iterator(); 
        while (product.hasNext()) {
            System.out.println(product.next());
        }

        // ---- Test Employee ----
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("IT", 50000, "Bob"));
        employees.add(new Employee("HR", 45000, "Anne"));
        employees.add(new Employee("IT", 50000, "Alice"));
        employees.add(new Employee("HR", 40000, "Zara"));

        System.out.println("\nBefore sorting (Employees):");
        Iterator<Employee> employee = employees.iterator();
        while (employee.hasNext()) {
            System.out.println(employee.next());
        }

        Collections.sort(employees);

        System.out.println("\nAfter sorting by department, salary, then name:");
        employee = employees.iterator(); 
        while (employee.hasNext()) {
            System.out.println(employee.next());
        }
    }
}