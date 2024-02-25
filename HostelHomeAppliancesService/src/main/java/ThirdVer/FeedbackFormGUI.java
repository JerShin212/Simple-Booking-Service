package ThirdVer;

import javax.swing.JOptionPane;

public class FeedbackFormGUI extends javax.swing.JFrame {

    public FeedbackFormGUI() {
        initComponents();
    }

    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        pnSwitch = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        lbFeedback = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        pnContentBg = new javax.swing.JPanel();
        pnContent = new javax.swing.JPanel();
        lbDescription = new javax.swing.JLabel();
        lbFeedbackMain = new javax.swing.JLabel();
        tfDescription = new javax.swing.JTextField();
        lbTechnician = new javax.swing.JLabel();
        tfTime1 = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        tfDate = new javax.swing.JTextField();
        tfTime = new javax.swing.JTextField();
        tfFeedback = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnBg.setBackground(new java.awt.Color(102, 102, 102));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hostelhomeappliancesservice/Untitled.png"))); // NOI18N
        lbLogo.setText("Logo");

        btnHome.setBackground(new java.awt.Color(102, 102, 102));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnAppointment.setBackground(new java.awt.Color(102, 102, 102));
        btnAppointment.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnAppointment.setForeground(new java.awt.Color(255, 255, 255));
        btnAppointment.setText("Appointment");
        btnAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAppointmentActionPerformed(evt);
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

        btnFeedback.setBackground(new java.awt.Color(102, 102, 102));
        btnFeedback.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnFeedback.setForeground(new java.awt.Color(255, 255, 255));
        btnFeedback.setText("Feedback");
        btnFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnSwitchLayout = new javax.swing.GroupLayout(pnSwitch);
        pnSwitch.setLayout(pnSwitchLayout);
        pnSwitchLayout.setHorizontalGroup(
            pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSwitchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFeedback, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnSwitchLayout.setVerticalGroup(
            pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSwitchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbFeedback.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        lbFeedback.setForeground(new java.awt.Color(214, 219, 223));
        lbFeedback.setText("Feedback");

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hostelhomeappliancesservice/Logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        pnContentBg.setBackground(new java.awt.Color(204, 204, 204));

        lbDescription.setText("Description:");

        lbFeedbackMain.setText("Feedback:");

        lbTechnician.setText("Technician:");

        btnSend.setText("Send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });

        lbDate.setText("Date:");

        lbTime.setText("Time:");

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addComponent(lbDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbDate)
                            .addComponent(lbTime))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfDate)
                            .addComponent(tfTime, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbFeedbackMain, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                        .addComponent(lbTechnician, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfTime1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(btnSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTime1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTechnician))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate)
                    .addComponent(tfDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbTime))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbDescription))
                .addGap(7, 7, 7)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfFeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFeedbackMain))
                .addGap(18, 18, 18)
                .addComponent(btnSend)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106)
                .addComponent(lbFeedback)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 160, Short.MAX_VALUE)
                .addComponent(btnLogout)
                .addGap(19, 19, 19))
            .addGroup(pnBgLayout.createSequentialGroup()
                .addComponent(pnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnContentBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbFeedback)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addComponent(pnContentBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 38, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        CustomerDashboardGUI a = new CustomerDashboardGUI();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        CustomerAppointmentGUI b = new CustomerAppointmentGUI();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        Setting y = new Setting();
        y.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        CustomerFeedbackGUI c = new CustomerFeedbackGUI();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login x = new Login();
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        try {
            String date = tfDate.getText();
            String time = tfTime.getText();
            String description = tfDescription.getText();
            String technician = tfTime1.getText();
            String feedback = tfFeedback.getText();
            User customer = MainRun.currentUser;
            User technician1 = DataIO.checkUser(technician);
            Appointment appointment = DataIO.Exist(date, time, description, customer.getUsername());
            if (appointment == null) {
                throw new Exception("Appointment does not exist");
            }
            Feedback feedback1 = new Feedback(technician1, customer, date, time, description, feedback);
            DataIO.allFeedbacks.add(feedback1);
            DataIO.write();
            JOptionPane.showMessageDialog(null, "Feedback sent successfully");
            tfDate.setText("");
            tfTime.setText("");
            tfDescription.setText("");
            tfTime1.setText("");
            tfFeedback.setText("");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }//GEN-LAST:event_btnSendActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSetting;
    private javax.swing.JPanel pnBg;
    private javax.swing.JPanel pnContentBg;
    private javax.swing.JPanel pnContent;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbFeedback;
    private javax.swing.JLabel lbFeedbackMain;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbTechnician;
    private javax.swing.JPanel pnSwitch;
    private javax.swing.JTextField tfDate;
    private javax.swing.JTextField tfDescription;
    private javax.swing.JTextField tfFeedback;
    private javax.swing.JTextField tfTime;
    private javax.swing.JTextField tfTime1;
    // End of variables declaration//GEN-END:variables
}
