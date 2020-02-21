package org.ucode.lecture12.interfaces.vehicles;

public interface Vehicle {

    public static final int SPEED_LIMIT = 100;

    String getBrand();

    String speedUp();

    String slowDown();

    default String turnAlarmOn() {
        return "Turning the alarm on.";
    }

    default String turnAlarmOff() {
        return "Turning the alarm off.";
    }

    static int getHorsePower(int rpm, int torque) {
        return (rpm * torque) / 5252;
    }

}