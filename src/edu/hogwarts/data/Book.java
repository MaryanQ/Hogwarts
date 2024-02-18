package edu.hogwarts.data;

public class Book extends TeachingMaterial {
    private String author;
    private int year;
    private String publisher;

    public Book(String name, String author, int year, String publisher) {
        super(name);
        this.author = author;
        this.year = year;
        this.publisher = publisher;
    }
}