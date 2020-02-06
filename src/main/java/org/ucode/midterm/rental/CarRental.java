package org.ucode.midterm.rental;

import org.ucode.midterm.car.*;

public class CarRental {

    public static void main(String[] args) {
//        Car car = new Car("Model 3", "Tesla", "Electric", 2000, 500, "electric");
        SUV suv = new SUV("X", "Tesla", "Electric", 2000, 500, "electric", true);
        Truck truck = new Truck("autentic", "MAN", "Orice", 6000, 200, "Orice", 8);

        System.out.println(suv.toString());
        suv.accelerate();

        System.out.println(truck.toString());
        truck.accelerate();
    }
}
