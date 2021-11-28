package com.institute.software.the.orr.kyle.moviesDB.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.*;
public class cucumberDeleteSD {

    @Autowired
    private FilmRepository filmRepository;
    private Film testFilm;
    private Film response;
    @Given("the film with title {string} is in the database already")
    public void theFilmWithTitleIsInTheDataBase(String title) {
        response = filmRepository.searchByTitleLike(title).get(0);
    }

    @When("i try to delete the existing film")
    public void iTryToDeleteTheExistingFilm() {
        filmRepository.deleteById(response.getFilm_id());
    }

    @Then("the film with title {string} should not be in the database")
    public void theFilmWithTitleShouldNotBeInTheDatabase(String title) {
        assertNotEquals(response.getTitle(), filmRepository.searchByTitleLike(title).toString());
    }
}