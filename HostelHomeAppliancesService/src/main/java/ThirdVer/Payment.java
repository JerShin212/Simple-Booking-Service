package ThirdVer;

public class Payment {
    private int id;
    private User customer;
    private String date;
    private String time;
    private String description;
    private User technician;
    private String fees;
    private String status;

    public Payment(int id, User customer, String date, String time, String description, User technician, String fees, String status) {
        this.id = id;
        this.customer = customer;
        this.date = date;
        this.time = time;
        this.description = description;
        this.technician = technician;
        this.fees = fees;
        this.status = status;
    }

    public int getId() {
        return id;
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

    public String getFees() {
        return fees;
    }

    public void setId(int id) {
        this.id = id;
    }

}
