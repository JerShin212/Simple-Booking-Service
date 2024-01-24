package com.mycompany.hostelhomeappliancesservice;
import java.util.List;
public class Admin extends User{
    FileHandler fileHandler = new FileHandler();

    public Admin(int userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public Admin(String userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public String addTechnician(String name, String email, String password) {
        String filePath = "users.txt";
        List<String> lines = fileHandler.readFile(filePath);
        int userID = Integer.parseInt(lines.get(lines.size() - 1).split(",")[0]) + 1;
        int technicianID = Integer.parseInt(lines.get(lines.size() - 1).split(",")[5]) + 1;
        String newLine = userID + "," + name + "," + email + "," + password + ",technician" + "," + technicianID;
        lines.add(newLine);
        fileHandler.writeFile(filePath, lines);
        return "Success";
    }

    public String addManager(String name, String email, String password) {
        String filePath = "users.txt";
        List<String> lines = fileHandler.readFile(filePath);
        int userID = Integer.parseInt(lines.get(lines.size() - 1).split(",")[0]) + 1;
        String newLine = userID + "," + name + "," + email + "," + password + ",manager";
        lines.add(newLine);
        fileHandler.writeFile(filePath, lines);
        return "Success";
    }

}
