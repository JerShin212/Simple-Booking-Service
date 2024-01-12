package com.mycompany.hostelhomeappliancesservice;

public class Manager extends User {
    private int managerID;

    public Manager(int managerID, int userID, String name, String email, String password) {
        super(userID, name, email, password);
        this.managerID = managerID;
    }

    public Manager(int userID, String name, String email, String password, int managerID) {
        super(userID, name, email, password);
        this.managerID = managerID;
    }

    public Manager(int userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public Manager(String name, String email, String password) {
        super(name, email, password);
    }

    public int getManagerID() {
        return managerID;
    }

    public void setManagerID(int managerID) {
        if (managerID > 0) {
            this.managerID = managerID;
        }
    }

    public void getManagerDetails() {
        System.out.println("Manager ID: " + managerID);
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }

    public String toString() {
        return "Manager ID: " + managerID + "\nUser ID: " + userID + "\nName: " + name + "\nEmail: " + email;
    }

}
