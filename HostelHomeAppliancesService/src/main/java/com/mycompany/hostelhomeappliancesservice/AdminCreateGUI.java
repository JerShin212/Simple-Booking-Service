package com.mycompany.hostelhomeappliancesservice;


import javax.swing.JOptionPane;


public class AdminCreateGUI extends javax.swing.JFrame {
    
    /**
     * Creates new form AdminCreateGUI
     */
    public AdminCreateGUI() {
        initComponents();
    }

    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        btnLogout = new javax.swing.JButton();
        pnSwitch = new javax.swing.JPanel();
        btnHome = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSetting = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        lbCreate = new javax.swing.JLabel();
        pnContent = new javax.swing.JPanel();
        pnContentBg = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        lbRole = new javax.swing.JLabel();
        btnCreateAcc = new javax.swing.JButton();
        cbRole = new javax.swing.JComboBox<>();
        tfUsername = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnBg.setBackground(new java.awt.Color(102, 102, 102));

        btnLogout.setBackground(new java.awt.Color(102, 102, 102));
        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hostelhomeappliancesservice/Logout.png"))); // NOI18N
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        btnHome.setBackground(new java.awt.Color(102, 102, 102));
        btnHome.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnHome.setForeground(new java.awt.Color(255, 255, 255));
        btnHome.setText("Home");
        btnHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHomeActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(102, 102, 102));
        btnEdit.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
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

        btnCreate.setBackground(new java.awt.Color(204, 204, 204));
        btnCreate.setFont(new java.awt.Font("Segoe UI", 1, 13)); // NOI18N
        btnCreate.setText("Create");

        javax.swing.GroupLayout pnSwitchLayout = new javax.swing.GroupLayout(pnSwitch);
        pnSwitch.setLayout(pnSwitchLayout);
        pnSwitchLayout.setHorizontalGroup(
            pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnSwitchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCreate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        pnSwitchLayout.setVerticalGroup(
            pnSwitchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnSwitchLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnHome, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSetting, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );

        lbCreate.setFont(new java.awt.Font("Bell MT", 0, 36)); // NOI18N
        lbCreate.setForeground(new java.awt.Color(214, 219, 223));
        lbCreate.setText("Create");

        pnContent.setBackground(new java.awt.Color(204, 204, 204));

        lbUsername.setText("Username: ");

        lbName.setText("Name:");

        lbPassword.setText("Password: ");

        lbRole.setText("Role:");

        btnCreateAcc.setText("Create");
        btnCreateAcc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAccActionPerformed(evt);
            }
        });

        cbRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Admin", "Customer", "Manager", "Technician" }));

        javax.swing.GroupLayout pnContentBgLayout = new javax.swing.GroupLayout(pnContentBg);
        pnContentBg.setLayout(pnContentBgLayout);
        pnContentBgLayout.setHorizontalGroup(
            pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentBgLayout.createSequentialGroup()
                .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbUsername, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                                .addComponent(lbName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lbPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lbRole))
                        .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentBgLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnContentBgLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfName, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(tfUsername)))))
                    .addGroup(pnContentBgLayout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(btnCreateAcc)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnContentBgLayout.setVerticalGroup(
            pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnContentBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbRole))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 59, Short.MAX_VALUE)
                .addComponent(btnCreateAcc)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnContentBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnContentLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnContentBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(lbCreate))
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(pnSwitch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addGap(314, 314, 314)
                        .addComponent(btnLogout))
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbCreate))
                .addGap(18, 18, 18)
                .addGroup(pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnSwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnBgLayout.createSequentialGroup()
                        .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        Login x = new Login();
        NewMain.currentUser = null;
        NewMain.admin = null;
        x.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHomeActionPerformed
        AdminDashboardGUI a = new AdminDashboardGUI();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHomeActionPerformed

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        AdminEditGUI b = new AdminEditGUI();
        b.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnEditActionPerformed

    private void btnSettingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSettingActionPerformed
        Setting y = new Setting();
        y.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnSettingActionPerformed


    private void btnCreateAccActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAccActionPerformed
        try {
            String username = tfUsername.getText();
            String name = tfName.getText();
            String password = tfPassword.getText();
            String role = cbRole.getSelectedItem().toString();
            if (username.equals("") || name.equals("") || password.equals("")) {
                throw new Exception("Please fill in all fields");
            }
            if (DataIO.allUsers.stream().anyMatch(u -> u.getUsername().equals(username))) {
                throw new Exception("Username already exists");
            }
            switch (role) {
                case "Admin":
                    NewMain.admin.createAdmin(username, name, password);
                    break;
                case "Manager":
                    NewMain.admin.createManager(username, name, password);
                    break;
                case "Technician":
                    NewMain.admin.createTechnician(username, name, password);
                    break;
                case "Customer":
                    NewMain.admin.createCustomer(username, name, password);
                    break;
            
                default:
                    break;
            }
            JOptionPane.showMessageDialog(null, "Account created successfully");
            tfUsername.setText("");
            tfName.setText("");
            tfPassword.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_btnCreateAccActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnCreateAcc;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnHome;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnSetting;
    private javax.swing.JComboBox<String> cbRole;
    private javax.swing.JPanel pnSwitch;
    private javax.swing.JPanel pnBg;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnContentBg;
    private javax.swing.JLabel lbCreate;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lbRole;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}

