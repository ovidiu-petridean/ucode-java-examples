package org.ucode.hotel;

public class Apartment extends Room {
    private boolean hasKitchen;
    private int noOfSpaces;

    public Apartment(int number, int noOfbeds, boolean isSomking, boolean hasMiniBar, boolean isOccupied, double price, int sizeInSqrFt, boolean hasKitchen, int noOfSpaces) {
        super(number, noOfbeds, isSomking, hasMiniBar, isOccupied, price, sizeInSqrFt);
        this.hasKitchen = hasKitchen;
        this.noOfSpaces = noOfSpaces;
    }

    public boolean isHasKitchen() {
        return hasKitchen;
    }

    public void setHasKitchen(boolean hasKitchen) {
        this.hasKitchen = hasKitchen;
    }
}
