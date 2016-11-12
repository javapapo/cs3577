package com.javapapo;


import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class StepDefinitions {

    private UserLookUpService service;
    private String theUserName;

    @Given("^I use the userlookup service$")
    public void useTheUserLookUpService() {
        service = new UserLookUpService();
    }

    @When("^I enter the username (.+)$")
    public void userUsername(String aUsername) {
        theUserName = aUsername;
    }

    @Then("^the name (.+) should show up$")
    public void checkFullName(String expectedFullName) {
        String name = service.getFullName(theUserName).get();
        Assert.assertEquals(expectedFullName, name);
    }
}
