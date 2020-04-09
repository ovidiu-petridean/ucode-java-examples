package org.ucode.lecture12.method;

public class Salary extends Employee {
    private double salary;   // Annual salary

    public Salary(String name, String address, int number) {
        super(name, address, number);
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + getName());
        return salary/52;
    }
    // Remainder of class definition

}