package ahhascsystem;

public class Feedback {
    private String feedback, technician, customer;

    public Feedback(String feedback, String technician, String customer) {
        this.feedback = feedback;
        this.technician = technician;
        this.customer = customer;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }
    
    public String getTechnician() {
        return technician;
    }

    public void setTechnician(String technician) {
        this.technician = technician;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }
}
