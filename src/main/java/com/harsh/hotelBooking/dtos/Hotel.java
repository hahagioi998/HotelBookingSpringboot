package com.harsh.hotelBooking.dtos;

public class Hotel {

    private long id;
    private long[] bookingId;
    private  String name;
    private long addressId;
    private int noOfRooms;
    private int pricePerRoom;
    private int rating;
    private String[] facilities;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long[] getBookingId() {
        return bookingId;
    }

    public void setBookingId(long[] bookingId) {
        this.bookingId = bookingId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAddressId() {
        return addressId;
    }

    public void setAddressId(long addressId) {
        this.addressId = addressId;
    }

    public int getNoOfRooms() {
        return noOfRooms;
    }

    public void setNoOfRooms(int noOfRooms) {
        this.noOfRooms = noOfRooms;
    }

    public int getPricePerRoom() {
        return pricePerRoom;
    }

    public void setPricePerRoom(int pricePerRoom) {
        this.pricePerRoom = pricePerRoom;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String[] getFacilities() {
        return facilities;
    }

    public void setFacilities(String[] facilities) {
        this.facilities = facilities;
    }
}
