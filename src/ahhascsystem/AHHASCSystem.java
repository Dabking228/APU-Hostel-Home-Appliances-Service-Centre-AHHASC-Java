// Run this file!!

package ahhascsystem;

public class AHHASCSystem {
    
    static LoginPage loginPage;
//    static TechMenu techMenu;
//    static ManagerMenu managerMenu;
//    static RegisterPage registerPage;
//    static ModifyManager modifyManager;
//    static ModifyAllUsers modifyAllUsers;
//    static ModifyTechnician modifyTechnician;
//    static CustomerMenu customerMenu;
//    static ModifyCustomer modifyCustomer;
//    static CustomerRegister customerRegister;
//    static ViewAllFeedback viewAllFeedback;
//    static ViewTechFeedback viewTechFeedback;
//    static ManageAppointment manageAppointment;
//    static CollectPayment collectPayment;
//    static PrintReceipt printReceipt;
//    static ViewAllAppointments viewAllAppointments;
//    static ViewTechAppointments viewTechAppointments;
//    static SubmitFeedback submitFeedback;
    
    static Technician techlogin = null;
    static Manager managerlogin = null;
    static Customer customerlogin = null;
    
    public static void main(String[] args) {
        DataIO.readUser();
//        DataIO.readAppointment();
        DataIO.readFeedback();
        loginPage = new LoginPage();
//        techMenu = new TechMenu();
//        managerMenu = new ManagerMenu();
//        registerPage = new RegisterPage();
//        modifyManager = new ModifyManager();
//        modifyAllUsers = new ModifyAllUsers();
//        modifyTechnician = new ModifyTechnician();
//        customerMenu = new CustomerMenu();
//        modifyCustomer = new ModifyCustomer();
//        customerRegister = new CustomerRegister();
//        viewAllFeedback = new ViewAllFeedback();
//        viewTechFeedback = new ViewTechFeedback();
//        manageAppointment = new ManageAppointment();
//        collectPayment = new CollectPayment();
//        printReceipt = new PrintReceipt();
//        viewAllAppointments = new ViewAllAppointments();
//        viewTechAppointments = new ViewTechAppointments();
//        submitFeedback = new SubmitFeedback();
        loginPage.setVisible(true);
    }
    
}
