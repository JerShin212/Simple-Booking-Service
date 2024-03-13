
package com.mycompany.hostelhomeappliancesservice;

import javax.swing.JOptionPane;


public class TechnicianPaymentGUI extends javax.swing.JFrame {

    
    public TechnicianPaymentGUI() {
        initComponents();
    }

    private void initComponents() {

        pbBg = new javax.swing.JPanel();
        pnSwitch = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnPayment = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        btnSchedule = new javax.swing.JButton();
        lbPayment = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        pnContentBg = new javax.swing.JPanel();
        pnContent = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfDescription = new javax.swing.JTextField();
        btnPay = new javax.swing.JButton();
        tfFees = new javax.swing.JTextField();
        lbFees = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        tfTime = new javax.swing.JTextField();
        lbID = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(650, 400));

        pbBg.setBackground(new java.awt.Color(102, 102, 102));

        btnHome.setBackground(new java.awt.Color(102, 102, 102));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnSetting.setBackground(new java.awt.Color(102, 102, 102));
        btnSetting.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSetting.setForeground(new java.awt.Color(255, 255, 255));
        btnSetting.setText("Setting");
        btnSetting.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSettingActionPerformed(evt);
            }
        });

        btnPayment.setBackground(new java.awt.Color(204, 204, 204));
        btnPayment.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnPayment.setText("Payment");

        btnFeedback.setBackground(new java.awt.Color(102, 102, 102));
        btnFeedback.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btnFeedback.setText("Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        btnSchedule.setBackground(new java.awt.Color(102, 102, 102));
        btnSchedule.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnSchedule.setForeground(new java.awt.Color(255, 255, 255));
        btnSchedule.setText("Schedule");
        btnSchedule.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnScheduleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSwitchLayout = new javax.swing.GroupLayout(pnSwitch);
        pnSwitch.setLayout(pnSwitchLayout);
        pnSwitchLayout.setHorizontalGroup(
            pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSwitchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSchedule, javax.swing.GroupLayout.DEFAULT_SIZE, 118, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPayment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSetting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        pnSwitchLayout.setVerticalGroup(
            pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSwitchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSchedule, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbPayment.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        lbPayment.setForeground(new java.awt.Color(214, 219, 223));
        lbPayment.setText("Payment");

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hostelhomeappliancesservice/Logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        pnContentBg.setBackground(new java.awt.Color(204, 204, 204));

        lbUsername.setText("Username: ");

        lbDate.setText("Date(yyyy-mm-dd): ");

        lbTime.setText("Time(24H):");

        lbDescription.setText("Description:");

        btnPay.setText("Pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        lbFees.setText("Fees: ");

        lbID.setText("ID:");

        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hostelhomeappliancesservice/search-icon-2048x2048-4r9dtbbw.png"))); // NOI18N
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnPay))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(pnContentLayout.createSequentialGroup()
                                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lbFees)
                                            .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(lbUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(lbTime, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                        .addGap(4, 4, 4)))
                                .addGap(18, 18, 18))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(lbID, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)))
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSearch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(tfUsername)
                            .addComponent(tfDate, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfTime, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfDescription, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(tfFees, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbID)
                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnSearch))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTime)
                    .addComponent(tfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbFees)
                    .addComponent(tfFees, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnPay)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnContentBgLayout = new javax.swing.GroupLayout(pnContentBg);
        pnContentBg.setLayout(pnContentBgLayout);
        pnContentBgLayout.setHorizontalGroup(
            pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContentBgLayout.setVerticalGroup(
            pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pbBgLayout = new javax.swing.GroupLayout(pbBg);
        pbBg.setLayout(pbBgLayout);
        pbBgLayout.setHorizontalGroup(
            pbBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pbBgLayout.createSequentialGroup()
                .addGroup(pbBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pbBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnContentBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pbBgLayout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(lbPayment, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout)))
                .addGap(14, 14, 14))
        );
        pbBgLayout.setVerticalGroup(
            pbBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pbBgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pbBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbPayment)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pbBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pbBgLayout.createSequentialGroup()
                        .addComponent(pnContentBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pbBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        TechnicianDashboardGUI b = new TechnicianDashboardGUI();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        Setting y = new Setting();
        y.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        TechnicianFeedbackGUI c = new TechnicianFeedbackGUI();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnScheduleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnScheduleActionPerformed
        TechnicianScheduleGUI d = new TechnicianScheduleGUI();
        d.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnScheduleActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login x = new Login();
        NewMain.currentUser = null;
        NewMain.technician = null;
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        try {
            String username = tfUsername.getText();
            String date = tfDate.getText();
            String time = tfTime.getText();
            String description = tfDescription.getText();
            String fees = tfFees.getText();
            User customer = DataIO.checkUser(username);
            String id = tfID.getText();
            int ID = Integer.parseInt(id);
            Appointment appointment = DataIO.checkId(ID);
            if (customer == null || date.equals("") || time.equals("") || description.equals("") || fees.equals("")) {
                throw new Exception("Please fill in all fields");
            }
            if (appointment.getStatus().equals("paid")) {
                throw new Exception("Appointment already paid");
            }
            if (appointment != null) {
                appointment.setStatus("paid");
                Payment payment = new Payment(appointment.getId(), customer, date, time, description, appointment.getTechnician(), fees, "paid");
                DataIO.allPayments.add(payment);
                DataIO.write();
                JOptionPane.showMessageDialog(null, "Payment successful");
                tfUsername.setText("");
                tfDate.setText("");
                tfTime.setText("");
                tfDescription.setText("");
                tfFees.setText("");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        try {
            String id = tfID.getText();
            int ID = Integer.parseInt(id);
            Appointment appointment = DataIO.checkId(ID);
            if (appointment != null) {
                tfUsername.setText(appointment.getCustomer().getUsername());
                tfDate.setText(appointment.getDate());
                tfTime.setText(appointment.getTime());
                tfDescription.setText(appointment.getDescription());
                tfID.setEditable(false);
            } else {
                throw new Exception("Invalid ID");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnPayment;
    private javax.swing.JButton btnSchedule;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSetting;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbFees;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbPayment;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JPanel pbBg;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnContentBg;
    private javax.swing.JPanel pnSwitch;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfFees;
    private javax.swing.JTextField tfID;
    private javax.swing.JTextField tfTime;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
