package com.mycompany.hostelhomeappliancesservice;
import java.util.List;
public class Utility {
    public static String generateAppointmentID() {
        String filePath = "appointment.txt";
        FileHandler fileHandler = new FileHandler();
        List<String> lines = fileHandler.readFile(filePath);
        if (!lines.isEmpty()) {
            String lastLine = lines.get(lines.size() - 1);
            String[] data = lastLine.split(",");
            String lastAppointmentID = data[0];
            int appointmentID = Integer.parseInt(lastAppointmentID.substring(2)) + 1;
            String formattedID = String.format("ap%03d", appointmentID);
            return formattedID;
        }
        return "ap001";
    }

    public static String generateUserID() {
        String filePath = "users.txt";
        FileHandler fileHandler = new FileHandler();
        List<String> lines = fileHandler.readFile(filePath);
        if (!lines.isEmpty()) {
            String lastLine = lines.get(lines.size() - 1);
            String[] data = lastLine.split(",");
            String lastUserID = data[0];
            int userID = Integer.parseInt(lastUserID) + 1;
            return Integer.toString(userID);
        }
        return "1";
    }

    public static String generateTechnicianID() {
        String filePath = "users.txt";
        FileHandler fileHandler = new FileHandler();
        List<String> lines = fileHandler.readFile(filePath);
        if (!lines.isEmpty()) {
            String lastLine = lines.get(lines.size() - 1);
            String[] data = lastLine.split(",");
            String lastTechnicianID = data[5];
            int technicianID = Integer.parseInt(lastTechnicianID) + 1;
            String formattedID = String.format("tc%03d", technicianID);
            return formattedID;
        }
        return "tc001";
    }

    public static String generateServiceID() {
        String filePath = "services.txt";
        FileHandler fileHandler = new FileHandler();
        List<String> lines = fileHandler.readFile(filePath);
        if (!lines.isEmpty()) {
            String lastLine = lines.get(lines.size() - 1);
            String[] data = lastLine.split(",");
            String lastServiceID = data[0];
            int serviceID = Integer.parseInt(lastServiceID.substring(2)) + 1;
            String formattedID = String.format("sv%03d", serviceID);
            return formattedID;
        }
        return "sv001";
    }

    public static String generateScheduleID() {
        String filePath = "schedule.txt";
        FileHandler fileHandler = new FileHandler();
        List<String> lines = fileHandler.readFile(filePath);
        if (!lines.isEmpty()) {
            String lastLine = lines.get(lines.size() - 1);
            String[] data = lastLine.split(",");
            String lastScheduleID = data[0];
            int scheduleID = Integer.parseInt(lastScheduleID.substring(2)) + 1;
            String formattedID = String.format("sc%03d", scheduleID);
            return formattedID;
        }
        return "sc001";
    }
}
