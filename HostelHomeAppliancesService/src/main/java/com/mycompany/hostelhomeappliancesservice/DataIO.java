package com.mycompany.hostelhomeappliancesservice;
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
    public static ArrayList<Feedback> allFeedbacks = new ArrayList<Feedback>();
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
                int id = Integer.parseInt(appointment[0]);
                User customer = checkUser(appointment[1]);
                User technician = checkUser(appointment[6]);
                Appointment newAppointment = new Appointment(id, customer, appointment[2], appointment[3], appointment[4], appointment[5], technician, appointment[7]);
                allAppointments.add(newAppointment);
            }
            appointmentScanner.close();

            File paymentFile = new File("payments.txt");
            checkFile(paymentFile);
            Scanner paymentScanner = new Scanner(paymentFile);
            while (paymentScanner.hasNextLine()) {
                String data = paymentScanner.nextLine();
                String[] payment = data.split(",");
                int id = Integer.parseInt(payment[0]);
                User customer = checkUser(payment[1]);
                User technician = checkUser(payment[5]);
                Payment newPayment = new Payment(id, customer, payment[2], payment[3], payment[4], technician, payment[6], payment[7]);
                allPayments.add(newPayment);
            }
            paymentScanner.close();
            
            File feedbackFile = new File("feedbacks.txt");
            checkFile(feedbackFile);
            Scanner feedbackScanner = new Scanner(feedbackFile);
            while (feedbackScanner.hasNextLine()) {
                String data = feedbackScanner.nextLine();
                String[] feedback = data.split(",");
                int id = Integer.parseInt(feedback[0]);
                User customer = checkUser(feedback[2]);
                User technician = checkUser(feedback[1]);
                Feedback newFeedback = new Feedback(id, technician, customer, feedback[1], feedback[2], feedback[3], feedback[5]);
                allFeedbacks.add(newFeedback);
            }
            feedbackScanner.close();
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
                appointmentWriter.write(appointment.getId() + "," + appointment.getCustomer().getUsername() + "," + appointment.getDate() + "," + appointment.getTime() + "," + appointment.getLocation() + "," + appointment.getDescription() + "," + appointment.getTechnician().getUsername() + "," + appointment.getStatus() + "\n");
            }
            appointmentWriter.close();

            File paymentFile = new File("payments.txt");
            checkFile(paymentFile);
            FileWriter paymentWriter = new FileWriter("payments.txt");
            for (Payment payment : allPayments) {
                paymentWriter.write(payment.getId() + "," + payment.getCustomer().getUsername() + "," + payment.getDate() + "," + payment.getTime() + "," + payment.getDescription() + "," + payment.getTechnician().getUsername() + "," + payment.getFees() + "," + payment.getStatus() + "\n");
            }
            paymentWriter.close();

            File feedbackFile = new File("feedbacks.txt");
            checkFile(feedbackFile);
            FileWriter feedbackWriter = new FileWriter("feedbacks.txt");
            for (Feedback feedback : allFeedbacks) {
                feedbackWriter.write(feedback.getId() + "," + feedback.getTechnician().getUsername() + "," + feedback.getCustomer().getUsername() + "," + feedback.getDate() + "," + feedback.getTime() + "," + feedback.getDescription() + "," + feedback.getFeedback() + "\n");
            }
            feedbackWriter.close();
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

    public static Appointment Exist(String date, String time, String description, String customer) {
        for (Appointment appointment : allAppointments) {
            if (appointment.getDate().equals(date) && appointment.getTime().equals(time) && appointment.getDescription().equals(description) && appointment.getCustomer().getUsername().equals(customer)) {
                return appointment;
            }
        }
        return null;
    }

    public static Appointment recentAppointment(String customer) {
        Appointment closestAppointment = null;
        LocalDate currentDate = LocalDate.now();
        for (Appointment appointment : allAppointments) {
            LocalDate appointmentDate = LocalDate.parse(appointment.getDate());
            if (appointmentDate.isAfter(currentDate) && (closestAppointment == null || appointmentDate.isBefore(LocalDate.parse(closestAppointment.getDate()))) && !appointment.getStatus().equals("paid") && !appointment.getStatus().equals("completed")){
                closestAppointment = appointment;
            }
        }
        return closestAppointment;
    }

    public static Appointment checkId(int id) {
        for (Appointment appointment : allAppointments) {
            if (appointment.getId() == id) {
                return appointment;
            }
        }
        return null;
    }

}

    

