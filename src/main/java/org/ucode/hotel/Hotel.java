package org.ucode.hotel;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    private String name;
    private int stars;
    private List<Room> rooms;
    private List<String> facilities;
    private int noOfParkingSpaces;
    private Contact contact;
    private List<Review> reviews;

    public Hotel() {
        reviews = new ArrayList<>();
    }

    public Hotel(String name, int stars, List<Room> rooms, List<String> facilities, int noOfParkingSpaces, Contact contact) {
        this.name = name;
        this.stars = stars;
        this.rooms = rooms;
        this.facilities = facilities;
        this.noOfParkingSpaces = noOfParkingSpaces;
        this.contact = contact;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStars() {
        return stars;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<String> getFacilities() {
        return facilities;
    }

    public void setFacilities(List<String> facilities) {
        this.facilities = facilities;
    }

    public int getNoOfParkingSpaces() {
        return noOfParkingSpaces;
    }

    public void setNoOfParkingSpaces(int noOfParkingSpaces) {
        this.noOfParkingSpaces = noOfParkingSpaces;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }
}
