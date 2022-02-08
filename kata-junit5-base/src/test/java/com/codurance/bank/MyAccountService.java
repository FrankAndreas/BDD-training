package com.codurance.bank;

import java.util.ArrayList;
import java.util.List;

public class MyAccountService implements AccountService {
    private List<String> transactions;
    private int balance = 0;
    private DateProvider dateProvider;
    private ConsolePrinter consolePrinter;

    public MyAccountService(DateProvider dateProvider, ConsolePrinter consolePrinter) {
        transactions = new ArrayList<>();
        this.dateProvider = dateProvider;
        this.consolePrinter = consolePrinter;
    }

    @Override
    public void deposit(int amount) {
        this.balance += amount;
        String newTransaction = dateProvider.getDate() + " | " + amount + " | " + this.balance;
        this.transactions.add(newTransaction);
    }

    @Override
    public void withdraw(int amount) {
        this.balance -= amount;
        String newTransaction = dateProvider.getDate() + " | -" + amount + " | " + this.balance;
        this.transactions.add(newTransaction);
    }

    @Override
    public void printStatement() {
        if(transactions.isEmpty()){
            consolePrinter.print("Date | Amount | Balance");
        }
        else{
            String printedTransactions = "Date | Amount | Balance\n";

            for(String transaction : transactions){
                printedTransactions += transaction;
            }

            consolePrinter.print(printedTransactions);
        }
    }
}
