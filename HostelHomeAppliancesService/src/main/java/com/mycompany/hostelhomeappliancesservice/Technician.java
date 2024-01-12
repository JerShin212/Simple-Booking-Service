package com.mycompany.hostelhomeappliancesservice;

public class Technician extends User {
    private int technicianID;
    private String specialization;

    public Technician(int technicianID, int userID, String name, String email, String password, String specialization) {
        super(userID, name, email, password);
        this.technicianID = technicianID;
        this.specialization = specialization;
    }

    public Technician(int userID, String name, String email, String password, int technicianID, String specialization) {
        super(userID, name, email, password);
        this.technicianID = technicianID;
        this.specialization = specialization;
    }

    public Technician(int userID, String name, String email, String password, String specialization) {
        super(userID, name, email, password);
        this.specialization = specialization;
    }

    public Technician(String name, String email, String password, String specialization) {
        super(name, email, password);
        this.specialization = specialization;
    }

    public int getTechnicianID() {
        return technicianID;
    }

    public void setTechnicianID(int technicianID) {
        if (technicianID > 0) {
            this.technicianID = technicianID;
        }
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        if (specialization != null) {
            this.specialization = specialization;
        }
    }

    public void getTechnicianDetails() {
        System.out.println("Technician ID: " + technicianID);
        System.out.println("User ID: " + userID);
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
        System.out.println("Specialization: " + specialization);
    }

    public String toString() {
        return "Technician ID: " + technicianID + "\nUser ID: " + userID + "\nName: " + name + "\nEmail: " + email;
    }
}
