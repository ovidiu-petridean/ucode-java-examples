package org.ucode.lecture5;

public class BankDemo {

    public static void main(String [] args) {
        CheckingAccount c = new CheckingAccount(101);
        System.out.println("Depositing $500...");
        c.deposit(25000.00);

        try {
            System.out.println("\nWithdrawing $100...");
            c.withdraw(100.00);
            System.out.println("\nWithdrawing $600...");
            c.withdraw(11000.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Sorry, but you are short $" + e.getAmount());
//            e.printStackTrace();
        } catch (InvalidAmountException e) {
            System.out.println("Amount must be between 10 and 900");
        }
        System.out.println("Leaving the ATM");
    }
}