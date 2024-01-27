package com.mycompany.hostelhomeappliancesservice;

import java.time.LocalDateTime;
import java.util.List;
public class Appointment {
    FileHandler fileHandler = new FileHandler();
    private String appointmentID;
    private String customerID;
    private String technicianID;
    private String serviceID;
    private LocalDateTime date;
    private String status;

    public Appointment(String appointmentID, String customerID, String technicianID, String serviceID, LocalDateTime date, String status) {
        this.appointmentID = appointmentID;
        this.customerID = customerID;
        this.technicianID = technicianID;
        this.serviceID = serviceID;
        this.date = date;
        this.status = status;
    }
    
    public String schedule() {
        String fileAppointment = "appointment.txt";
        String fileUser = "users.txt";
        List<String> linesUser = fileHandler.readFile(fileUser);

        // Validate if customerID and technicianID are in users.txt
        boolean isCustomerValid = false;
        boolean isTechnicianValid = false;
        for (String line : linesUser) {
            String[] user = line.split(",");
            if (user[5].equals(this.customerID)) {
                isCustomerValid = true;
            }
            if (user[5].equals(this.technicianID)) {
                isTechnicianValid = true;
            }
        }

        if (!isCustomerValid || !isTechnicianValid) {
            return "Invalid customerID or technicianID.";
        }
        
        // Ensure date is not in the past
        LocalDateTime currentDateTime = LocalDateTime.now();
        if (date == null || this.date.isBefore(currentDateTime)) {
            return "Invalid date. Please choose a future date.";
        }
        
        String newLine = this.appointmentID + "," + this.customerID + "," + this.technicianID + "," + this.serviceID + "," + this.date + "," + this.status;
        String writeResult = fileHandler.appendFile(fileAppointment, newLine);
        if (!writeResult.equals("Success")) {
            return writeResult;
        }
        return "Success";
    }

    public String reschedule(String appointmentID, LocalDateTime date) {
        String fileAppointment = "appointment.txt";
        List<String> linesAppointment = fileHandler.readFile(fileAppointment);
        for (String line : linesAppointment) {
            String[] appointment = line.split(",");
            if (appointment[0].equals(appointmentID)) {
                // Ensure date is not in the past
                LocalDateTime currentDateTime = LocalDateTime.now();
                if (date.isBefore(currentDateTime)) {
                    return "Invalid date. Please choose a future date.";
                }
                appointment[4] = date.toString();
                String newData = String.join(",", appointment);
                String writeResult = fileHandler.updateFile(fileAppointment, line, newData);
                if (!writeResult.equals("Success")) {
                    return writeResult;
                }
                return "Success";
            }
        }
        return "Invalid appointmentID.";
    }

    public String cancel(String appointmentID) {
        String fileAppointment = "appointment.txt";
        List<String> linesAppointment = fileHandler.readFile(fileAppointment);
        for (String line : linesAppointment) {
            String[] appointment = line.split(",");
            if (appointment[0].equals(appointmentID)) {
                appointment[5] = "cancelled";
                String newData = String.join(",", appointment);
                String writeResut = fileHandler.updateFile(fileAppointment, line, newData);
                if (!writeResut.equals("Success")) {
                    return writeResut;
                }
                return "Success";
            }
        }
        return "Invalid appointmentID.";
    }

    public String complete(String appointmentID) {
        String fileAppointment = "appointment.txt";
        List<String> linesAppointment = fileHandler.readFile(fileAppointment);
        for (String line : linesAppointment) {
            String[] appointment = line.split(",");
            if (appointment[0].equals(appointmentID)) {
                appointment[5] = "completed";
                String newData = String.join(",", appointment);
                String writeResult = fileHandler.updateFile(fileAppointment, line, newData);
                if (!writeResult.equals("Success")) {
                    return writeResult;
                }
                return "Success";
            }
        }
        return "Invalid appointmentID.";
    }

    public String viewAppointment(String appointmentID) {
        String fileAppointment = "appointment.txt";
        List<String> linesAppointment = fileHandler.readFile(fileAppointment);
        for (String line : linesAppointment) {
            String[] appointment = line.split(",");
            if (appointment[0].equals(appointmentID)) {
                return line;
            }
        }
        return "Invalid appointmentID.";
    }

    public String assignTechnician(String technicianID) {
        String fileAppointment = "appointment.txt";
        String fileUser = "users.txt";
        List<String> linesUser = fileHandler.readFile(fileUser);

        // Check if technicianID exists in users.txt
        boolean technicianExists = false;
        for (String userLine : linesUser) {
            String[] user = userLine.split(",");
            if (user[0].equals(technicianID)) {
                technicianExists = true;
                break;
            }
        }

        if (!technicianExists) {
            return "Invalid technicianID.";
        }

        List<String> linesAppointment = fileHandler.readFile(fileAppointment);
        for (String line : linesAppointment) {
            String[] appointment = line.split(",");
            if (appointment[0].equals(this.appointmentID)) {
                appointment[2] = technicianID;
                String newData = String.join(",", appointment);
                String writeResult = fileHandler.updateFile(fileAppointment, line, newData);
                if (!writeResult.equals("Success")) {
                    return writeResult;
                }
                return "Success";
            }
        }
        return "Invalid appointmentID.";
    }

    public Service getService() {
        Service service = new Service(this.serviceID);
        service.retrieveService();
        return service;
    }

    public String getDate() {
        return this.date.toString();
    }

    public String getAppointmentID() {
        return this.appointmentID;
    }

    public String getTechnicianID() {
        return this.technicianID;
    }

    public String getServiceID() {
        return this.serviceID;
    }

    public String getStatus() {
        return this.status;
    }

    public String getCustomerID() {
        return this.customerID;
    }

    public String toString() {
        return this.appointmentID + "," + this.customerID + "," + this.technicianID + "," + this.serviceID + "," + this.date + "," + this.status;
    }
}
