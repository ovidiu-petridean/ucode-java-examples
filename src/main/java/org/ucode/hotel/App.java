package org.ucode.hotel;

import java.io.FileNotFoundException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class App {

    public static void main(String[] args) throws FileNotFoundException, ParseException {
        HotelManager hotelManager = new HotelManager("/Users/opetridean/ucode/factory/src/main/resources/hotel.txt");
        List<Apartment> apartments = hotelManager.listApartments();
        List<SingleRoom> singleRooms = hotelManager.listSingleRooms();

        //List all free rooms
        List<Room> freeRooms = hotelManager.listFreeRooms();
        //List all rooms with a given maximum price
        double maxPrice = 140;
        List<Room> roomsWithPrice = hotelManager.listRoomsWithMaxPrice(maxPrice);

        //Set room as occupied
        List<Apartment> allApartments = hotelManager.listApartments();
        //rent an room
        hotelManager.rentRoom(1);
        hotelManager.freeRoom(1);

        //list % occupation
        hotelManager.rentRoom(1);
        hotelManager.rentRoom(2);
        hotelManager.rentRoom(3);

        hotelManager.getOccupiedRatio();

        //Create a customer
        DateFormat formatter = new SimpleDateFormat("dd MM yyyy");
        Date birthDate = formatter.parse("12 03 1977");
        Date issuedAt = formatter.parse("12 03 1997");
        Date expiresAt = formatter.parse("12 03 2017");
        IdentityCard identityCard = new IdentityCard(birthDate, issuedAt, expiresAt, "Somewhere in London", "177989898653531");
        Customer customer = new Customer("Borris", "Jhonson", identityCard, "bjhonson@gov.co.uk", false);

        hotelManager.giveAReview(customer, 5, "The staying was awesome");
        hotelManager.giveAReview(customer, 3, "The staying was ok");
        hotelManager.giveAReview(customer, 4, "The staying was blah");

        //get all reviews above x stars
        int stars = 3;
        List<Review> reviewsList = hotelManager.getAllReviewsAboveStars(stars);
        System.out.println(reviewsList);

    }


}
