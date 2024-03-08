package com.mycompany.hostelhomeappliancesservice;

public class Appointment {
    private int id;
    private User customer;
    private String date;
    private String time;
    private String location;
    private String description;
    private User technician;
    private String status;

    public Appointment(int id, User customer, String date, String time, String location, String description, User technician, String status) {
        this.id = id;
        this.customer = customer;
        this.date = date;
        this.time = time;
        this.location = location;
        this.description = description;
        this.technician = technician;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public User getCustomer() {
        return customer;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getLocation() {
        return location;
    }

    public String getDescription() {
        return description;
    }

    public User getTechnician() {
        return technician;
    }

    public String getStatus() {
        return status;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTechnician(Technician technician) {
        this.technician = technician;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}
