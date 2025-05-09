package ahhascsystem;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Daryl
 */
public class CollectPayment extends javax.swing.JFrame {
    
    /** Creates new form MakePayment */
    
    DefaultTableModel model = new DefaultTableModel();
    
    public CollectPayment() {
        initComponents();
        model = (DefaultTableModel) appointmentTable.getModel();
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        appointmentDetails = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        showAppointmentID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        showCusName = new javax.swing.JTextField();
        showDate = new javax.swing.JTextField();
        showTime = new javax.swing.JTextField();
        showTechnician = new javax.swing.JTextField();
        showAppliance = new javax.swing.JTextField();
        showStatus = new javax.swing.JTextField();
        showPrice = new javax.swing.JFormattedTextField();
        buttons = new javax.swing.JPanel();
        collectPaymentBtn = new javax.swing.JButton();
        printReceiptBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        receipt = new javax.swing.JTextPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        appointmentTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Collect Payment");
        setLocation(new java.awt.Point(240, 80));
        setMaximumSize(new java.awt.Dimension(1400, 900));
        setMinimumSize(new java.awt.Dimension(1400, 900));
        setPreferredSize(new java.awt.Dimension(1400, 900));
        setResizable(false);
        setSize(new java.awt.Dimension(1400, 900));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel1.setText("Manage Payment");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 850, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        appointmentDetails.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Appointment ID:");

        showAppointmentID.setEditable(false);
        showAppointmentID.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        showAppointmentID.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        showAppointmentID.setPreferredSize(new java.awt.Dimension(200, 30));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel3.setText("Customer Name:");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel4.setText("Date:");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel5.setText("Time:");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel6.setText("Technician:");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel7.setText("Appliance:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel8.setText("Price (RM):");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Status:");

        showCusName.setEditable(false);
        showCusName.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        showCusName.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        showCusName.setPreferredSize(new java.awt.Dimension(200, 30));

        showDate.setEditable(false);
        showDate.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        showDate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        showDate.setPreferredSize(new java.awt.Dimension(200, 30));

        showTime.setEditable(false);
        showTime.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        showTime.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        showTime.setPreferredSize(new java.awt.Dimension(200, 30));

        showTechnician.setEditable(false);
        showTechnician.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        showTechnician.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        showTechnician.setPreferredSize(new java.awt.Dimension(200, 30));

        showAppliance.setEditable(false);
        showAppliance.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        showAppliance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        showAppliance.setPreferredSize(new java.awt.Dimension(200, 30));

        showStatus.setEditable(false);
        showStatus.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N
        showStatus.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        showStatus.setPreferredSize(new java.awt.Dimension(200, 30));

        showPrice.setEditable(false);
        showPrice.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        showPrice.setFont(new java.awt.Font("Times New Roman", 0, 20)); // NOI18N

        javax.swing.GroupLayout appointmentDetailsLayout = new javax.swing.GroupLayout(appointmentDetails);
        appointmentDetails.setLayout(appointmentDetailsLayout);
        appointmentDetailsLayout.setHorizontalGroup(
            appointmentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentDetailsLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(appointmentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(showCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(showDate, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(showTime, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showAppointmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 132, Short.MAX_VALUE)
                .addGroup(appointmentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appointmentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(showPrice)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(showTechnician, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(showAppliance, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, appointmentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel9)
                        .addComponent(showStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(47, 47, 47))
        );
        appointmentDetailsLayout.setVerticalGroup(
            appointmentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(appointmentDetailsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(appointmentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appointmentDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showAppointmentID, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showCusName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4))
                    .addGroup(appointmentDetailsLayout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showAppliance, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(appointmentDetailsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(appointmentDetailsLayout.createSequentialGroup()
                        .addComponent(showDate, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showTime, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(appointmentDetailsLayout.createSequentialGroup()
                        .addComponent(showPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(showStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        buttons.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        collectPaymentBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        collectPaymentBtn.setText("Collect Payment");
        collectPaymentBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        collectPaymentBtn.setMaximumSize(new java.awt.Dimension(180, 40));
        collectPaymentBtn.setMinimumSize(new java.awt.Dimension(180, 40));
        collectPaymentBtn.setPreferredSize(new java.awt.Dimension(180, 40));
        collectPaymentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                collectPaymentBtnActionPerformed(evt);
            }
        });

        printReceiptBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        printReceiptBtn.setText("Print Receipt");
        printReceiptBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        printReceiptBtn.setMaximumSize(new java.awt.Dimension(180, 40));
        printReceiptBtn.setMinimumSize(new java.awt.Dimension(180, 40));
        printReceiptBtn.setPreferredSize(new java.awt.Dimension(180, 40));
        printReceiptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReceiptBtnActionPerformed(evt);
            }
        });

        clearBtn.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        clearBtn.setText("Clear");
        clearBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, null, null, new java.awt.Color(0, 0, 0)));
        clearBtn.setMaximumSize(new java.awt.Dimension(180, 40));
        clearBtn.setMinimumSize(new java.awt.Dimension(180, 40));
        clearBtn.setPreferredSize(new java.awt.Dimension(180, 40));
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout buttonsLayout = new javax.swing.GroupLayout(buttons);
        buttons.setLayout(buttonsLayout);
        buttonsLayout.setHorizontalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(collectPaymentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(printReceiptBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(clearBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        buttonsLayout.setVerticalGroup(
            buttonsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(buttonsLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(collectPaymentBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(printReceiptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        receipt.setEditable(false);
        receipt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        receipt.setFont(new java.awt.Font("Monospaced", 1, 18)); // NOI18N
        receipt.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(receipt);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        appointmentTable.setBackground(new java.awt.Color(204, 255, 255));
        appointmentTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Appointment ID", "Customer Name", "Date", "Time", "Technician", "Appliance", "Price", "Status", "Payment", "Change"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointmentTable.getTableHeader().setReorderingAllowed(false);
        appointmentTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(appointmentTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 346, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(appointmentDetails, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttons, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 351, Short.MAX_VALUE)))
                .addGap(15, 15, 15))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttons, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(appointmentDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        printReceiptBtn.setEnabled(false);
        if(DataIO.allAppointments.isEmpty()){
            JOptionPane.showMessageDialog(this, "No existing appointments.");
        }
        else{
            for(int i=0; i<DataIO.allAppointments.size(); i++){
                Appointment appointment = DataIO.allAppointments.get(i);
                String username = AHHASCSystem.techlogin.getName();
                String technician = appointment.getTechnician();
                
                if("Unpaid".equals(appointment.getStatus()) && technician.equals(username)){
                    int getAppointmentID = appointment.getAppointmentID();
                    String customer = appointment.getCustomer();
                    String date = appointment.getDate();
                    String time = appointment.getTime();
                    String appliance = appointment.getAppliance();
                    int price = appointment.getPrice();
                    String status = appointment.getStatus();
                    int payment = appointment.getPayment();
                    int change = appointment.getChange();

                    Object [] appointmentData = {getAppointmentID, customer, date, time, technician, appliance, price, status, payment, change};
                    model.addRow(appointmentData);
                }
            }
        }
    }//GEN-LAST:event_formWindowOpened

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        int exit = JOptionPane.showConfirmDialog(this, "Are you sure to exit?", "Confirm Exit", JOptionPane.YES_NO_OPTION);
        
        if(exit == JOptionPane.YES_OPTION){
            JOptionPane.showMessageDialog(this, "Saving Changes...");
            DataIO.writeTechAppointment();
            Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Changes Saved!");
                dispose();
                LoginPage.techMenu.setVisible(true);
            }
        });
        timer.setRepeats(false);
        timer.start();
        }
    }//GEN-LAST:event_formWindowClosing

    private void appointmentTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentTableMouseClicked
        // TODO add your handling code here:
        selectAppointment();
        generateReceipt();
    }//GEN-LAST:event_appointmentTableMouseClicked

    private void collectPaymentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_collectPaymentBtnActionPerformed
        // TODO add your handling code here:
        String paymentStatus;
        switch (appointmentTable.getSelectedRowCount()) {
            case 1:
                if("".equals(showAppointmentID.getText())){
                    JOptionPane.showMessageDialog(this, "Please select an appointment to collect payment");
                    break;
                }
                else{
                    String payment = inputPayment();
                    if (payment != null){
                        int paymentAmount = convertPayment(payment);
                        if(paymentAmount != -1){
                            int price = (int) model.getValueAt(appointmentTable.getSelectedRow(), 6);
                            int change = calculatePayment(paymentAmount, price);
                            if(change != -1){
                                receipt.setText(receipt.getText() + "Payment Amount:  " + paymentAmount + "\n\n");
                                receipt.setText(receipt.getText() + "Change:  " + change);
                                paymentStatus = "Successful";
                                changeStatus(paymentStatus, paymentAmount, change);
                                controlButtons();
                            }
                        }
                    }
                }
                
                break;
            case 0:
                JOptionPane.showMessageDialog(this, "Please select an appointment to collect payment");
                break;
            default:
                JOptionPane.showMessageDialog(this, "Please select only one appointment to collect payment");
                break;
        }


    }//GEN-LAST:event_collectPaymentBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        clear();
    }//GEN-LAST:event_clearBtnActionPerformed

    private void printReceiptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReceiptBtnActionPerformed
        // TODO add your handling code here:
//        AHHASCSystem.printReceipt.setVisible(true);
//        AHHASCSystem.collectPayment.setVisible(false);
        
//        AHHASCSystem.printReceipt.addWindowListener(new WindowAdapter() {
//            public void windowClosed(WindowEvent e){
//                AHHASCSystem.collectPayment.setVisible(true);
//                deleteAfterPrintReceipt();
//                clear();
//            }
//        });
        PrintReceipt printReceipt = new PrintReceipt();
        printReceipt.setVisible(true);
        
        printReceipt.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e){
                TechMenu.collectPayment.setVisible(true);
//                deleteAfterPrintReceipt(); Redundant code
                collectPaymentBtn.setEnabled(true);
                printReceiptBtn.setEnabled(false);
                clear();
            }
        });        
    }//GEN-LAST:event_printReceiptBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel appointmentDetails;
    protected static javax.swing.JTable appointmentTable;
    private javax.swing.JPanel buttons;
    private javax.swing.JButton clearBtn;
    private javax.swing.JButton collectPaymentBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton printReceiptBtn;
    protected static javax.swing.JTextPane receipt;
    private javax.swing.JTextField showAppliance;
    private javax.swing.JTextField showAppointmentID;
    private javax.swing.JTextField showCusName;
    private javax.swing.JTextField showDate;
    private javax.swing.JFormattedTextField showPrice;
    private javax.swing.JTextField showStatus;
    private javax.swing.JTextField showTechnician;
    private javax.swing.JTextField showTime;
    // End of variables declaration//GEN-END:variables

