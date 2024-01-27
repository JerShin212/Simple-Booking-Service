package com.mycompany.hostelhomeappliancesservice;

public class Payment {
    private String paymentID;
    private String customerID;
    private String technicianID;
    private String amount;
    private String status;

    public Payment(String paymentID, String customerID, String technicianID, String amount, String status) {
        this.paymentID = paymentID;
        this.customerID = customerID;
        this.technicianID = technicianID;
        this.amount = amount;
        this.status = status;
    }

    public Payment(String customerID, String technicianID, String amount, String status) {
        this.customerID = customerID;
        this.technicianID = technicianID;
        this.amount = amount;
        this.status = status;
    }

    public String getPaymentID() {
        return paymentID;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getTechnicianID() {
        return technicianID;
    }

    public String getAmount() {
        return amount;
    }

    public String getStatus() {
        return status;
    }

    public void recordPayment() {
        FileHandler fileHandler = new FileHandler();
        String line = String.join(",", this.paymentID, this.customerID, this.technicianID, this.amount, this.status);
        fileHandler.appendFile("payment.txt", line);
    }

    public void updatePayment() {
        FileHandler fileHandler = new FileHandler();
        for (String line : fileHandler.readFile("payment.txt")) {
            String[] data = line.split(",");
            if (data[0].equals(this.paymentID)) {
                data[1] = this.customerID;
                data[2] = this.technicianID;
                data[3] = this.amount;
                data[4] = this.status;
                String newData = String.join(",", data);
                fileHandler.updateFile("payment.txt", line, newData);
            }
        }
    }
}
