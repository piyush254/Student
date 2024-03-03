package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name = "Books")
public class Books {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Id parameter will auto generated in a counting  manner
    private int id;
    private String name;
    private int pages;
    @ManyToOne
    @JoinColumn
    Author author;
    public Books() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
