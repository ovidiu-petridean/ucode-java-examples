package org.ucode.hotel;

public class SingleRoom extends Room {
    private boolean hasBunkbeds;


    public SingleRoom(int number, int noOfbeds, boolean isSomking, boolean hasMiniBar, boolean isOccupied, double price, int sizeInSqrFt, boolean hasBunkbeds) {
        super(number, noOfbeds, isSomking, hasMiniBar, isOccupied, price, sizeInSqrFt);
        this.hasBunkbeds = hasBunkbeds;
    }

    public boolean isHasBunkbeds() {
        return hasBunkbeds;
    }

    public void setHasBunkbeds(boolean hasBunkbeds) {
        this.hasBunkbeds = hasBunkbeds;
    }
}
