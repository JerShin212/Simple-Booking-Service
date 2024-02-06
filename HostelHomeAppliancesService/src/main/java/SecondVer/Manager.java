package SecondVer;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;
public class Manager extends User{
    public Manager(String username, String name, String password, String role) {
        super(username, name, password, role);
    }
    
    public Manager(String data) {
        super(data);
    }
    
    public String toString() {
        return super.toString();
    }

    public boolean createAccount(String username, String name, String password, String role) {
        if (username != null && name != null && password != null && role != null) {
            FileHandler fileHandler = new FileHandler();
            String[] userData = fileHandler.readFile("users.txt");
            for (String data : userData) {
                String[] user = data.split(",");
                if (user[0].equals(username)) {
                    return false;
                }
            }
            String user = username + "," + name + "," + password + "," + role;
            fileHandler.appendFile("users.txt", user);
            return true;
        }
        return false;
    }

    public boolean bookAppointment(String username, String date, String time, String technician, String description) {
        if (username != null && date != null && time != null && technician != null && description != null) {
            FileHandler fileHandler = new FileHandler();
            String[] appointmentData = fileHandler.readFile("appointments.txt");
            // if (!isValidFutureDate(date) || !isValidFutureTime(time)) {
            //     return false;
            // }
            for (String data : appointmentData) {
                String[] appointment = data.split(",");
                if (appointment[0].equals(username) && appointment[1].equals(date) && appointment[2].equals(time)) {
                    return false;
                }
            }
            String appointment = username + "," + date + "," + time + "," + technician + "," + description + "," + "pending";
            fileHandler.appendFile("appointments.txt", appointment);
            //Appointment newAppointment = new Appointment(username, date, time, technician, description);
            return true;
        }
        return false;
        
    }

    public String viewTechnicianSchedule(String technician) {
        if (technician != null) {
            FileHandler fileHandler = new FileHandler();
            String[] appointmentData = fileHandler.readFile("appointments.txt");
            String schedule = "";
            for (String data : appointmentData) {
                String[] appointment = data.split(",");
                if (appointment[3].equals(technician)) {
                    schedule += appointment[0] + "," + appointment[1] + "," + appointment[2] + "," + appointment[4] + "\n";
                }
            }
            return schedule;
        }
        return null;
    }

    public boolean checkTechnicianExists(User[] userData, String technician) {
        if (technician != null) {
            for (User user : userData) {
                if (user.getUsername().equals(technician) && user.getRole().equals("technician")) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean checkCustomerExists(User[] userData, String customer) {
        if (customer != null) {
            for (User user : userData) {
                if (user.getUsername().equals(customer) && user.getRole().equals("customer")) {
                    return true;
                }
            }
        }
        return false;
    }

    
    public boolean isValidFutureDate(String date) {
        if (date != null) {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            try {
                Date currentDate = new Date();
                Date inputDate = dateFormat.parse(date);
                if (inputDate.after(currentDate)) {
                    return true;
                }
            } catch (ParseException e) {
                return false;
            }
        }
        return false;
    }

    public boolean isValidFutureTime(String time) {
        if (time != null) {
            SimpleDateFormat timeFormat = new SimpleDateFormat("HH:mm");
            timeFormat.setLenient(false);
            try {
                Date currentTime = new Date();
                Date inputTime = timeFormat.parse(time);
                if (inputTime.after(currentTime)) {
                    return true;
                }
            } catch (ParseException e) {
                return false;
            }
        }
        return false;
    }
}