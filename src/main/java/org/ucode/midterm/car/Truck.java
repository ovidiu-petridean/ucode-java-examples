package org.ucode.midterm.car;

public class Truck extends Car {

    private int noOfWheels;

    public Truck(String model, String make, String fuel, int cc, int hp, String fuelType, int noOfWheels) {
        super(model, make, fuel, cc, hp, fuelType);
        this.noOfWheels = noOfWheels;
    }

    public void accelerate(){
        System.out.println(super.make + " " + model + " is trying to go faster now");
    }
}
