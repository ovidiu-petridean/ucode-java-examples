package org.ucode.lecture11.example.vehicles;

import org.ucode.lecture11.example.Engine;

public class Motorcycle extends Vehicle {

    private Engine engine;

    public Motorcycle() {
        this.engine = new Engine(500);
    }

    public void startEngine(){
        System.out.println("Motorcycle engine starts with " + engine.getCc());
    }

}
