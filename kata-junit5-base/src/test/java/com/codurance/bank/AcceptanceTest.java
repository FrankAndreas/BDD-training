package com.codurance.bank;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;


public class AcceptanceTest {

    @Test
    void this_is_an_example() {
        assertThat(true ).isEqualTo(true);
    }

    @Test
    void printStatement_prints_account_history(){

        DateProvider dateProvide = mock(DateProvider.class);
        ConsolePrinter consolePrinter = mock(ConsolePrinter.class);;
        AccountService myAccountService = new MyAccountService(dateProvide, consolePrinter);

        //Given
        myAccountService.deposit(1000);
        myAccountService.deposit(2000);
        myAccountService.withdraw(500);

        //Act
        myAccountService.printStatement();

        //Assert
        verify(consolePrinter).print("Date | Amount | Balance\n14/01/2012 | -500 | 2500\n13/01/2012 | 2000 | 3000\n10/01/2012 | 1000 | 1000 ");
    }
}
