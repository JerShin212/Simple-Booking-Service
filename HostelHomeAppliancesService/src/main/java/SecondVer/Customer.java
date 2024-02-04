package SecondVer;

import java.util.ArrayList;
public class Customer extends User{
    public Customer(String username, String name, String password, String role) {
        super(username, name, password, role);
    }
    
    public Customer(String data) {
        super(data);
    }
    
    public String toString() {
        return super.toString();
    }

    public boolean registerAccount() {
        FileHandler fileHandler = new FileHandler();
        String[] userData = fileHandler.readFile("users.txt");
        for (String data : userData) {
            String[] user = data.split(",");
            if (user[0].equals(getUsername())) {
                return false;
            }
        }
        String user = getUsername() + "," + getName() + "," + getPassword() + "," + "customer";
        fileHandler.appendFile("users.txt", user);
        return true;
    }

    public String[] viewAppointmentHistory() {
        FileHandler fileHandler = new FileHandler();
        String[] appointmentData = fileHandler.readFile("appointments.txt");
        String history = "";
        for (String data : appointmentData) {
            String[] appointment = data.split(",");
            if (appointment[0].equals(getUsername())) {
                history += data + "\n";
            }
        }
        return history.split("\n");
    }

    public ArrayList<Appointment> viewAppointmentHistoryTest() {
        FileHandler fileHandler = new FileHandler();
        String[] appointmentData = fileHandler.readFile("appointments.txt");
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        for (String data : appointmentData) {
            String[] appointment = data.split(",");
            if (appointment[0].equals(getUsername())) {
                Appointment newAppointment = new Appointment(appointment[0], appointment[1], appointment[2], appointment[3], appointment[4], appointment[5]);
                appointments.add(newAppointment);
            }
        }
        return appointments;
    }

    public boolean submitFeedback(String date, String time, String technician, String feedback) {
        if (date != null && time != null && technician != null && feedback != null) {
            FileHandler fileHandler = new FileHandler();
            String[] appointmentData = fileHandler.readFile("appointments.txt");
            String feedbackFile = "feedback.txt";
            for (String data : appointmentData) {
                String[] appointment = data.split(",");
                if (appointment[0].equals(getUsername()) && appointment[1].equals(date) && appointment[2].equals(time) && appointment[3].equals(technician)) {
                    String newFeedback = getUsername() + "," + date + "," + time + "," + technician + "," + feedback;
                    fileHandler.appendFile(feedbackFile, newFeedback);
                    return true;
                }
            }
        }
        return false;
    }
}
