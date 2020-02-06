package org.ucode.lecture9;

public class Transaction {
    private int accountId;
    private String date;
    private int amount;
    private int currentBallance;
    String type;

    public Transaction(int accountId, String date, int amount, int currentBallance, String type) {
        this.accountId = accountId;
        this.date = date;
        this.amount = amount;
        this.currentBallance = currentBallance;
        this.type = type;
    }

    public int getAccountId() {
        return accountId;
    }

    public String getDate() {
        return date;
    }

    public int getAmount() {
        return amount;
    }

    public int getCurrentBallance() {
        return currentBallance;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "accountId=" + accountId +
                ", date='" + date + '\'' +
                ", amount=" + amount +
                ", currentBallance=" + currentBallance +
                ", type='" + type + '\'' +
                '}';
    }
}
