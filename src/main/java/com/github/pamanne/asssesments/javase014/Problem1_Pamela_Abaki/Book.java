package com.github.pamanne.asssesments.javase014.Problem1_Pamela_Abaki;

public class Book extends LibraryItem{
    private String isbn;
    private String genre;
    
    public Book(String isbn,String genre,String itemId,String title,String author){
        super(itemId,title,author);
        this.isbn=isbn;
        this.genre =genre;
    }

    @Override
    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book: "+ getTitle()  + " has been checked out.");
        } else {
            System.out.println("Book: "+ getTitle()  + " is currently not available.");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Book: "+ getTitle()  + " has been returned. Thank you!");
        } else {
            System.out.println("Book: "+ getTitle()  + " was not checked out.");
        }
    }

    @Override
     public void displayDetails() {
        System.out.println("\t BOOK DETAILS ");
        super.displayDetails();
        System.out.println("SBN: " + isbn);
        System.out.println("Genre: " + genre);
        System.out.println();
        
    }
}
