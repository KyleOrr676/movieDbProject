package com.institute.software.the.orr.kyle.moviesDB.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import static org.junit.Assert.assertEquals;
//@SpringBootTest
public class cucumberFindFilmSD {

    @Autowired
    private FilmRepository filmRepository;
    private Film testFilm;
    private List<Film> response;
    private String actualTitle;
    @Given("the film with title {string} is in the database")
    public void FilmIsInDatabase(String title) {
    }
    @When("i search for film with title {string}")
    public void SearchForFilmId(String title) {
        response = filmRepository.searchByTitleLike(title);
    }
    @Then("i should see film info")
    public Film SeeFilmInfo() {
        actualTitle = "AMERICAN CIRCUS";
        assertEquals(response.get(0).getTitle(), actualTitle);
        return response.get(0);
    }
}
