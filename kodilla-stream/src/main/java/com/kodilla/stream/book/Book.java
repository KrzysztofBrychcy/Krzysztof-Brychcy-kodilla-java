package com.kodilla.stream.book;

public class Book {
    private final String title;
    private final String author;
    private final int yearOfProduction;
    private final String signature;

    public Book(String title, String author, int yearOfProduction, String signature) {
        this.title = title;
        this.author = author;
        this.yearOfProduction = yearOfProduction;
        this.signature = signature;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public String getSignature() {
        return signature;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}
