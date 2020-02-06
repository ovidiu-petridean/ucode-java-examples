package org.ucode.midterm.car;

public class Car {

    protected String model;
    protected String make;
    protected Engine engine;

    public Car(String model, String make, String fuel, int cc, int hp, String fuelType) {
        this.model = model;
        this.make = make;
        this.engine = new Engine(cc, hp, fuelType);
    }

    public void accelerate(){
        System.out.println(make + " " + model + " is going faster now");
    }

    public void breakCar(){
        System.out.println(make + " " + model + " is going slower now");
    }

    @Override
    public String toString() {
        return "" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", engine=" + engine;
    }
}
