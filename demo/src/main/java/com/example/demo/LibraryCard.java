package com.example.demo;

import jakarta.persistence.*;

@Entity
@Table(name="Card")
public class LibraryCard {
    @Id
    private int cardNumber;
    private int fine;
    private int bookIssued;
    @Enumerated(value = EnumType.STRING) // To store value in db in the type of String
    private CardStatus cardStatus;
    @OneToOne // mapping relation between two table that is parent and child
    @JoinColumn // add a foreign key column ---> define the column by default is thr primary key of parent class
    user User;
}
