package ahhascsystem;

public class Appointment {
    
    public void taxPrice(){
        this.price = this.price + (this.price * 10 / 100);
    }
    
    private int appointmentID, price, payment, change;
    private String customer, date, time, technician, appliance, status;
    

    Appointment(int appointmentID, String customer, String date, String time, String technician, String appliance, int price, String status, int payment, int change) {
        this.appointmentID = appointmentID;
        this.technician = technician;
        this.customer = customer;
        this.date = date;
        this.time = time;
        this.appliance = appliance;
        this.price = price;
        this.status = status;
        this.payment = payment;
        this.change = change;
    }

    
    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
    
    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }    
    
    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getAppliance() {
        return appliance;
    }

    public void setAppliance(String appliance) {
        this.appliance = appliance;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getChange() {
        return change;
    }

    public void setChange(int change) {
        this.change = change;
    }
}
