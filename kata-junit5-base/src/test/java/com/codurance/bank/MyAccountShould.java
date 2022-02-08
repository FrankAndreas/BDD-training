package com.codurance.bank;

import org.junit.jupiter.api.Test;

import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class MyAccountShould {

    @Test
    void print_header_when_no_transactions() {
        DateProvider dateProvide = mock(DateProvider.class);
        ConsolePrinter consolePrinter = mock(ConsolePrinter.class);

        //Given
        AccountService myAccountService = new MyAccountService(dateProvide, consolePrinter);

        //Act
        myAccountService.printStatement();

        //Verify
        verify(consolePrinter).print("Date | Amount | Balance");
    }

    @Test
    void print_correct_amoun_after_deposit() {
        DateProvider dateProvide = mock(DateProvider.class);
        ConsolePrinter consolePrinter = mock(ConsolePrinter.class);

        //Given
        AccountService myAccountService = new MyAccountService(dateProvide, consolePrinter);
        given(dateProvide.getDate()).willReturn("14/01/2012");

        //Act
        myAccountService.deposit(500);
        myAccountService.printStatement();

        //Verify
        verify(consolePrinter).print("Date | Amount | Balance\n14/01/2012 | 500 | 500");
    }
}
