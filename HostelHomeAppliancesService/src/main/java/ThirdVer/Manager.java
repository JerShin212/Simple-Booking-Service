package ThirdVer;

public class Manager extends User{
    public Manager(String username, String name, String password, String role) {
        super(username, name, password, role);
    }
    
    public void createCustomer(String username, String name, String password) {
        User user = new User(username, name, password, "customer");
        DataIO.allUsers.add(user);
        DataIO.write();
    }

    public Appointment createAppointment(String userCustomer, String userTechnician, String date, String time, String description) {
        User customer = DataIO.checkUser(userCustomer);
        User technician = DataIO.checkUser(userTechnician);
        Appointment appointment = new Appointment((Customer) customer, date, time, description, (Technician) technician, "pending");
        DataIO.allAppointments.add(appointment);
        DataIO.write();
        return appointment;
    }
}
