package com.example.demo.model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Submission {
    @Id
    @Column(name = "submission_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String category;

    private LocalDate uploadedAt;

    private String photographerName;

    private String imageUrl;

    public Submission(String title, String category, String photographerName, String imageUrl) {
        this.title = title;
        this.category = category;
        this.uploadedAt = LocalDate.now();
        this.photographerName = photographerName;
        this.imageUrl = imageUrl;
    }

    public Submission() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getUploadedAt() {
        return uploadedAt;
    }

    public void setUploadedAt(LocalDate uploadedAt) {
        this.uploadedAt = uploadedAt;
    }

    public String getPhotographerName() {
        return photographerName;
    }

    public void setPhotographerName(String photographerName) {
        this.photographerName = photographerName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
