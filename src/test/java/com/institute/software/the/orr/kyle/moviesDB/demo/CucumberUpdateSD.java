package com.institute.software.the.orr.kyle.moviesDB.demo;//package com.institute.software.the.orr.kyle.moviesDB.demo;
import com.institute.software.the.orr.kyle.moviesDB.demo.FilmRepository;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import static org.junit.Assert.assertEquals;
public class CucumberUpdateSD {

    @Autowired
    private FilmRepository filmRepository;
    @Given("the film with id {int} exists in the database")
    public void theFilmWithIdExistsInTheDatabase(int id) {
        filmRepository.findById(id);
    }

    @When("I update description of film with id {int} to {string}")
    public void iUpdateTheDescription(int id, String description) {
        var testMovie = filmRepository.findById(id).get();
        testMovie.setDescription(description);
        filmRepository.save(testMovie);
    }

    @Then("the film with ID {int} should have description {string} in the database")
    public void iShouldSeeTheUpdatedDescriptionOfMovieWithIdOf(int id, String description) {
        assertEquals(filmRepository.findById(id).get().getDescription(), description);
    }
}
