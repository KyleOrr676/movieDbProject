package com.institute.software.the.orr.kyle.moviesDB.demo;

import javax.persistence.*;

@Entity
@Table(name ="film")
public class Film {

///////// Attributes

    @Id
    private int film_id;
    private String title;
    private int length;
    private int releaseyear;
    private String rating;
    private String description;

///////// Constructors

    public Film(String title, int length, int releaseyear, String rating, String description) {
        this.title = title;
        this.length = length;
        this.releaseyear = releaseyear;
        this.rating = rating;
        this.description = description;
    }

/////////

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
        return releaseyear;
    }

    public void setReleaseyear(int releaseyear) {
        this.releaseyear = releaseyear;
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