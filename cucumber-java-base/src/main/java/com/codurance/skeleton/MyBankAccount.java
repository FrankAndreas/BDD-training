package com.codurance.skeleton;

public class MyBankAccount implements MyBankAccountService {

    public MyBankAccount(ConsolePrinter consolePrinter) {
    }
    @Override
    public void deposit(int amount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void withdraw(int amount) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void printStatement() {
        throw new UnsupportedOperationException();
    }
}
