package org.ucode.lecture12.examples;

public abstract class Vehicle {

    public String name;

    public abstract void accelerate();
    public abstract void slowDown();
//    public abstract void calculatePrice();

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
