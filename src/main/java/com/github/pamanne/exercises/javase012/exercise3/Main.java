package com.github.pamanne.exercises.javase012.exercise3;

public class Main {
    
    public static void main(String[] args) {

        Library library = new Library("Nairobi Library", "CBD");

        Library.Book book1 = new Library.Book("001", "Java Basics", "John e");
        Library.Book book2 = new Library.Book("002", "Python Guide", "Christine M");

        library.addBook(book1);
        library.addBook(book2);

        Library.LibraryMember member1 = library.new LibraryMember(101, "Pamela");
        library.registerMember(member1);

        member1.borrowBook(book1);
        member1.returnBook(book1);

        library.displayLibraryInfo();
        book1.displayBook();
        book2.displayBook();
    }
}
