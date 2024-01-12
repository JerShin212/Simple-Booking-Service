package com.mycompany.hostelhomeappliancesservice;

public class User {
    protected int userID;
    protected String name;
    protected String email;
    protected String password;

    public User(int userID, String name, String email, String password) {
        this.userID = userID;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }
    
    public boolean login(String email, String password) {
        return this.email.equals(email) && this.password.equals(password);
    }

    public int getUserID() {
        return userID;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEamil(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void changePassword(String oldPassword, String newPassword) {
        if (this.password.equals(oldPassword)) {
            this.password = newPassword;
        }
    }

    public void changeEmail(String oldEmail, String newEmail) {
        if (this.email.equals(oldEmail)) {
            this.email = newEmail;
        }
    }

    public void chnangeName(String newName) {
        this.name = newName;
    }

    public void logout() {
        this.email = null;
        this.password = null;
    }

    public String toString() {
        return "User ID: " + userID + "\nName: " + name + "\nEmail: " + email;
    }
}
