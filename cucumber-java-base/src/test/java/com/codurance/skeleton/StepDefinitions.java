package com.codurance.skeleton;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions {

    @Given("an account is created")
    public void anAccountIsCreated() {
        MyBankAccount myBankAccount = new MyBankAccount();
    }

    @When("they print their bank statement")
    public void theyPrintTheirBankStatement() {
        throw new io.cucumber.java.PendingException();
    }

    @Then("they would see: {string}")
    public void theyWouldSeeDateAmountBalance(String input) {
        throw new io.cucumber.java.PendingException();
    }
}
