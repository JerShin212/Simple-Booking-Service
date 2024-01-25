package com.mycompany.hostelhomeappliancesservice;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
import java.time.LocalDateTime;
public class Schedule {
    FileHandler fileHandler = new FileHandler();
    private String scheduleID;
    private String technicianID;
    private List<Appointment> appointments;

    public Schedule(String scheduleID, String technicanID) {
        this.scheduleID = scheduleID;
        this.technicianID = technicanID;
    }

    public Schedule(String technicianID) {
        this.technicianID = technicianID;
        this.appointments = loadAppointments();
    }

    private List<Appointment> loadAppointments() {
        List<String> lines = fileHandler.readFile("appointment.txt");
        List<Appointment> loadAppointments = new ArrayList<>();
        for (String line : lines) {
            String[] data = line.split(",");
            if (data[2].equals(this.technicianID)) {
                Appointment appointment = new Appointment(data[0], data[1], data[2], data[3], LocalDateTime.parse(data[4]), data[5]);
                loadAppointments.add(appointment);
            }
        }
        return loadAppointments;
    }

    private boolean checkAvailability(LocalDateTime dateTime) {
        for (Appointment existingAppointment : appointments) {
            if (existingAppointment.getDate().equals(dateTime.toString()) && existingAppointment.getTechnicianID().equals(this.technicianID)) {
                return false;
            }
        }
        return true;
    }

    public void saveAppointments() {
        List<String> lines = new ArrayList<>();
        for (Appointment appointment : appointments) {
            String line = String.join(",", appointment.getAppointmentID(), appointment.getCustomerID(), appointment.getTechnicianID(), appointment.getServiceID(), appointment.getDate(), appointment.getStatus());
            lines.add(line);
        }
        fileHandler.writeFile("appointment.txt", lines);
    }

    public void addAppointment(Appointment appointment) {
        LocalDateTime appointmentDate = LocalDateTime.parse(appointment.getDate());
        if (!checkAvailability(appointmentDate)) {
            System.out.println("Appointment is not available.");
            return;
        }

        this.appointments.add(appointment);
    }

    public void removeAppointment(String appointmentID) {
        Iterator<Appointment> iterator = appointments.iterator();
        boolean isRemoved = false;
        while (iterator.hasNext()) {
            Appointment appointment = iterator.next();
            if (appointment.getAppointmentID().equals(appointmentID)) {
                iterator.remove();
                isRemoved = true;
                break;
            }
        }
        if (isRemoved) {
            saveAppointments();
        } else {
            System.out.println("Appointment not found.");
        }
    }

    public void updateAppointment(String appointmentID, Appointment appointment) {
        Iterator<Appointment> iterator = appointments.iterator();
        while (iterator.hasNext()) {
            Appointment existingAppointment = iterator.next();
            if (existingAppointment.getAppointmentID().equals(appointmentID)) {
                iterator.remove();
                addAppointment(appointment);
                return;
            }
        }
        System.out.println("Appointment not found.");
    }

    public List<Appointment> getAppointments() {
        return this.appointments;
    }

    
}
