package com.mycompany.hostelhomeappliancesservice;

import java.time.LocalDateTime;
import java.util.List;

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
            System.out.println("Appointment scheduled successfully.");
            return "Appointment scheduled successfully.";
        } else {
            System.out.println("Appointment scheduling failed.");
            return "Appointment scheduling failed.";
        }
    }

    public Schedule viewTechnicianSchedule(String technicianID) {
        String fileSchedule = "schedule.txt";
        List<String> lines = fileHandler.readFile(fileSchedule);

        for (String line : lines) {
            String[] scheduleData = line.split(",");
            if (scheduleData[2].equals(technicianID)) {
                System.out.println("Schedule data length: " + scheduleData.length);
                // Schedule techSchedule = convertToSchedule(scheduleData);
                // return techSchedule;
                return convertToSchedule(scheduleData);
            }
                
        }
        return null;
    }

    private Schedule convertToSchedule(String[] scheduleData) {
        String technicianID = scheduleData[2];
        Schedule schedule = new Schedule(technicianID);

        String[] appointmentData = scheduleData[0].split(",");
        System.out.println("Appointment data length: " + appointmentData.length);
        if (appointmentData.length == 6) {
            Appointment appointment = new Appointment(appointmentData[0], appointmentData[1], 
                                                    appointmentData[2], appointmentData[3], 
                                                    LocalDateTime.parse(appointmentData[4]), appointmentData[5]);
            // Add the appointment to the schedule
            schedule.addAppointment(appointment);
        }
        return schedule;
    }

    public String assignTechnicianToAppointment(String appointmentID, String technicianID) {
        Appointment appointmentToAssign = getAppointmentById(appointmentID);
        if (appointmentToAssign != null) {
            return appointmentToAssign.assignTechnician(technicianID);
        } else {
            return "Appointment not found.";
        }
    }

    private Appointment getAppointmentById(String appointmentID) {
        String fileAppointment = "appointment.txt";
        List<String> linesAppointment = fileHandler.readFile(fileAppointment);
        for (String line : linesAppointment) {
            String[] appointmentData = line.split(",");
            if (appointmentData[0].equals(appointmentID)) {
                // Create and return an Appointment object
                return new Appointment(appointmentData[0], appointmentData[1], 
                                       appointmentData[2], appointmentData[3], 
                                       LocalDateTime.parse(appointmentData[4]), appointmentData[5]);
            }
        }
        return null; // Return null if no matching appointment is found
    }
    
    public String cancelAppointment(String appointmentID) {
        Appointment appointmentToCancel = getAppointmentById(appointmentID);
        if (appointmentToCancel != null) {
            System.out.println("cancel appointment successful");
            return appointmentToCancel.cancel(appointmentID);
        } else {
            System.out.println("cancel appointment failed");
            return "Appointment not found.";
        }
    }

    public String updateTechnicianSchedule(String technicianID, Appointment updatedAppointment) {
        Schedule schedule = viewTechnicianSchedule(technicianID);
        if (schedule != null) {
            // Modify the schedule
            // For example, update an existing appointment
            schedule.updateAppointment(updatedAppointment.getAppointmentID(), updatedAppointment);
            
            // Save the updated schedule to the file
            schedule.saveAppointments();
            
            return "Schedule updated successfully.";
        } else {
            return "Technician schedule not found.";
        }
    }

}
