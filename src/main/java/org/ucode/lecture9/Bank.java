package org.ucode.lecture9;

public class Bank {

    public static void main(String[] args) {
        Account account = new Account(1, "John", "Smith");
        Account account2 = new Account(2, "Queen", "Elisabeth");
        System.out.println(account.toString());
//        System.out.println(account2.toString());
//        account.deposit(100);
//        account.deposit(1000);

        int currentAmount = account.getCurrentBalance();
//        account2.deposit(500);
//        System.out.println(account2.toString());
        for (Transaction transaction : account.getTransactions()) {
            System.out.println(transaction);
        }

        System.out.println(account.toString());

    }
}
