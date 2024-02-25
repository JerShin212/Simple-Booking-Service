package ThirdVer;

public class Feedback {
    private User technician;
    private User customer;
    private String date;
    private String time;
    private String description;
    private String feedback;

    public Feedback(User technician, User customer, String date, String time, String description, String feedback) {
        this.technician = technician;
        this.customer = customer;
        this.date = date;
        this.time = time;
        this.description = description;
        this.feedback = feedback;
    }

    public User getTechnician() {
        return technician;
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

    public String getFeedback() {
        return feedback;
    }

    public void setTechnician(User technician) {
        this.technician = technician;
    }
}
