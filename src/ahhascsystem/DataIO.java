package ahhascsystem;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class DataIO {
    public static ArrayList<Technician> allTechnicians = new ArrayList<Technician>();
    public static ArrayList<Manager> allManagers = new ArrayList<Manager>();
    public static ArrayList<Customer> allCustomers = new ArrayList<Customer>();
    
    public static void readUser() {
        try {
            Scanner input = new Scanner(new File("user.txt"));
            while(input.hasNext()) {
                String name = input.nextLine();
                int password = Integer.parseInt(input.nextLine());
                String role = input.nextLine();
                if (input.hasNextLine()) {
                    input.nextLine();
                }
                if (role.equals("Technician")) {
                    allTechnicians.add(new Technician(name,password));
                }  
                else if (role.equals("Manager")) {
                    allManagers.add(new Manager(name,password));
                }
                else if (role.equals("Customer")) {
                    allCustomers.add(new Customer(name,password));
                }
            }
        } catch(Exception e) {
            System.out.println("Error in read......");
        }
    }
    
    public static void writeUser(){
        try {
            PrintWriter output = new PrintWriter("user.txt");
            for (int i=0; i<allTechnicians.size(); i++){
                output.println(allTechnicians.get(i).getName());
                output.println(allTechnicians.get(i).getPassword());
                output.println("Technician");
                output.println();
            }
            for (int i=0; i<allManagers.size(); i++){
                output.println(allManagers.get(i).getName());
                output.println(allManagers.get(i).getPassword());
                output.println("Manager");
                output.println();
            }
            for (int i=0; i<allCustomers.size(); i++){
                output.println(allCustomers.get(i).getName());
                output.println(allCustomers.get(i).getPassword());
                output.println("Customer");
                output.println();
            }            
            output.close();
            
        } catch(Exception e) {
            System.out.println("Error in write......");
        }
    } 
    
    public static Technician checkNameTech(String s){
        for (int i=0; i<allTechnicians.size(); i++) {
            if(allTechnicians.get(i).getName().equals(s)){
                return allTechnicians.get(i);
            }
        }
        return null;
    }
    
    public static Manager checkNameManager(String s){
        for (int i=0; i<allManagers.size(); i++) {
            if(allManagers.get(i).getName().equals(s)){
                return allManagers.get(i);
            }
        }
        return null;
    }
    
    public static Customer checkNameCustomer (String s){
        for (int i=0; i<allCustomers.size(); i++) {
            if(allCustomers.get(i).getName().equals(s)){
                return allCustomers.get(i);
            }
        }
        return null;
    }    
    
    
    public static ArrayList<Appointment> allAppointments = new ArrayList<Appointment>();

    public static void readAppointment() {
        try{
            allAppointments.clear();
            Scanner inputAppointment = new Scanner(new File("appointment.txt"));
            while(inputAppointment.hasNext()){

                String data = inputAppointment.nextLine().trim();
                String [] section = data.split("/");
                
                int appointmentID = Integer.parseInt(section[0]);
                String customer = section[1];
                String date = section[2];
                String time = section[3];
                String technician = section[4];
                String appliance = section[5];
                int price = Integer.parseInt(section[6]);
                String status = section[7];
                int payment = Integer.parseInt(section[8]);
                int change = Integer.parseInt(section[9]);
                
                Appointment a = new Appointment(appointmentID, customer, date, time, technician, appliance, price, status, payment, change);
                allAppointments.add(a);
            }
            inputAppointment.close();
        }
        catch(Exception e){
            System.out.println("Error in read ....."+ e.getMessage());
        }
    }
    
    public static void writeAppointment(){
        try{
            PrintWriter writeAppointment = new PrintWriter("appointment.txt");
            for(int i=0; i<ManageAppointment.allAppointments.size(); i++){
                Appointment appointment = ManageAppointment.allAppointments.get(i);
                
                writeAppointment.println(appointment.getAppointmentID() + "/" +
                        appointment.getCustomer() + "/" + appointment.getDate() + "/" +
                        appointment.getTime() + "/" + appointment.getTechnician() + "/" +
                        appointment.getAppliance() + "/" + appointment.getPrice() + "/" +
                        appointment.getStatus() + "/" + appointment.getPayment() + "/" +
                        appointment.getChange());
            }
            writeAppointment.close();
        }
        catch(Exception e) {
            System.out.println("Error in write .....");
        }
    }
    
    public static void writeTechAppointment(){
        try{
            PrintWriter writeTechAppointment = new PrintWriter("appointment.txt");
            for(int i=0; i<allAppointments.size(); i++){
                Appointment appointment = allAppointments.get(i);
                
                writeTechAppointment.println(appointment.getAppointmentID() + "/" +
                        appointment.getCustomer() + "/" + appointment.getDate() + "/" +
                        appointment.getTime() + "/" + appointment.getTechnician() + "/" +
                        appointment.getAppliance() + "/" + appointment.getPrice() + "/" +
                        appointment.getStatus() + "/" + appointment.getPayment() + "/" +
                        appointment.getChange());
            }
            writeTechAppointment.close();
        }
        catch(Exception e) {
            System.out.println("Error in write .....");
        }
    }
    
    
    public static ArrayList<Feedback> allFeedback = new ArrayList<Feedback>(); 
    
    public static void readFeedback() {
        try{
            Scanner inputFeedback = new Scanner(new File("feedback.txt"));
            while(inputFeedback.hasNext()){
                String feedback = inputFeedback.nextLine();
                String technician = inputFeedback.nextLine();
                String customer = inputFeedback.nextLine();
                if (inputFeedback.hasNextLine()) {
                    inputFeedback.nextLine(); 
                }
                Feedback f = new Feedback(feedback, technician, customer);
                allFeedback.add(f);
            }
            inputFeedback.close();
        }
        catch(Exception e){
            System.out.println("Error in read ....."+ e.getMessage());
        }
    }
        
    public static void writeFeedback() {
        try{
            PrintWriter writeFeedback = new PrintWriter("feedback.txt");
            System.out.println(allFeedback.size());
            for(int i=0; i<allFeedback.size(); i++){
                writeFeedback.println(allFeedback.get(i).getFeedback());
                writeFeedback.println(allFeedback.get(i).getTechnician());
                writeFeedback.println(allFeedback.get(i).getCustomer());
                writeFeedback.println();
            }
            writeFeedback.close();
        }
        catch(Exception e){
            System.out.println("Error in read ....."+ e.getMessage());
        }
    }
    
}

