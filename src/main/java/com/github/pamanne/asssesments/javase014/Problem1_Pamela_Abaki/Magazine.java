package com.github.pamanne.asssesments.javase014.Problem1_Pamela_Abaki;

public class Magazine extends LibraryItem {
    private int issueNumber;
    private String publicationDate;

    public Magazine(String publicationDate, int issueNumber, String itemId, String title, String author) {
        super(itemId, title, author);
        this.publicationDate = publicationDate;
        this.issueNumber = issueNumber;
    }

    @Override
    public void checkout() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Magazine: "+ getTitle()  + " has been checked out.");
        } else {
            System.out.println("Magazine: "+ getTitle()  + " is currently not available.");
        }
    }

    @Override
    public void returnItem() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("Magazine: "+ getTitle()  + " has been returned. Thank you!");
        } else {
            System.out.println("Magazine: "+ getTitle()  + " was not checked out.");
        }
    }

    @Override
    public void displayDetails() {
        System.out.println("\t MAGAZINE DETAILS ");
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
        System.out.println("Publication Date: " + publicationDate);
        System.out.println();

    }

}
