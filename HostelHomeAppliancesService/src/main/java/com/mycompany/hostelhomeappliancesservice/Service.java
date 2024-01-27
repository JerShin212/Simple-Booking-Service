package com.mycompany.hostelhomeappliancesservice;

public class Service {
    FileHandler fileHandler = new FileHandler();
    private String serviceID;
    private String serviceName;
    private int duration;
    private double price;

    public Service(String serviceID, String serviceName, int duration, double price) {
        this.serviceID = serviceID;
        this.serviceName = serviceName;
        this.duration = duration;
        this.price = price;
    }

    public Service(String serviceID) {
        this.serviceID = serviceID;
    }

    public String getServiceID() {
        return serviceID;
    }

    public String getServiceName() {
        return serviceName;
    }

    public int getDuration() {
        return duration;
    }

    public double getPrice() {
        return price;
    }

    public void retrieveService() {
        for (String line : fileHandler.readFile("service.txt")) {
            String[] data = line.split(",");
            if (data[0].equals(this.serviceID)) {
                this.serviceName = data[1];
                this.duration = Integer.parseInt(data[2]);
                this.price = Double.parseDouble(data[3]);
            }
        }
    }

    @Override
    public String toString() {
        return String.format("%-10s%-20s%-10d%-10.2f", this.serviceID, this.serviceName, this.duration, this.price);
    }
}
