package com.example.library.model;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Book {

    private String id;
    private String title;
    private String author;
    private int year;
    private String description;

    // constructor
    public Book(String title, String author, int year, String description) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.description = description;
    }

    // // getters and setters
    // public String getId() {
    // return id;
    // }

    // public void setId(String id) {
    // this.id = id;
    // }

    // public String getTitle() {
    // return title;
    // }

    // public void setTitle(String title) {
    // this.title = title;
    // }

    // public String getAuthor() {
    // return author;
    // }

    // public void setAuthor(String author) {
    // this.author = author;
    // }

    // public int getYear() {
    // return year;
    // }

    // public void setYear(int year) {
    // this.year = year;
    // }

    // public String getDescription() {
    // return description;
    // }

    // public void setDescription(String description) {
    // this.description = description;
    // }

}
