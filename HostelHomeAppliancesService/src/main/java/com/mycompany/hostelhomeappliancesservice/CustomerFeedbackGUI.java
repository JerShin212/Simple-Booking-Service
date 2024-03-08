package com.mycompany.hostelhomeappliancesservice;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class CustomerFeedbackGUI extends javax.swing.JFrame {

    public CustomerFeedbackGUI() {
        initComponents();
    }

    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        pnSwitch = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnAppointment = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnFeedback = new javax.swing.JButton();
        lbFeedback = new javax.swing.JLabel();
        btnLogout = new javax.swing.JButton();
        pnMain = new javax.swing.JPanel();
        lbUpcoming = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnWriteFeedback = new javax.swing.JButton();
        spTable = new javax.swing.JScrollPane();
        tbFeedback = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnBg.setBackground(new java.awt.Color(102, 102, 102));

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

        btnFeedback.setBackground(new java.awt.Color(204, 204, 204));
        btnFeedback.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnFeedback.setText("Feedback");

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

        pnMain.setBackground(new java.awt.Color(204, 204, 204));

        lbUpcoming.setFont(new java.awt.Font("Baskerville Old Face", 0, 18)); // NOI18N
        lbUpcoming.setForeground(new java.awt.Color(109, 123, 141));
        lbUpcoming.setText("Past Feedback");

        btnWriteFeedback.setText("Write Feedback");
        btnWriteFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnWriteFeedbackActionPerformed(evt);
            }
        });

        String[] columnNames = {"Technician", "Date", "Description", "Feedback"};
        DefaultTableModel model = new DefaultTableModel(columnNames, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        tbFeedback.setModel(model);

        for (Feedback feedback : DataIO.allFeedbacks) {
            if (feedback.getCustomer().getUsername().equals(NewMain.currentUser.getUsername())) {
                model.addRow(new Object[]{feedback.getTechnician().getUsername(), feedback.getDate(), feedback.getDescription(), feedback.getFeedback()});
            }
        }

        tbFeedback.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tbFeedback.getColumnModel().getColumn(0).setPreferredWidth(80);
        tbFeedback.getColumnModel().getColumn(1).setPreferredWidth(50);
        tbFeedback.getColumnModel().getColumn(2).setPreferredWidth(50);
        tbFeedback.getColumnModel().getColumn(3).setPreferredWidth(118);
        
        spTable.setViewportView(tbFeedback);

        javax.swing.GroupLayout pnMainLayout = new javax.swing.GroupLayout(pnMain);
        pnMain.setLayout(pnMainLayout);
        pnMainLayout.setHorizontalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMainLayout.createSequentialGroup()
                        .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnMainLayout.createSequentialGroup()
                                .addComponent(spTable, javax.swing.GroupLayout.DEFAULT_SIZE, 319, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(pnMainLayout.createSequentialGroup()
                                .addGap(106, 106, 106)
                                .addComponent(btnWriteFeedback)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addComponent(lbUpcoming)
                        .addGap(0, 225, Short.MAX_VALUE))))
        );
        pnMainLayout.setVerticalGroup(
            pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnMainLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbUpcoming)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnMainLayout.createSequentialGroup()
                        .addComponent(spTable, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnWriteFeedback)))
                .addContainerGap())
        );

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lbFeedback)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnLogout)))
                .addGap(19, 19, 19))
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbFeedback)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addComponent(pnMain, javax.swing.GroupLayout.PREFERRED_SIZE, 269, Short.MAX_VALUE)
                        .addContainerGap())))
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

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login x = new Login();
        NewMain.currentUser = null;
        NewMain.customer = null;
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnWriteFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnWriteFeedbackActionPerformed
        FeedbackFormGUI c = new FeedbackFormGUI();
        c.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnWriteFeedbackActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAppointment;
    private javax.swing.JButton btnFeedback;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSetting;
    private javax.swing.JButton btnWriteFeedback;
    private javax.swing.JPanel pnBg;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane spTable;
    private javax.swing.JLabel lbFeedback;
    private javax.swing.JLabel lbUpcoming;
    private javax.swing.JPanel pnMain;
    private javax.swing.JPanel pnSwitch;
    private javax.swing.JTable tbFeedback;
    // End of variables declaration//GEN-END:variables
}
