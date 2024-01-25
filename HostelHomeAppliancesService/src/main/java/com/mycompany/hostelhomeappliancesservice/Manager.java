package com.mycompany.hostelhomeappliancesservice;

import java.time.LocalDateTime;

public class Manager extends User{
    FileHandler fileHandler = new FileHandler();

    public Manager(int userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public Manager(String userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public String manageAppointment(String customerID, String technicianID, String serviceID, LocalDateTime date, String status) {
        String newAppointmentID = Utility.generateAppointmentID();
        Appointment appointment = new Appointment(newAppointmentID, customerID, technicianID, serviceID, date, status);
        if (appointment.schedule().equals("Success")) {
            return "Appointment scheduled successfully.";
        } else {
            return "Appointment scheduling failed.";
        }
    }

    public Schedule viewTechnicianSchedule(String technicianID) {
        Schedule schedule = new Schedule(technicianID);
        return schedule;
    }
}
