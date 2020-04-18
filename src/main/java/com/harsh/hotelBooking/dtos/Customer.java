package com.harsh.hotelBooking.dtos;

public class Customer {

    private long id;
    private String name;
    private long[] bookingId;
    private String emailId;
    private long phoneNumber;
    private String gender;
    private long[] addressId;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long[] getBookingId() {
        return bookingId;
    }

    public void setBookingId(long[] bookingId) {
        this.bookingId = bookingId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public long[] getAddressId() {
        return addressId;
    }

    public void setAddressId(long[] addressId) {
        this.addressId = addressId;
    }
}