    private void selectAppointment(){
        controlButtons();
        int selectedRow = appointmentTable.getSelectedRow();
        
        int appointmentID = (int) model.getValueAt(selectedRow, 0);
        String cusName = (String) model.getValueAt(selectedRow, 1);
        String date = (String) model.getValueAt(selectedRow, 2);
        String time = (String) model.getValueAt(selectedRow, 3);
        String technician = (String) model.getValueAt(selectedRow, 4);
        String appliance = (String) model.getValueAt(selectedRow, 5);
        int price = (int) model.getValueAt(selectedRow, 6);
        String status = (String) model.getValueAt(selectedRow, 7);
        
        showAppointmentID.setText(String.valueOf(appointmentID));
        showCusName.setText(cusName);
        showDate.setText(date);
        showTime.setText(time);
        showTechnician.setText(technician);
        showAppliance.setText(appliance);
        showPrice.setText(String.valueOf(price));
        showStatus.setText(status);
    }

    private void generateReceipt(){
        receipt.setText("*******************************\n");
        receipt.setText(receipt.getText() + "*           Receipt           *\n");
        receipt.setText(receipt.getText() + "*******************************\n\n\n");
        
        receipt.setText(receipt.getText() + "Customer:  " + showCusName.getText() + "\n\n");
        receipt.setText(receipt.getText() + "Date:  " + showDate.getText() + "\n\n");
        receipt.setText(receipt.getText() + "Technician:  " + showTechnician.getText() + "\n\n");
        receipt.setText(receipt.getText() + "Appliance:  " + showAppliance.getText() + "\n\n");
        receipt.setText(receipt.getText() + "Price:  " + showPrice.getText()+ "\n\n");
        receipt.setCaretPosition(0);
    }
    
