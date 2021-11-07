package com.institute.software.the.orr.kyle.moviesDB.demo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class cucumberFindFilmSD {

    @Autowired
    private FilmRepository testFilmRepository;

    private String actualTitle;
    Film cucumberFilm;

    @Given("Ace Goldfinger is on the Website")
    public void AceGoldfngerIsOnTheWebsite(){
        cucumberFilm = new Film(2, 1, "Ace Goldfinger", 48, "Movie film");
        testFilmRepository.save(cucumberFilm);
    }
    @When("I search for {string}")
    public void ISearchFor(String arg0) {
//        cucumberFilm testFilm = testFilmRepository.findAll().forEach();

    }
    @Then("I should be told {string}")
    public String IShouldBeTold(String string) {assertEquals(cucumberFilm.getTitle(), actualTitle);
        return actualTitle;
    }
//    @Given("^Ace Goldfinger is not on the Website$")
//    public void AceGoldfingerIsNotOnTheWebsite() {
//    }
}
