package com.codurance.skeleton;

import java.util.Objects;

public class Transaction {
    private int transaction;
    private int balance;
    private String date;

    Transaction(int transaction, String date, int balance){
        this.transaction = transaction;
        this.date = date;
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Transaction that = (Transaction) o;
        return transaction == that.transaction && Objects.equals(date, that.date);
    }

    @Override
    public int hashCode() {
        return Objects.hash(transaction, date);
    }

    public int amount() {
        return transaction;
    }

    public String date() {
        return date;
    }
}
