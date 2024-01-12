package com.mycompany.hostelhomeappliancesservice;

public class Customer extends User {
    private int customerID;
    private String contactInfo;
    private Service serviceHistory;

    public Customer(int customerID, String contactInfo, Service serviceHistory, int userID, String name, String email, String password) {
        super(userID, name, email, password);
        this.customerID = customerID;
        this.contactInfo = contactInfo;
        this.serviceHistory = serviceHistory;
    }

    public Customer(String contactInfo, Service serviceHistory, String name, String email, String password) {
        super(name, email, password);
        this.contactInfo = contactInfo;
        this.serviceHistory = serviceHistory;
    }

    public Customer(String contactInfo, int userID, String name, String email, String password) {
        super(userID, name, email, password);
        this.contactInfo = contactInfo;
    }

    public Customer(String contactInfo, String name, String email, String password) {
        super(name, email, password);
        this.contactInfo = contactInfo;
    }

    public Customer(int customerID, String contactInfo, String name, String email, String password) {
        super(name, email, password);
        this.customerID = customerID;
        this.contactInfo = contactInfo;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public void setServiceHistory(Service serviceHistory) {
        this.serviceHistory = serviceHistory;
    }

    public int getCustomerID() {
        return customerID;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public Service getServiceHistory() {
        return serviceHistory;
    }

    public String toString() {
        return "Customer ID: " + customerID + "\nContact Info: " + contactInfo + "\nService History: " + serviceHistory;
    }
}
