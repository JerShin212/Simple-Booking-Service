package com.mycompany.hostelhomeappliancesservice;

public class Manager extends User{
    FileHandler fileHandler = new FileHandler();

    public Manager(int userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public Manager(String userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    
}
