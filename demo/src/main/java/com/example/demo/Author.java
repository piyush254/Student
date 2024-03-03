package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "Author")
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private int id;
    private String Author;

    private int booksWritten;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String Author) {
        this.Author = Author;
    }

    public int getBooksWritten() {
        return booksWritten;
    }

    public void setBooksWritten(int booksWritten) {
        this.booksWritten = booksWritten;
    }
}
