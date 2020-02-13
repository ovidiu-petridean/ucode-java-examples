package org.ucode.lecture11.example.cars;

import org.ucode.lecture11.example.Engine;
import org.ucode.lecture11.example.cars.Car;

public class SUV extends Car {

    public SUV(Engine engine) {
        super(engine);
    }

    public void startEngine(String startType){
        System.out.println("SUV engines start faster");
    }
}
