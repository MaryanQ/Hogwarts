package edu.hogwarts.data;

import edu.hogwarts.data.TeachingMaterial;

public class TextBook extends TeachingMaterial {
    private String author;
    private String publisher;
    private int publicationYear;

    public TextBook() {
        
    }

    public TextBook(String name, String author, String publisher, int publicationYear) {
        super(name);
        this.author = author;
        this.publisher = publisher;
        this.publicationYear = publicationYear;
    }

 

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    

    @Override
    public String toString() {
        return "edu.hogwarts.data.TextBook{" +
                "name='" + getName() + '\'' +
                ", author='" + author + '\'' +
                ", publisher='" + publisher + '\'' +
                ", publicationYear=" + publicationYear +
                '}';
    }
}
