//package com.institute.software.the.orr.kyle.moviesDB.demo;
//
//import cucumber.api.PendingException;
//
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//public class cucumberFindFilm {
//
//    private String Title;
//    private String actualTitle;
//    private String expectedTitle = "Ace Goldfinger";
//
//    Film cucumberFilm = new Film(2, 1, "Ace Goldfinger", 48, "Movie film");
//
//    @Given("Ace Goldfinger is on the Website")
//    public void AceGoldfngerIsOnTheWebsite(){Title = "Ace Goldfinger";
//    }
//
//    @When("I search for {string}")
//    public void iSearchFor(String string) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Then("I should be told {string}")
//    public void iShouldBeTold(String string) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    @Given("^Ace Goldfinger is not on the Website$")
//    public void aceGoldfingerIsNotOnTheWebsite() {
//    }
//
//    @Then("^I should be told \"([^\"]*)\"$")
//    public void iShouldBeTold(String arg0) throws Throwable {
//        // Write code here that turns the phrase above into concrete actions
//        throw new PendingException();
//    }
//
//    //    @When("I search for Ace Goldfinger")
////    public void ISearchForAceGoldfinger() {actualTitle = cucumberFilm.getTitle();
////    }
////
////    @Then("I should be told {string}")
////    public void IShouldBeTold(String string) {assertEquals(expectedTitle, actualTitle);
////    }
//}
