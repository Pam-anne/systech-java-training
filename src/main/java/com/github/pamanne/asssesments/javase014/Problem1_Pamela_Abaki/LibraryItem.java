package com.github.pamanne.asssesments.javase014.Problem1_Pamela_Abaki;

public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;
    protected boolean isAvailable;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
        this.isAvailable = true;

    }

    

    public String getTitle(){
        return title;
    }

   

    public abstract void checkout();

    public abstract void returnItem() ;

    public void displayDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

}
