package com.institute.software.the.orr.kyle.moviesDB.demo;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class cucumberAddFilmSD {

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
//    @Then("I should be told Film added successfully")
//    public void iShouldBeTold()

    @Then("I should be told this film has already been added")
    public void i_should_be_told_this_film_has_already_been_added() {
        Optional <Film> film2 = filmRepository.findById(1);
        Film AddedFilm = film2.get();
        assertEquals(AddedFilm.getTitle(), newFilm.getTitle());
        throw new io.cucumber.java.PendingException();
    }
//    @When("I add the already existing film to the website")
//    public void iAddTheAlreadyExistingFilmToTheWebsite() {
//    }
}
