package com.institute.software.the.orr.kyle.moviesDB.demo;

import javax.persistence.*;

@Entity
@Table(name ="film")
public class Film {

///////// Attributes

    @Id
    @Column(name = "film_id")
    private int film_id;
    @Column(name = "language_id")
    private int language_id;
    @Column(name = "title")
    private String title;
    @Column(name = "length")
    private int length;
    @Column(name = "release_year")
    private int release_year;
    @Column(name = "rating")
    private String rating;
    @Column(name = "description")
    private String description;

///////// Constructors

    public Film(int film_id, int language_id, String title, int length, int release_year, String rating, String description) {
        this.film_id = film_id;
        this.language_id = language_id;
        this.title = title;
        this.length = length;
        this.release_year = release_year;
        this.rating = rating;
        this.description = description;
    }

///////// Getters and Setters

    public Film() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getReleaseyear() {
        return release_year;
    }

    public void setReleaseyear(int release_year) {
        this.release_year = release_year;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}