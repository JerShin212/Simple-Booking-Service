package com.mycompany.hostelhomeappliancesservice;

import javax.swing.JOptionPane;

public class Setting extends javax.swing.JFrame  {

    public Setting() {
        initComponents();
    }

    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        lbSetting = new javax.swing.JLabel();
        btnBack = new javax.swing.JLabel();
        pnContentBg = new javax.swing.JPanel();
        pnContent = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        lbConfirmP = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        lbConfirm = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        lbUsernameM = new javax.swing.JLabel();
        tfPassword = new javax.swing.JTextField();
        tfCPassword = new javax.swing.JTextField();
        lbName = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnBg.setBackground(new java.awt.Color(102, 102, 102));

        lbSetting.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lbSetting.setForeground(new java.awt.Color(255, 255, 255));
        lbSetting.setText("SETTING");

        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hostelhomeappliancesservice/HomeButton.png"))); // NOI18N
        btnBack.setText("jLabel3");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        pnContentBg.setPreferredSize(new java.awt.Dimension(403, 291));

        pnContent.setBackground(new java.awt.Color(204, 204, 204));

        lbUsername.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbUsername.setText("Username: ");
        lbUsername.setMaximumSize(new java.awt.Dimension(40, 20));
        lbUsername.setMinimumSize(new java.awt.Dimension(40, 20));
        lbUsername.setPreferredSize(new java.awt.Dimension(40, 20));

        tfName.setText(NewMain.currentUser.getName());

        lbConfirmP.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbConfirmP.setText("Password:");
        lbConfirmP.setMaximumSize(new java.awt.Dimension(40, 20));
        lbConfirmP.setMinimumSize(new java.awt.Dimension(40, 20));
        lbConfirmP.setRequestFocusEnabled(false);

        btnSave.setBackground(new java.awt.Color(51, 102, 255));
        btnSave.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        lbConfirm.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbConfirm.setText("Confirm ");
        lbConfirm.setMaximumSize(new java.awt.Dimension(40, 20));
        lbConfirm.setMinimumSize(new java.awt.Dimension(40, 20));
        lbConfirm.setRequestFocusEnabled(false);

        lbPassword.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbPassword.setText("Password:");
        lbPassword.setMaximumSize(new java.awt.Dimension(40, 20));
        lbPassword.setMinimumSize(new java.awt.Dimension(40, 20));
        lbPassword.setRequestFocusEnabled(false);

        lbUsernameM.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbUsernameM.setText(NewMain.currentUser.getUsername());

        lbName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbName.setText("Name:");

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(lbConfirmP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbUsernameM))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                    .addComponent(tfName))))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbUsernameM))
                .addGap(18, 18, 18)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbConfirmP, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnSave)
                .addGap(26, 26, 26))
        );

        javax.swing.GroupLayout pnContentBgLayout = new javax.swing.GroupLayout(pnContentBg);
        pnContentBg.setLayout(pnContentBgLayout);
        pnContentBgLayout.setHorizontalGroup(
            pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnContentBgLayout.setVerticalGroup(
            pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(122, 122, 122)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(pnContentBg, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbSetting)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(pnContentBg, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            String name = tfName.getText();
            String password = tfPassword.getText();
            String cPassword = tfCPassword.getText();
            if (password.equals(cPassword)) {
                NewMain.currentUser.setName(name);
                NewMain.currentUser.setPassword(password);
                DataIO.write();
                this.dispose();
            } else {
                throw new Exception();
            }
            switch (NewMain.currentUser.getRole()) {
                case "admin":
                    AdminDashboardGUI adminDashboard = new AdminDashboardGUI();
                    adminDashboard.setVisible(true);
                    break;
                case "manager":
                    ManagerDashboardGUI managerDashboard = new ManagerDashboardGUI();
                    managerDashboard.setVisible(true);
                    break;
                case "technician":
                    TechnicianDashboardGUI technicianDashboard = new TechnicianDashboardGUI();
                    technicianDashboard.setVisible(true);
                    break;
                case "customer":
                    CustomerDashboardGUI customerDashboard = new CustomerDashboardGUI();
                    customerDashboard.setVisible(true);
                    break;
            
                default:
                    break;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error");
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        switch (NewMain.currentUser.getRole()) {
            case "admin":
                AdminDashboardGUI adminDashboard = new AdminDashboardGUI();
                adminDashboard.setVisible(true);
                break;
            case "manager":
                ManagerDashboardGUI managerDashboard = new ManagerDashboardGUI();
                managerDashboard.setVisible(true);
                break;
            case "technician":
                TechnicianDashboardGUI technicianDashboard = new TechnicianDashboardGUI();
                technicianDashboard.setVisible(true);
                break;
            case "customer":
                CustomerDashboardGUI customerDashboard = new CustomerDashboardGUI();
                customerDashboard.setVisible(true);
                break;
        
            default:
                break;
        }
        this.dispose();
    }//GEN-LAST:event_btnBackMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel lbConfirm;
    private javax.swing.JLabel lbConfirmP;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbSetting;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lbUsernameM;
    private javax.swing.JPanel pnBg;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnContentBg;
    private javax.swing.JTextField tfCPassword;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    // End of variables declaration//GEN-END:variables
}
