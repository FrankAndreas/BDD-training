package com.codurance.skeleton;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class StepDefinitions {
    MyBankAccount myBankAccount;
    private ConsolePrinter consolePrinter= mock(ConsolePrinter.class);
    DateProvider dateProvider= mock(DateProvider.class);

    @Before
    public void createAccount() {
        myBankAccount = new MyBankAccount(consolePrinter, dateProvider);
    }

    @Given("a client makes a deposit of {int} on {string}")
    public void aClientMakesADepositOfOn(int amount, String date) {
        given(dateProvider.getDate()).willReturn(date);
        myBankAccount.deposit(amount);
    }

    @And("a withdrawal of {int} on {string}")
    public void aWithdrawalOfOn(int amount, String date) {
        given(dateProvider.getDate()).willReturn(date);
        myBankAccount.withdraw(amount);
    }

    @When("they print their bank statement")
    public void theyPrintTheirBankStatement() {

        myBankAccount.printStatement();
    }

    @Then("they would see:")
    public void theyWouldSeeDateAmountBalance(List<String> input) {
        for(String line : input){
            verify(consolePrinter).print(line);
        }
    }
}
