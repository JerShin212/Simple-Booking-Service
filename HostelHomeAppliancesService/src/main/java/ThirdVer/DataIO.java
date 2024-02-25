package ThirdVer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.time.LocalDate;
public class DataIO {
    public static ArrayList<User> allUsers = new ArrayList<User>();
    public static ArrayList<Appointment> allAppointments = new ArrayList<Appointment>();
    public static void read() {
        try {
            File userFile = new File("users.txt");
            checkFile(userFile);
            Scanner userScanner = new Scanner(userFile);
            while (userScanner.hasNextLine()) {
                String data = userScanner.nextLine();
                String[] user = data.split(",");
                User newUser = new User(user[0], user[1], user[2], user[3]);
                allUsers.add(newUser);
            }
            userScanner.close();

            File appointmentFile = new File("appointments.txt");
            checkFile(appointmentFile);
            Scanner appointmentScanner = new Scanner(appointmentFile);
            while (appointmentScanner.hasNextLine()) {
                String data = appointmentScanner.nextLine();
                String[] appointment = data.split(",");
                User customer = checkUser(appointment[0]);
                User technician = checkUser(appointment[4]);
                Appointment newAppointment = new Appointment((Customer) customer, appointment[1], appointment[2], appointment[3], (Technician) technician, appointment[5]);
                allAppointments.add(newAppointment);
            }
            appointmentScanner.close();
        
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            
        }
    }

    public static void write() {
        try {
            File userFile = new File("users.txt");
            checkFile(userFile);
            FileWriter userWriter = new FileWriter("users.txt");
            for (User user : allUsers) {
                userWriter.write(user.getUsername() + "," + user.getName() + "," + user.getPassword() + "," + user.getRole() + "\n");
            }
            userWriter.close();

            File appointmentFile = new File("appointments.txt");
            checkFile(appointmentFile);
            FileWriter appointmentWriter = new FileWriter("appointments.txt");
            for (Appointment appointment : allAppointments) {
                appointmentWriter.write(appointment.getCustomer().getUsername() + "," + appointment.getDate() + "," + appointment.getTime() + "," + appointment.getDescription() + "," + appointment.getTechnician().getUsername() + "," + appointment.getStatus() + "\n");
            }
            appointmentWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void checkFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static User checkUser (String username) {
        for (User user : allUsers) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }

    public static boolean checkDate() {
    LocalDate today = LocalDate.now();
        for (Appointment appointment : allAppointments) {
            if (appointment.getDate().equals(today.toString())) {
                return false;
            }
        }
        return true;
    }
}
