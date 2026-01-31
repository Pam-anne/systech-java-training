package com.github.pamanne.asssesments.javase014.Problem1_Pamela_Abaki;

public class DVD extends LibraryItem {
    private int duration;
    private String rating;

    public DVD(int duration, String rating, String itemId, String title, String author) {
        super(itemId, title, author);
        this.duration = duration;
        this.rating = rating;
    }

    @Override
    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("DVD: "+ getTitle() + " has been checked out.");
        } else {
            System.out.println("DVD: "+ getTitle() + " is currently not available.");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("DVD: "+ getTitle() + " has been returned. Thank you!");
        } else {
            System.out.println("DVD: "+ getTitle() + " was not checked out.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("\t DVD DETAILS");
        super.displayDetails();
        System.out.println("Duration: " + duration);
        System.out.println("Rating: " + rating);
        System.out.println();

    }

}
