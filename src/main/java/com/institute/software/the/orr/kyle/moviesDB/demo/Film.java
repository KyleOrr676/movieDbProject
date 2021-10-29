package com.institute.software.the.orr.kyle.moviesDB.demo;

public class Film {

    private String title;
    private String genre;
    private int length;

    public void String Film(String title, String genre, int length) {
        this.title = title;
        this.genre = genre;
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