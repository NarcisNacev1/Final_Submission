package com.example.demo.model;

import jakarta.persistence.*;

@Entity
public class Judge {
    @Id
    @Column(name = "judge_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String firstName;
    private String lastName;

    private String expertise;

    public Judge(String firstName, String lastName, String expertise) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.expertise = expertise;
    }

    public Judge() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }
}
