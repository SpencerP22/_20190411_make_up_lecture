package edu.missouriwestern.spalmeter.csc254.publications;

import java.time.LocalDate;

public class Book extends Publication{
    private Person author;
    private int pages;

    public Book(String title, LocalDate firstPublication, Person author, int pages) {
        super(title, firstPublication);
        this.author = author;
        this.pages = pages;
    }
    public void setAuthor(Person author) {
        this.author = author;
    }
    public void setAuthor(String firstName, String middleName, String lastName){
        this.author = new Person(firstName,middleName,lastName);
    }
    public void setPages(int pages) {
        this.pages = pages;
    }

    public Person getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }
    @Override
    public String toString(){
        String result = super.toString();
        result += " " + author.bibliographic() + " " + pages + " pages";
        return result;
    }
}
