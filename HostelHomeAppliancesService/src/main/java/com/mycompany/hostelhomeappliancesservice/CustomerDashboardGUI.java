package com.mycompany.hostelhomeappliancesservice;

import javax.swing.table.DefaultTableModel;

public class CustomerDashboardGUI extends javax.swing.JFrame {

    public CustomerDashboardGUI() {
        initComponents();
    }

    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        pnSwitch = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        lbDashboard = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        pnUpcomingA = new javax.swing.JPanel();
        pnUpcoming1 = new javax.swing.JPanel();
        lbDate = new javax.swing.JLabel();
        lbTime = new javax.swing.JLabel();
        lbTechnician = new javax.swing.JLabel();
        lbDescription = new javax.swing.JLabel();
        lbDescriptionMain = new javax.swing.JLabel();
        lbTechnicianMain = new javax.swing.JLabel();
        lbTimeMain = new javax.swing.JLabel();
        lbDateMain = new javax.swing.JLabel();
        lbFeeedback = new javax.swing.JLabel();
        lbUpcoming = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbFeedback = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnBg.setBackground(new java.awt.Color(102, 102, 102));

        btnHome.setBackground(new java.awt.Color(204, 204, 204));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
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
                .addContainerGap(111, Short.MAX_VALUE))
        );

        lbDashboard.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        lbDashboard.setForeground(new java.awt.Color(214, 219, 223));
        lbDashboard.setText("Dashboard");

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hostelhomeappliancesservice/Logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        pnMain.setBackground(new java.awt.Color(204, 204, 204));

        pnUpcomingA.setBackground(new java.awt.Color(214, 219, 223));

        pnUpcoming1.setBackground(new java.awt.Color(136, 153, 166));

        lbDate.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbDate.setForeground(new java.awt.Color(232, 234, 237));
        lbDate.setText("Date:");

        lbTime.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbTime.setForeground(new java.awt.Color(232, 234, 237));
        lbTime.setText("Time:");

        lbTechnician.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbTechnician.setForeground(new java.awt.Color(232, 234, 237));
        lbTechnician.setText("Technician:");

        lbDescription.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbDescription.setForeground(new java.awt.Color(232, 234, 237));
        lbDescription.setText("Description:");

        Appointment recentAppointment = DataIO.recentAppointment(NewMain.currentUser.getUsername());
        if (recentAppointment == null) {
            lbDescriptionMain.setText("");
            lbTechnicianMain.setText("");
            lbTimeMain.setText("");
            lbDateMain.setText("No upcoming appointment");
        } else {
            lbDescriptionMain.setText(recentAppointment.getDescription());
            lbTechnicianMain.setText(recentAppointment.getTechnician().getUsername());
            lbTimeMain.setText(recentAppointment.getTime());
            lbDateMain.setText(recentAppointment.getDate());
        }

        lbDescriptionMain.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbDescriptionMain.setForeground(new java.awt.Color(255, 255, 255));
        // lbDescriptionMain.setText(a.getDescription());

        lbTechnicianMain.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbTechnicianMain.setForeground(new java.awt.Color(255, 255, 255));
        // lbTechnicianMain.setText(a.getTechnician().getUsername());

        lbTimeMain.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbTimeMain.setForeground(new java.awt.Color(255, 255, 255));
        // lbTimeMain.setText(a.getTime());

        lbDateMain.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbDateMain.setForeground(new java.awt.Color(255, 255, 255));
        // lbDateMain.setText(a.getDate());

        javax.swing.GroupLayout pnUpcoming1Layout = new javax.swing.GroupLayout(pnUpcoming1);
        pnUpcoming1.setLayout(pnUpcoming1Layout);
        pnUpcoming1Layout.setHorizontalGroup(
            pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUpcoming1Layout.createSequentialGroup()
                .addGroup(pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnUpcoming1Layout.createSequentialGroup()
                        .addComponent(lbDescription)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbDescriptionMain, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE))
                    .addGroup(pnUpcoming1Layout.createSequentialGroup()
                        .addGroup(pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbTechnician)
                            .addComponent(lbTime)
                            .addComponent(lbDate))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbDateMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTimeMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbTechnicianMain, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE))))
                .addGap(0, 20, Short.MAX_VALUE))
        );
        pnUpcoming1Layout.setVerticalGroup(
            pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUpcoming1Layout.createSequentialGroup()
                .addGroup(pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDate)
                    .addComponent(lbDateMain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTime)
                    .addComponent(lbTimeMain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbTechnician)
                    .addComponent(lbTechnicianMain))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnUpcoming1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbDescription)
                    .addComponent(lbDescriptionMain)))
        );

        javax.swing.GroupLayout pnUpcomingALayout = new javax.swing.GroupLayout(pnUpcomingA);
        pnUpcomingA.setLayout(pnUpcomingALayout);
        pnUpcomingALayout.setHorizontalGroup(
            pnUpcomingALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUpcomingALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnUpcoming1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnUpcomingALayout.setVerticalGroup(
            pnUpcomingALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnUpcomingALayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnUpcoming1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        lbFeeedback.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        lbFeeedback.setForeground(new java.awt.Color(109, 123, 141));
        lbFeeedback.setText("Pending Feedback");

        lbUpcoming.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        lbUpcoming.setForeground(new java.awt.Color(109, 123, 141));
        lbUpcoming.setText("Upcoming Apointment");

        String[] columnNames = {"ID", "Date", "Time", "Technician", "Description"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbFeedback.setModel(model);

        for (Appointment appointment : DataIO.allAppointments) {
            if (appointment.getCustomer().getUsername().equals(NewMain.currentUser.getUsername()) && appointment.getStatus().equals("paid")) {
                model.addRow(new Object[]{appointment.getId(), appointment.getDate(), appointment.getTime(), appointment.getTechnician().getUsername(), appointment.getDescription()});
            }
        }
        jScrollPane2.setViewportView(tbFeedback);

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lbUpcoming)
                    .addComponent(lbFeeedback)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 333, Short.MAX_VALUE)
                    .addComponent(pnUpcomingA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbUpcoming)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnUpcomingA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(lbFeeedback, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lbDashboard)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout))
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbDashboard)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed

    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAppointmentActionPerformed
        CustomerAppointmentGUI a = new CustomerAppointmentGUI();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAppointmentActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        Setting y = new Setting();
        y.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSettingActionPerformed

    private void btnFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFeedbackActionPerformed
        CustomerFeedbackGUI b = new CustomerFeedbackGUI();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnFeedbackActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login x = new Login();
        NewMain.currentUser = null;
        NewMain.customer = null;
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSetting;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbDashboard;
    private javax.swing.JLabel lbDate;
    private javax.swing.JLabel lbDateMain;
    private javax.swing.JLabel lbDescription;
    private javax.swing.JLabel lbDescriptionMain;
    private javax.swing.JLabel lbFeeedback;
    private javax.swing.JLabel lbTechnician;
    private javax.swing.JLabel lbTechnicianMain;
    private javax.swing.JLabel lbTime;
    private javax.swing.JLabel lbTimeMain;
    private javax.swing.JLabel lbUpcoming;
    private javax.swing.JPanel pnBg;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSwitch;
    private javax.swing.JPanel pnUpcoming1;
    private javax.swing.JPanel pnUpcomingA;
    private javax.swing.JTable tbFeedback;
    // End of variables declaration//GEN-END:variables
}
