package org.ucode.hotel;

public abstract class Room {

    public int number;
    public int noOfbeds;
    public boolean isSomking;
    public boolean hasMiniBar;
    public boolean isOccupied;
    public double price;
    public int sizeInSqrFt;

    public Room(int number, int noOfbeds, boolean isSomking, boolean hasMiniBar, boolean isOccupied, double price, int sizeInSqrFt) {
        this.number = number;
        this.noOfbeds = noOfbeds;
        this.isSomking = isSomking;
        this.hasMiniBar = hasMiniBar;
        this.isOccupied = isOccupied;
        this.price = price;
        this.sizeInSqrFt = sizeInSqrFt;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNoOfbeds() {
        return noOfbeds;
    }

    public void setNoOfbeds(int noOfbeds) {
        this.noOfbeds = noOfbeds;
    }

    public boolean isSomking() {
        return isSomking;
    }

    public void setSomking(boolean somking) {
        isSomking = somking;
    }

    public boolean isHasMiniBar() {
        return hasMiniBar;
    }

    public void setHasMiniBar(boolean hasMiniBar) {
        this.hasMiniBar = hasMiniBar;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getSizeInSqrFt() {
        return sizeInSqrFt;
    }

    public void setSizeInSqrFt(int sizeInSqrFt) {
        this.sizeInSqrFt = sizeInSqrFt;
    }
}
