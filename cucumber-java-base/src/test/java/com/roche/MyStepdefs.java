package com.roche;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.File;

public class MyStepdefs {
    @Given("a new {string} input file produced by system XY")
    public void aNewInputFileProducedBySystemXY(String inputFile) {
        File newFile = new File(inputFile);
    }

    @When("^the file is received in our inbound folder$")
    public void theFileIsReceivedInOurInboundFolder() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("^the file is moved to the remote server$")
    public void theFileIsMovedToTheRemoteServer() {
        throw new io.cucumber.java.PendingException();
    }

    @Given("^a new \"([^\"]*)\" existing input file produced by system XY$")
    public void aNewExistingInputFileProducedBySystemXY(String arg0) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("^the filename is normalized by adding the account number and timestamp$")
    public void theFilenameIsNormalizedByAddingTheAccountNumberAndTimestamp() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("^the file is discarded$")
    public void theFileIsDiscarded() {
        throw new io.cucumber.java.PendingException();
    }

    @And("^the remote server is not available$")
    public void theRemoteServerIsNotAvailable() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("^the system should retry to send it after (\\d+) minutes$")
    public void theSystemShouldRetryToSendItAfterMinutes(int arg0) {
        throw new io.cucumber.java.PendingException();
    }
}
