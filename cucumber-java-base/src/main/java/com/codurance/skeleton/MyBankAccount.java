package com.codurance.skeleton;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class MyBankAccount implements MyBankAccountService {
    private List<Transaction> transactions = new ArrayList<>();
    private  ConsolePrinter consolePrinter;
    public MyBankAccount(ConsolePrinter consolePrinter) {
        this.consolePrinter = consolePrinter;
    }
    @Override
    public void deposit(int amount) {
        transactions.add(new Transaction(amount, LocalDate.now()));
    }

    @Override
    public void withdraw(int amount) {
        transactions.add(new Transaction(-amount, LocalDate.now()));
    }

    @Override
    public void printStatement() {
        consolePrinter.print("Date | Amount | Balance");
        AtomicInteger balance = new AtomicInteger();
        transactions.forEach(transaction -> {
            balance.addAndGet(transaction.amount());
            consolePrinter.print(transaction.date() + " | " + transaction.amount() + " | " + balance);
        });
    }
}
