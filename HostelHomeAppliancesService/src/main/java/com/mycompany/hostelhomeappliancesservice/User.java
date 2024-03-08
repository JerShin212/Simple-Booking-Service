package com.mycompany.hostelhomeappliancesservice;

public class User {
    private String username;
    private String name;
    private String password;
    private String role;

    public User(String username, String name, String password, String role) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public User(String data) {
        String[] parts = data.split(",");
        this.username = parts[0];
        this.name = parts[1];
        this.password = parts[2];
        this.role = parts[3];
    }

    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }

    
}
