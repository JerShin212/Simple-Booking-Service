package ThirdVer;

public class Appointment {
    private Customer customer;
    private String date;
    private String time;
    private String description;
    private Technician technician;
    private String status;

    public Appointment(Customer customer, String date, String time, String description, Technician technician, String status) {
        this.customer = customer;
        this.date = date;
        this.time = time;
        this.description = description;
        this.technician = technician;
        this.status = status;
    }

    public Customer getCustomer() {
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

    public Technician getTechnician() {
        return technician;
    }

    public String getStatus() {
        return status;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void setDate(String date) {
        this.date = date;
    }

}
