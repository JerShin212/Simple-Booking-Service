package SecondVer;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
public class Technician extends User{
    public Technician(String username, String name, String password, String role) {
        super(username, name, password, role);
    }

    public Technician(String data) {
        super(data);
    }

    public String upcomingAppointment() {
        FileHandler fileHandler = new FileHandler();
        String[] appointmentData = fileHandler.readFile("appointments.txt");
        LocalDateTime currentDateTime = LocalDateTime.now();
        LocalDateTime nearestDateTime = null;
        String nearestAppointment = null;

        for (String data : appointmentData) {
            String[] appointment = data.split(",");
            LocalDateTime appointmentDateTime = LocalDateTime.parse(appointment[1] + " " + appointment[2], DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
            long minutesDifference = ChronoUnit.MINUTES.between(currentDateTime, appointmentDateTime);

            if (nearestDateTime == null || Math.abs(minutesDifference) < ChronoUnit.MINUTES.between(currentDateTime, nearestDateTime)) {
                nearestDateTime = appointmentDateTime;
                nearestAppointment = data;
            }
        }

        return nearestAppointment;
    }

    public boolean collectPayment(String username, String date, String time, double amount) {
        if (username != null && date != null && time != null && amount > 0) {
            FileHandler fileHandler = new FileHandler();
            String[] appointmentData = fileHandler.readFile("appointments.txt");
            String paymentFile = "payments.txt";
            for (String data : appointmentData) {
                String[] appointment = data.split(",");
                if (appointment[0].equals(username) && appointment[1].equals(date) && appointment[2].equals(time)) {
                    String updatedAppointment = appointment[0] + "," + appointment[1] + "," + appointment[2] + "," + appointment[3] + "," + appointment[4] + "," + "completed";
                    fileHandler.updateFile("appointments.txt", data, updatedAppointment);
                    String payment = username + "," + date + "," + time + "," + amount;
                    fileHandler.appendFile(paymentFile, payment);
                    return true;
                }
            }
        }
        return false;
    }

    public String[] viewSchedule() {
        FileHandler fileHandler = new FileHandler();
        String[] appointmentData = fileHandler.readFile("appointments.txt");
        String schedule = "";
        
        for (String data : appointmentData) {
            String[] appointment = data.split(",");
            if (appointment[3].equals(this.getUsername())) {
                schedule += appointment[0] + "," + appointment[1] + "," + appointment[2] + "," + appointment[4] + appointment[5] + "\n";
            }
        }
        
        return schedule.split("\n");
    }

    public ArrayList<Appointment> viewScheduleTest() {
        FileHandler fileHandler = new FileHandler();
        String[] appointmentData = fileHandler.readFile("appointments.txt");
        ArrayList<Appointment> appointments = new ArrayList<Appointment>();
        
        for (String data : appointmentData) {
            String[] appointment = data.split(",");
            if (appointment[3].equals(this.getUsername())) {
                Appointment newAppointment = new Appointment(appointment[0], appointment[1], appointment[2], appointment[3], appointment[4], appointment[5]);
                appointments.add(newAppointment);
            }
        }
        
        return appointments;
    }
}
