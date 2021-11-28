package com.institute.software.the.orr.kyle.moviesDB.demo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.Assert.assertEquals;
@SpringBootTest
public class cucumberAddFilmSD {

    @Autowired
    private FilmRepository filmRepository;
    private Film testFilm;
    @Given("the film information is available")
    public void theFilmInformationIsAvailable() {
    }
    @When("i try to add the film with Film ID {int}, language ID {int}, title {string}, length {int}, description {string} to the database")
    public void iTryToAddTheFilmWithFilmIDLanguageIDTitleLengthDescriptionToTheDatabase(int film_id, int language_id, String title, int length, String description) {
        testFilm = new Film(film_id, language_id, title, length, description);
        filmRepository.save(testFilm);
    }
    @Then("the new film in the database should have Film ID {int}, language ID {int}, title {string}, length {int}, description {string}")
    public void theNewFilmInTheDatabaseShouldHaveFilmIDLanguageIDTitleLengthDescription(int film_id, int language_id, String title, int length, String description) {
        int idForNewFilm = filmRepository.searchByTitleLike(title).get(0).getFilm_id();
        assertEquals(filmRepository.findById(idForNewFilm).get().getLanguage_id(), language_id);
        assertEquals(filmRepository.findById(idForNewFilm).get().getTitle(), title);
        assertEquals(filmRepository.findById(idForNewFilm).get().getLength(), length);
        assertEquals(filmRepository.findById(idForNewFilm).get().getDescription(), description);
    }
}