package com.codurance.skeleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class MyBankAccountShould {
    @Test
    void print_only_header_after_account_created(){

    }
    @Test
    void deposit_stores_a_value()
    {
        ConsolePrinter printer = mock(ConsolePrinter.class);
        MyBankAccountService account = new MyBankAccount(printer);
        account.deposit(100);

        account.printStatement();

        verify(printer).print("Date | Amount | Balance");
        verify(printer).print("08/02/2022 | 100 | 100");
    }
}