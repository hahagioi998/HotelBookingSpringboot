package com.harsh.hotelBooking.entities;

import java.util.Date;

public class Booking {

    private long id;
    private String status;
    private String modeOfPayments;
    private String isRefundAvailable;
    private Date fromDate;
    private Date toDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getModeOfPayments() {
        return modeOfPayments;
    }

    public void setModeOfPayments(String modeOfPayments) {
        this.modeOfPayments = modeOfPayments;
    }

    public String getIsRefundAvailable() {
        return isRefundAvailable;
    }

    public void setIsRefundAvailable(String isRefundAvailable) {
        this.isRefundAvailable = isRefundAvailable;
    }

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
}