    private void clear(){
        showAppointmentID.setText(null);
        showCusName.setText(null);
        showDate.setText(null);
        showTime.setText(null);
        showTechnician.setText(null);
        showAppliance.setText(null);
        showPrice.setText(null);
        showStatus.setText(null);
        receipt.setText(null);
    }
    
    private String inputPayment(){
        int price = (int) model.getValueAt(appointmentTable.getSelectedRow(), 6);
        Appointment appointment = new Appointment(0, "", "", "", "", "", price, "", 0, 0);
        appointment.taxPrice();
        String payment = JOptionPane.showInputDialog("Price: RM" + price +  "\nEnter Payment Amount (RM):" 
                + "\n*Note: Future Price with Tax (10%): RM" + appointment.getPrice());
        if(payment == null || payment.isEmpty()){
            JOptionPane.showMessageDialog(this, "Please enter payment amount!", "Error", JOptionPane.ERROR_MESSAGE);
            return null;
        }
        return payment;
    }
    
    private int convertPayment(String payment){
        int paymentAmount;
                
        try{
            paymentAmount = Integer.parseInt(payment);
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Invalid input! Please enter a valid number.", "Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        return paymentAmount;
    }
    
    private int calculatePayment(int paymentAmount, int price){
        
        if(paymentAmount < price){
            JOptionPane.showMessageDialog(this, "Insufficient Payment", "Error", JOptionPane.ERROR_MESSAGE);
            return -1;
        }
        else if(paymentAmount >= price){
            int change = paymentAmount - price;
            JOptionPane.showMessageDialog(this, "Payment Successful!\nChange: RM"+change);
            return change;
        }
        return 0;
    }
    
    private void changeStatus(String paymentStatus, int paymentAmount, int change){
        if("Successful".equals(paymentStatus)){
            showStatus.setText("Paid");
            model.setValueAt("Paid", appointmentTable.getSelectedRow(), 7);
            model.setValueAt(paymentAmount, appointmentTable.getSelectedRow(), 8);
            model.setValueAt(change, appointmentTable.getSelectedRow(), 9);
            
            int getAppointmentID = (int) model.getValueAt(appointmentTable.getSelectedRow(), 0);
            for(int i=0; i<DataIO.allAppointments.size(); i++){
                Appointment appointment = DataIO.allAppointments.get(i);
                if(appointment.getAppointmentID() == getAppointmentID){
                    appointment.setStatus("Paid");
                    appointment.setPayment(paymentAmount);
                    appointment.setChange(change);
                    DataIO.allAppointments.set(i, appointment);
                    break;
                }
                
            }
        }
    }
    
    private void controlButtons(){
        String status = (String) model.getValueAt(appointmentTable.getSelectedRow(), 7);
        if("Unpaid".equals(status)){
            collectPaymentBtn.setEnabled(true);
            printReceiptBtn.setEnabled(false);
        }
        else if("Paid".equals(status)){
            collectPaymentBtn.setEnabled(false);
            printReceiptBtn.setEnabled(true);
        }
    }

//  Redundant code
//    private void deleteAfterPrintReceipt(){
//        int selectedRow = appointmentTable.getSelectedRow();
//        if(selectedRow != -1){
//            model.removeRow(selectedRow);
//        }
//    }
}
