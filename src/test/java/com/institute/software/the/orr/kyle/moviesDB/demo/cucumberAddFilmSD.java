package com.institute.software.the.orr.kyle.moviesDB.demo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class cucumberAddFilmSD extends Film {

Film newFilm;

    @Autowired
    private FilmRepository filmRepository;

    @Given("I have the information for the film")
    public void checkInformation(){
        newFilm = new Film(1, 1, "The Dark Knight", 134, "Batman movie");
    }
    @When("I add The Dark Knight onto the website")
    public void addFilm(){
        filmRepository.save(newFilm);
    }
    @Then("I should be told Film added successfully")
    public void checkForFilm(){
        assertEquals(filmRepository.findById(newFilm.getFilm_id()), newFilm);
    }
    @When("I add the already existing film to the website")
    public void addExistingFilm(){
        filmRepository.save(newFilm);
    }
    @Then("I should be told film already exists on website")
    public void checkIfExists() {
        assertEquals(filmRepository.findById(newFilm.getFilm_id()), newFilm);
    }
}
