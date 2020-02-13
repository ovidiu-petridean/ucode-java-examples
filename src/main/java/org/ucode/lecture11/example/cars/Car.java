package org.ucode.lecture11.example.cars;

import org.ucode.lecture11.example.Engine;
import org.ucode.lecture11.example.vehicles.Vehicle;

public class Car extends Vehicle {

    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startEngine(String startType){
        System.out.println( startType +" Engine starts with " + engine.getCc());
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }
}
