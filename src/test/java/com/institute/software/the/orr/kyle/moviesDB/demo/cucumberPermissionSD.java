//package com.institute.software.the.orr.kyle.moviesDB.demo;
//
//import com.institute.software.the.orr.kyle.moviesDB.demo.AdminMember;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//public class PermissionsStepDefinitions {
//
//    static String permission(boolean accessGranted) {return AdminMember.equals(accessGranted) ? "Yes, access granted" : "No, access denied";}
//
//    private boolean accessGranted;
//    private boolean accessDenied;
//    private String actualAccessGranted;
//
//    @Given("I am a member of the admin team")
//    public void I_am_a_member_of_the_admin_team(){
//        boolean accessGranted = true;
//    }
//    @Given("I am not a member of the admin team")
//    public void I_am_not_a_member_of_the_admin_team(){
//        boolean accessDenied = false;
//    }
//    @When("I make a change on the website")
//    public void I_make_a_change_on_the_website(){
//        actualAccessGranted = PermissionsStepDefinitions.permission(accessGranted);
//    }
//    @Then("I should be told")
//    public void I_should_be_told()
//    {assertEquals(expectedAnswer, actualAccessGranted);}
//}