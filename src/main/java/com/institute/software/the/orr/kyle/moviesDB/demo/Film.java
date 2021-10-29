package com.institute.software.the.orr.kyle.moviesDB.demo;

public class Film {

    private String title;
    private String genre;
    private int length;

    public Film(String title, String genre, int length) {
        this.title = title;
        this.genre = genre;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public String getJsonObjectOfFilm() {
        return "{" +
                "\"title \" : \" " + title + "\"," +
                "\", \"genre\"=\"" + genre +
                "\", \"length\"=\"" + length +
                "}";
    }
}