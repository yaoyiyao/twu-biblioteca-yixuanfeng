package com.twu.biblioteca;

/**
 * Created by Administrator on 2016/3/2.
 */
public class Book {
    public String name;
    public String author;
    public String year;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        year = year;
    }

    public Book() {

    }

    public Book(String name, String author, String year) {
        this.name = name;
        this.author = author;
        this.year = year;
    }
}
