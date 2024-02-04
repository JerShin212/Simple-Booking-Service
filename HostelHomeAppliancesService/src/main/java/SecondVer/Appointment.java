package HostelHomeApplianceService;

public class Appointment {
    private String username;
    private String date;
    private String time;
    private String technician;
    private String description;
    private String status;

    public Appointment(String username, String date, String time, String technician, String description) {
        this.username = username;
        this.date = date;
        this.time = time;
        this.technician = technician;
        this.description = description;
    }

    public Appointment(String username, String date, String time, String technician, String description, String status) {
        this.username = username;
        this.date = date;
        this.time = time;
        this.technician = technician;
        this.description = description;
        this.status = status;
    }

    public String getUsername() {
        return this.username;
    }

    public String getDate() {
        return this.date;
    }

    public String getTime() {
        return this.time;
    }

    public String getTechnician() {
        return this.technician;
    }

    public String getDescription() {
        return this.description;
    }

    public String getStatus() {
        return this.status;
    }

    @Override
    public String toString() {
        return this.username + "," + this.date + "," + this.time + "," + this.technician + "," + this.description;
    }
}
