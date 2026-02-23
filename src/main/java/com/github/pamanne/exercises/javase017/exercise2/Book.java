package com.github.pamanne.exercises.javase017.exercise2;

public class Book implements Comparable<Book>{
    private String title;
    private String author;

    public Book(String title,String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }


    @Override
    public int compareTo(Book other){
        int titleCompare=this.title.compareTo(other.title);
        if(titleCompare != 0){
            return titleCompare;
        }

        return this.author.compareTo(other.author);

    }

    @Override
    public String toString(){
        return "Book{ Title:" +title + ", Author:"+ author +"}";
    }
    
}
