package com.institute.software.the.orr.kyle.moviesDB.demo;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class cucumberAddFilmSD {

Film newFilm;
Film addedFilm;

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
    @Then("I should be told {string}")
    public void iShouldBeTold() {
        assertEquals(filmRepository.findById(newFilm.getFilm_id()), newFilm);
    }

    @When("I add the already existing film to the website")
    public void iAddTheAlreadyExistingFilmToTheWebsite() {
    }
}
