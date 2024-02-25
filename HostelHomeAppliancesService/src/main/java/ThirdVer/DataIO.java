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
    public static ArrayList<Payment> allPayments = new ArrayList<Payment>();
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
                Appointment newAppointment = new Appointment(customer, appointment[1], appointment[2], appointment[3], technician, appointment[5]);
                allAppointments.add(newAppointment);
            }
            appointmentScanner.close();

            File paymentFile = new File("payments.txt");
            checkFile(paymentFile);
            Scanner paymentScanner = new Scanner(paymentFile);
            while (paymentScanner.hasNextLine()) {
                String data = paymentScanner.nextLine();
                String[] payment = data.split(",");
                User customer = checkUser(payment[0]);
                User technician = checkUser(payment[4]);
                Payment newPayment = new Payment(customer, payment[1], payment[2], payment[3], technician, payment[5]);
                allPayments.add(newPayment);
            }
            paymentScanner.close();
        
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

            File paymentFile = new File("payments.txt");
            checkFile(paymentFile);
            FileWriter paymentWriter = new FileWriter("payments.txt");
            for (Payment payment : allPayments) {
                paymentWriter.write(payment.getCustomer().getUsername() + "," + payment.getDate() + "," + payment.getTime() + "," + payment.getDescription() + "," + payment.getTechnician().getUsername() + "," + payment.getStatus() + "\n");
            }
            paymentWriter.close();
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

    public static boolean checkDate(String date) {
        LocalDate currentDate = LocalDate.now();
        LocalDate appointmentDate = LocalDate.parse(date);
        if (appointmentDate.isAfter(currentDate)) {
            return true;
        }
        return false;
    
    }

    public static boolean checkTime(String time) {
        String[] parts = time.split(":");
        int hour = Integer.parseInt(parts[0]);
        int minute = Integer.parseInt(parts[1]);
        if (hour >= 8 && hour <= 17) {
            if (hour == 17 && minute > 0) {
                return false;
            }
            return true;
        }
        return false;
        
    }

    public static boolean checkAppointment(String date, String time, String technician, String customer) {
        for (Appointment appointment : allAppointments) {
            if (appointment.getDate().equals(date) && appointment.getTime().equals(time) && appointment.getTechnician().getUsername().equals(technician)) {
                return false;
            }
            if (appointment.getDate().equals(date) && appointment.getTime().equals(time) && appointment.getCustomer().getUsername().equals(customer)) {
                return false;
            }
        }
        return true;
    }

}

    

