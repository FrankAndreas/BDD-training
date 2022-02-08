package com.codurance.skeleton;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Transaction {
    private int transaction;
    private LocalDate date;

    Transaction(int transaction, LocalDate date){
        this.transaction = transaction;
        this.date = date;
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
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
