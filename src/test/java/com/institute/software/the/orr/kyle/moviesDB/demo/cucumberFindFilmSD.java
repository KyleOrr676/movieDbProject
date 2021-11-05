package com.institute.software.the.orr.kyle.moviesDB.demo;

import cucumber.api.PendingException;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
@SpringBootTest
public class cucumberFindFilmSD {

    private String actualTitle;

    Film cucumberFilm = new Film(2, 1, "Ace Goldfinger", 48, "Movie film");

    @Given("Ace Goldfinger is on the Website")
    public void AceGoldfngerIsOnTheWebsite(){actualTitle = "Ace Goldfinger";
    }
    @When("I search for {string}")
    public void ISearchFor(String arg0) {actualTitle = cucumberFilm.getTitle();
    }
    @Then("I should be told {string}")
    public String IShouldBeTold(String string) {assertEquals(cucumberFilm.getTitle(), actualTitle);
        return actualTitle;
    }
//    @Given("^Ace Goldfinger is not on the Website$")
//    public void AceGoldfingerIsNotOnTheWebsite() {
//    }
}
