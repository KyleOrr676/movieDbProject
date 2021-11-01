package com.institute.software.the.orr.kyle.moviesDB.demo;

import javax.persistence.*;

@Entity
@Table(name ="film")
public class Film {

    @Id
    private int film_id;
    private String title;
    private int length;
    @Column(name ="release_year")
    private int releaseyear;




    public Film(String title, int length, int releaseyear) {
        this.title = title;
        this.length = length;
        this.releaseyear = releaseyear;
    }

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

    //    public String getJsonObjectOfFilm() {
//        return "{" +
//                "\"title \" : \" " + title + "\"," +
//                "\", \"genre\"=\"" + genre +
//                "\", \"length\"=\"" + length +
//                "}";
//    }
}