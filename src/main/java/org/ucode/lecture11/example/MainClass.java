package org.ucode.lecture11.example;

import org.ucode.lecture11.example.cars.SUV;
import org.ucode.lecture11.example.cars.Truck;
import org.ucode.lecture11.example.vehicles.Bycicle;
import org.ucode.lecture11.example.vehicles.Motorcycle;

public class MainClass {

    public static void main(String[] args) {
        Engine suvEngine = new Engine(3000);
        SUV suv = new SUV(suvEngine);
        Engine truckEngine = new Engine(5000);
        Truck truck = new Truck(truckEngine);
        Bycicle bycicle = new Bycicle();
        Motorcycle motorcycle = new Motorcycle();

        suv.startEngine("SUV ");
        truck.startEngine("Truck ");
        motorcycle.startEngine();


    }

}
