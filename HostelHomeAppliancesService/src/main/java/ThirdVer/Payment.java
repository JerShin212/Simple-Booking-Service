package ThirdVer;

public class Payment {
    private User customer;
    private String date;
    private String time;
    private String description;
    private User technician;
    private String status;

    public Payment(User customer, String date, String time, String description, User technician, String status) {
        this.customer = customer;
        this.date = date;
        this.time = time;
        this.description = description;
        this.technician = technician;
        this.status = status;
    }

    public User getCustomer() {
        return customer;
    }

    public String getDate() {
        return date;
    }

    public String getTime() {
        return time;
    }

    public String getDescription() {
        return description;
    }

    public User getTechnician() {
        return technician;
    }

    public String getStatus() {
        return status;
    }

}
