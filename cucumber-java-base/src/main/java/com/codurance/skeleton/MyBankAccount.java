package com.codurance.skeleton;

import java.util.ArrayList;
import java.util.List;

public class MyBankAccount implements MyBankAccountService {
    private List<Transaction> transactions = new ArrayList<>();
    private ConsolePrinter consolePrinter;
    private DateProvider dateProvider;

    public MyBankAccount(ConsolePrinter consolePrinter, DateProvider dateProvider) {
        this.consolePrinter = consolePrinter;
        this.dateProvider = dateProvider;
    }

    @Override
    public void deposit(int amount) {
        int updatedBalance;

        if(!transactions.isEmpty()){
            updatedBalance = transactions.get(0).getBalance() + amount;
        }
        else
        {
            updatedBalance = + amount;
        }

        transactions.add(0, new Transaction(amount, dateProvider.getDate(), updatedBalance));
    }

    @Override
    public void withdraw(int amount) {
        int updatedBalance;

        if(!transactions.isEmpty()){
            updatedBalance = transactions.get(0).getBalance() - amount;
        }
        else
        {
            updatedBalance = - amount;
        }

        transactions.add(0, new Transaction(-amount,  dateProvider.getDate(), updatedBalance));
    }

    @Override
    public void printStatement() {
        consolePrinter.print("Date | Amount | Balance");
        transactions.forEach(transaction -> {
            consolePrinter.print(transaction.date() + " | " + transaction.amount() + " | " + transaction.getBalance());
        });
    }
}
