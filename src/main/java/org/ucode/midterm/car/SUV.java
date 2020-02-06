package org.ucode.midterm.car;

public class SUV extends Car{

    boolean isForByFor;

    public SUV(String model, String make, String fuel, int cc, int hp, String fuelType, boolean isForByFor) {
        super(model, make, fuel, cc, hp, fuelType);
        this.isForByFor = isForByFor;
    }

    @Override
    public String toString() {
        return "SUV{" +
                super.toString() +
                ", isForByFor=" + isForByFor +
                '}';
    }
}
