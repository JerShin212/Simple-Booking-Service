package com.mycompany.hostelhomeappliancesservice;

public class Customer extends User{
    FileHandler fileHandler = new FileHandler();
    
    public Customer(int userID, String name, String email, String password) {
        super(userID, name, email, password);
    }

    public Customer(String userID, String name, String email, String password) {
        super(userID, name, email, password);
    }
}
