package com.github.pamanne.exercises.javase012.exercise3;

import java.util.ArrayList;

public class Library {
    private String name;
    private String location;
    ArrayList<Book> books = new ArrayList<>();
    ArrayList<LibraryMember> members = new ArrayList<>();

    public Library(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public static class Book {
        String isbn;
        String title;
        String author;
        boolean isAvailable;

        public Book(String isbn, String title, String author) {
            this.isbn = isbn;
            this.title = title;
            this.author = author;
            this.isAvailable = true;
        }

        public void displayBook() {
            System.out.println("Book Title: " + title);
            System.out.println("Book Author: " + author);
            System.out.println("Available: " + isAvailable +"\n");
        }
    }

    public class LibraryMember {
        private int memberId;
        private String name;
        ArrayList<Book> borrowedBooks = new ArrayList<>();

        public LibraryMember(int memberId, String name) {
            this.memberId = memberId;
            this.name = name;
        }

        public void borrowBook(Book book) {
            if (book.isAvailable) {
                borrowedBooks.add(book);
                book.isAvailable = false;
                System.out.println(name + " borrowed " + book.title);
            } else {
                System.out.println(book.title + " is not available right now.");
            }
        }

        public void returnBook(Book book) {
            if (borrowedBooks.remove(book)) {
                book.isAvailable = true;
                System.out.println(name + " returned " + book.title);
            } else {
                System.out.println(name + " doesn't have this book.");
            }
        }

    }

    public void addBook(Book book) {
        books.add(book);
        System.out.println(book.title + " added to the library.");

    }

    public void registerMember(LibraryMember member) {
        members.add(member);
        System.out.println(member.name + " registered successfully.");

    }
    public void displayLibraryInfo() {
    System.out.println("Library: " + name + "\nLocation: " + location +"\n");
}


}
