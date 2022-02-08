package com.codurance.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StepDefinitions {
    MyBankAccount myBankAccount;
    private ConsolePrinter consolePrinter= mock(ConsolePrinter.class);

    @Before
    public void createAccount() {
        myBankAccount = new MyBankAccount(consolePrinter);
    }

    @Given("a client makes a deposit of {int} on {string}")
    public void aClientMakesADepositOfOn(int amount, String date) {
        myBankAccount.deposit(amount);
    }

    @And("a withdrawal of {int} on {string}")
    public void aWithdrawalOfOn(int amount, String date) {
        myBankAccount.withdraw(amount);
    }

    @When("they print their bank statement")
    public void theyPrintTheirBankStatement() {

        myBankAccount.printStatement();
    }

    @Then("they would see: {string}")
    public void theyWouldSeeDateAmountBalance(String input) {
        verify(consolePrinter).print(input);

    }


}
