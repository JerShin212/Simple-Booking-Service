package com.mycompany.hostelhomeappliancesservice;

import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame{

    public Login() {
        initComponents();
    }

    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        lbLogo = new javax.swing.JLabel();
        pnContent = new javax.swing.JPanel();
        lkRegister = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        lbPassword = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        lbNot = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnBg.setBackground(new java.awt.Color(102, 102, 102));

        lbLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/mycompany/hostelhomeappliancesservice/FixFlex.png"))); // NOI18N
        lbLogo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogo.setVerticalAlignment(javax.swing.SwingConstants.CENTER);
        

        pnContent.setBackground(new java.awt.Color(204, 204, 204));

        lkRegister.setForeground(new java.awt.Color(51, 51, 255));
        lkRegister.setText("Register");
        lkRegister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lkRegisterMouseClicked(evt);
            }
        });

        lbName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbName.setText("Username: ");
        lbName.setMaximumSize(new java.awt.Dimension(40, 20));
        lbName.setMinimumSize(new java.awt.Dimension(40, 20));
        lbName.setPreferredSize(new java.awt.Dimension(40, 20));

        lbPassword.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbPassword.setText("Password:");
        lbPassword.setMaximumSize(new java.awt.Dimension(40, 20));
        lbPassword.setMinimumSize(new java.awt.Dimension(40, 20));
        lbPassword.setRequestFocusEnabled(false);

        btnLogin.setBackground(new java.awt.Color(51, 102, 255));
        btnLogin.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        lbNot.setText("Not a user yet?");

        tfUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfUsernameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(lbNot)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lkRegister))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfUsername)
                            .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addGap(18, 18, 18)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNot)
                    .addComponent(lkRegister))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lbLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(pnContent, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        try {
            String username = tfUsername.getText();
            String password = tfPassword.getText();
            User user = DataIO.checkUser(username);
            if (user != null) {
                if (user.getPassword().equals(password)) {
                    NewMain.currentUser = user;
                    switch (user.getRole()) {
                        case "admin":
                            AdminDashboardGUI admin = new AdminDashboardGUI();
                            NewMain.admin = new Admin(user.getUsername(), user.getName(), user.getPassword(), user.getRole());
                            admin.setVisible(true);
                            this.dispose();
                            break;
                        case "manager":
                            ManagerDashboardGUI manager = new ManagerDashboardGUI();
                            NewMain.manager = new Manager(user.getUsername(), user.getName(), user.getPassword(), user.getRole());
                            manager.setVisible(true);
                            this.dispose();
                            break;
                        case "technician":
                            TechnicianDashboardGUI technician = new TechnicianDashboardGUI();
                            NewMain.technician = new Technician(user.getUsername(), user.getName(), user.getPassword(), user.getRole());
                            technician.setVisible(true);
                            this.dispose();
                            break;
                        case "customer":
                            CustomerDashboardGUI customer = new CustomerDashboardGUI();
                            NewMain.customer = new Customer(user.getUsername(), user.getName(), user.getPassword(), user.getRole());
                            customer.setVisible(true);
                            this.dispose();
                            break;
                        default:
                            throw new Exception("No role found for user");
                    }
                } else {
                    throw new Exception("Password is incorrect");
                }
            } else {
                throw new Exception("User not found");
            }
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void tfUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfUsernameActionPerformed

    private void lkRegisterMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lkRegisterMouseClicked
        Registration a = new Registration();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lkRegisterMouseClicked

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel lbLogo;
    private javax.swing.JLabel lbNot;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnBg;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword;
    private javax.swing.JLabel lkRegister;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
    
}
