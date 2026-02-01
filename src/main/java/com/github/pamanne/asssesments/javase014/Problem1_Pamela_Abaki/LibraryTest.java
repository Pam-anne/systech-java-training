/**
 * Assessment 3: Mid-Term Practical Test
 * Student: Pamela Akoth Abaki
 * Date: 01-Feb-2026
 * Problem: 1 - Library Management System
 *
 * Key Features:
 * - Demonstrates inheritance and encapsulation
 * - Polymorphic behavior through checkout and returnItem methods
 * - Base class for Book, DVD, and Magazine
 */

package com.github.pamanne.asssesments.javase014.Problem1_Pamela_Abaki;


public class LibraryTest {
    public static void main(String[] args) {

        LibraryItem[] items = {
                new Book("123-4567890123", "Education", "B001", "Java Programming", "John Doe"),
                new DVD(120, "PG", "D001", "Java Tutorial", "Jane Smith"),
                new Magazine("2024-03-01", 15, "M001", "Tech Monthly", "Tech Press")
        };

        for (LibraryItem item : items) {
            item.displayDetails();
            item.checkout();
            item.checkout();
        }
    }

}
