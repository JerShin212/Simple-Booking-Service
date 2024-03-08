package com.mycompany.hostelhomeappliancesservice;

public class Manager extends User{
    public Manager(String username, String name, String password, String role) {
        super(username, name, password, role);
    }
    
    public void createCustomer(String username, String name, String password) {
        User user = new User(username, name, password, "customer");
        DataIO.allUsers.add(user);
        DataIO.write();
    }

    public Appointment createAppointment(String userCustomer, String userTechnician, String date, String time, String location, String description) {
        User customer = DataIO.checkUser(userCustomer);
        User technician = DataIO.checkUser(userTechnician);
        int id = DataIO.allAppointments.size() + 1;
        Appointment appointment = new Appointment(id, customer, date, time, location, description, technician, "pending");
        DataIO.allAppointments.add(appointment);
        DataIO.write();
        return appointment;
    }
}
