package org.ucode.lecture9;

import java.util.*;
//import java.util.Date;

public class Account {
    private int accountId;
    private String ownerFirstName;
    private String ownerLastName;
    public int currentBalance;
    private ArrayList<Transaction> transactions;

    public Account(int accountId, String ownerFirstName, String ownerLastName) {
        this.accountId = accountId;
        this.ownerFirstName = ownerFirstName;
        this.ownerLastName = ownerLastName;
        this.currentBalance = 0;
        transactions = new ArrayList<>();
    }

    public void deposit(int amount) throws Exception{
        if (amount > 10_000_000){
            throw new Exception("Go home Mr Tiriac");
        }

        currentBalance += amount;
        Transaction transaction = new Transaction(this.accountId, new Date().toString(), amount, currentBalance, "deposit");
        transactions.add(transaction);
        System.out.println();
    }

    public void setOwnerLastName(String ownerLastName) {
        this.ownerLastName = ownerLastName;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getOwnerFirstName() {
        return ownerFirstName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public int getCurrentBalance() {
        return currentBalance;
    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + accountId +
                ", ownerFirstName='" + ownerFirstName + '\'' +
                ", ownerLastName='" + ownerLastName + '\'' +
                ", currentAmount=" + currentBalance +
                '}';
    }
}
