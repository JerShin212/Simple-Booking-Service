package com.mycompany.hostelhomeappliancesservice;
import java.util.List;


public class User {
    private String userID;
    private String name;
    private String email;
    private String password;
    FileHandler fileHandler = new FileHandler();

    public User(int userID, String name, String email, String password) {
        this.userID = Integer.toString(userID);
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public String login(String email, String password) {
        String filePath = "users.txt";
        List<String> lines = fileHandler.readFile(filePath);
        for (String line : lines) {
            String[] data = line.split(",");
            if (data[2].equals(email) && data[3].equals(password)) {
                if (data[4].equals("admin")) {
                    return "admin";
                } else if (data[4].equals("technician")) {
                    return "technician";
                } else if (data[4].equals("manager")) {
                    return "manager";
                } else {
                    return "customer";
                }
            }
        }
        return "Invalid email or password.";
    }

    public void logout() {
        this.userID = null;
        this.name = null;
        this.email = null;
        this.password = null;
    }

    public Boolean updateProfile(String userID, String name, String email, String password) {
        String filePath = "users.txt";
        List<String> lines = fileHandler.readFile(filePath);
        for (String line : lines) {
            String[] data = line.split(",");
            if (data[0].equals(userID)) {
                data[1] = name;
                data[2] = email;
                data[3] = password;
                String newData = String.join(",", data);
                fileHandler.updateFile(filePath, line, newData);
                return true;
            }
        }
        return false;
    }

    public String getUserID() {
        return this.userID;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }
}
