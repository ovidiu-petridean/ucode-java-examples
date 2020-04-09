package org.ucode.hotel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelManager {
    private String resourceFilePath;
    private Hotel hotel;

    public HotelManager(String resourceFilePath) throws FileNotFoundException {
        this.resourceFilePath = resourceFilePath;
        hotel = loadHotel();
    }

    public List<Apartment> listApartments() {
        List<Apartment> apartments = new ArrayList<>();

        for (Room room : hotel.getRooms()) {
            if (room instanceof Apartment) {
                apartments.add((Apartment) room);
            }
        }

        return apartments;
    }

    public List<SingleRoom> listSingleRooms() {
        List<SingleRoom> singleRooms = new ArrayList<>();

        for (Room room : hotel.getRooms()) {
            if (room instanceof SingleRoom) {
                singleRooms.add((SingleRoom) room);
            }
        }

        return singleRooms;
    }

    private Hotel loadHotel() throws FileNotFoundException {
        Hotel hotel = null;

        try {
            File hotelFile = new File(resourceFilePath);
            Scanner myReader = new Scanner(hotelFile);
            hotel = loadHotelDetails(myReader);

            //set list of facilities on hotel
            List<String> facilities = loadFacilities(myReader);
            hotel.setFacilities(facilities);

            //set contact details
            Contact contact = loadContact(myReader);
            hotel.setContact(contact);

            //add rooms
            ArrayList<Room> roomsList = loadRooms(myReader);
            hotel.setRooms(roomsList);

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            throw e;
        }

        return hotel;
    }

    private Hotel loadHotelDetails(Scanner myReader) {
        Hotel hotel = new Hotel();

        String line = myReader.nextLine();
        String[] fields = line.split(",");

        hotel.setName(fields[0].trim());
        hotel.setStars(Integer.parseInt(fields[1].trim()));
        hotel.setNoOfParkingSpaces(Integer.parseInt(fields[2].trim()));
        return hotel;
    }

    private List<String> loadFacilities(Scanner myReader) {
        String line;
        String[] fields;
        line = myReader.nextLine();
        //split
        fields = line.split(",");
        //create list with facilities
        List<String> facilities = new ArrayList<String>();

        for (int i = 0; i < fields.length; i++) {
            facilities.add(fields[i].trim());
        }
        return facilities;
    }

    private Contact loadContact(Scanner myReader) {
        String line;
        line = myReader.nextLine();
        String[] contactDetails = line.split(",");
        Address address = new Address(contactDetails[0].trim(), contactDetails[1].trim(), contactDetails[2].trim(), contactDetails[3].trim());
        return new Contact(contactDetails[4].trim(), address, contactDetails[5].trim(), contactDetails[6].trim());
    }

    private ArrayList<Room> loadRooms(Scanner myReader) {
        String line;
        ArrayList<Room> roomsList = new ArrayList<>();
        while (myReader.hasNextLine()) {
            line = myReader.nextLine();
            String[] rooms = line.split(",");
            if (rooms[0].equals("single")) {
                SingleRoom single = new SingleRoom(Integer.parseInt(rooms[1].trim()), Integer.parseInt(rooms[2].trim()),
                        Boolean.parseBoolean(rooms[3]), Boolean.parseBoolean(rooms[4]), Boolean.parseBoolean(rooms[5]),
                        Double.parseDouble(rooms[6].trim()), Integer.parseInt(rooms[7].trim()), Boolean.parseBoolean(rooms[8]));
                roomsList.add(single);
            } else if (rooms[0].equals("apartment")) {
                Apartment apartment = new Apartment(Integer.parseInt(rooms[1].trim()), Integer.parseInt(rooms[2].trim()),
                        Boolean.parseBoolean(rooms[3]), Boolean.parseBoolean(rooms[4]), Boolean.parseBoolean(rooms[5]),
                        Integer.parseInt(rooms[6].trim()), Integer.parseInt(rooms[7].trim()), Boolean.parseBoolean(rooms[8]), Integer.parseInt(rooms[9].trim()));
                roomsList.add(apartment);
            }
        }
        return roomsList;
    }


    public List<Room> listFreeRooms() {
        List<Room> freeRooms = new ArrayList<>();

        for (Room room : hotel.getRooms()) {
            if (!room.isOccupied()) {
                freeRooms.add(room);
            }
        }

        return freeRooms;
    }


    public List<Room> listRoomsWithMaxPrice(double maxPrice) {
        List<Room> roomsWithMaxPrice = new ArrayList<>();

        for (Room room : hotel.getRooms()) {
            if (room.getPrice() < maxPrice) {
                roomsWithMaxPrice.add(room);
            }
        }

        return roomsWithMaxPrice;
    }

    public void rentRoom(int roomNumber) {
        for (Room room : hotel.getRooms()) {
            if (room.getNumber() == roomNumber && !room.isOccupied()) {
                room.setOccupied(true);
            }
        }
    }

    public void freeRoom(int roomNumber) {
        for (Room room : hotel.getRooms()) {
            if (room.getNumber() == roomNumber && room.isOccupied()) {
                room.setOccupied(false);
            }
        }
    }

    public int getOccupiedRatio() {
        int noOfOccupiedRooms = 0;

        for (Room room : hotel.getRooms()) {
            if (room.isOccupied()) {
                noOfOccupiedRooms++;
            }
        }

        return (noOfOccupiedRooms * 100) / hotel.getRooms().size();

    }



    public List<Review> getAllReviewsAboveStars(int stars) {
        List<Review> reviewsList = new ArrayList<>();

        for (Review review : hotel.getReviews()) {
            if (review.getStars() > stars){
                reviewsList.add(review);
            }
        }

        return reviewsList;
    }

    public void giveAReview(Customer customer, int stars, String content) {
        Review review = new Review(stars, content, customer);

        List<Review> currentReviews = hotel.getReviews();
        currentReviews.add(review);
        hotel.setReviews(currentReviews);
    }
}
