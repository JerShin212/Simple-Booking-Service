package com.mycompany.hostelhomeappliancesservice;

public class Technician extends User{
    FileHandler fileHandler = new FileHandler();
    private String technicianID;

    public Technician(int userID, String name, String email, String password, String technicianID) {
        super(userID, name, email, password);
        this.technicianID = technicianID;
    }

    public Technician(String userID, String name, String email, String password, String technicianID) {
        super(userID, name, email, password);
        this.technicianID = technicianID;
    }
}
