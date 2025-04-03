package ahhascsystem;

import java.util.ArrayList;

public class Technician extends User{
    private ArrayList<Appointment> myAppointments = new ArrayList<Appointment>();

    public Technician(String name, int password) {
        super(name, password);
    }
    
    public ArrayList<Appointment> getMyAppointments() {
        return myAppointments;
    }

    public void setMyAppointments(ArrayList<Appointment> myAppointments) {
        this.myAppointments = myAppointments;
    }
    
}
