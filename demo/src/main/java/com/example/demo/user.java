package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity //So that hibernate can identify whose attribute is to take for table creation
@Table(name = "user_info") // it is  used for giving table name by default table name is equals to class name
public class user {
    @Id // It is written on the attribute which have to be a private key
    private int id; // id is a primary key to make that key is primary key
    private String name;
    private String age;
    private String mobNumber;

    //    @Column(name = "EmailId", unique = true
    private String email;

    @Column(name = "Email", unique = true)
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    // Always create a default constructor
    public user() {

    }

    public String getMobNumber() {
        return mobNumber;
    }

    public void setMobNumber(String mobNumber) {
        this.mobNumber = mobNumber;
    }

    public user(int id, String name, String age, String mobNumber, String email) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mobNumber = mobNumber;
        this.email = email;
    }
}
