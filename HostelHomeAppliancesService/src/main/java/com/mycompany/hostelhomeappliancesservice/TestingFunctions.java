package com.mycompany.hostelhomeappliancesservice;

import java.time.LocalDateTime;

public class TestingFunctions {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "ManagerName", "manager@email.com", "password");
        Schedule schedule = new Schedule("2");

        // Schedule an appointment
        LocalDateTime dateTime = LocalDateTime.now().plusDays(2); // Future date
        LocalDateTime dateTime2 = LocalDateTime.now().minusDays(5); // Past date
        manager.manageAppointment("1", "2", "ServiceID", dateTime, "scheduled");
        schedule.saveAppointments();

        // Assign a technician
        manager.assignTechnicianToAppointment("ap001", "2");

        Schedule techSchedule = manager.viewTechnicianSchedule("2");
        System.out.println("Technician's Schedule: " + techSchedule.getAppointments());

        // Cancel an appointment
        manager.cancelAppointment("ap003");

        // Update technician's schedule
        Appointment updatedAppointment = new Appointment("ap002", "1", "2", "ServiceID", dateTime2, "updated status");
        manager.updateTechnicianSchedule("2", updatedAppointment);
    
    }
}
