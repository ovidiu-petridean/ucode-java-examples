package org.ucode.midterm.car;

public class Engine {
    private int cc;
    private int hp;
    private String fuelType;

    public Engine(int cc, int hp, String fuelType) {
        this.cc = cc;
        this.hp = hp;
        this.fuelType = fuelType;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "" +
                "cc=" + cc +
                ", hp=" + hp +
                ", fuelType=" + fuelType
                ;
    }
}
