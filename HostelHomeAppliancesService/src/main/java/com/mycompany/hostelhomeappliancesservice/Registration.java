package com.mycompany.hostelhomeappliancesservice;

import javax.swing.JOptionPane;

public class Registration extends javax.swing.JFrame  {

    public Registration() {
        initComponents();
    }

    private void initComponents() {

        pnBg = new javax.swing.JPanel();
        pnContent = new javax.swing.JPanel();
        lbUsername = new javax.swing.JLabel();
        lbConfirmP = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        lbConfirm = new javax.swing.JLabel();
        lbPassword1 = new javax.swing.JLabel();
        lbUser = new javax.swing.JLabel();
        lkLogin = new javax.swing.JLabel();
        lbName = new javax.swing.JLabel();
        tfUsername = new javax.swing.JTextField();
        tfName = new javax.swing.JTextField();
        tfPassword = new javax.swing.JTextField();
        tfConfirmP = new javax.swing.JTextField();
        lbRegistration = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnBg.setBackground(new java.awt.Color(102, 102, 102));

        pnContent.setBackground(new java.awt.Color(204, 204, 204));

        lbUsername.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbUsername.setText("Username: ");
        lbUsername.setMaximumSize(new java.awt.Dimension(40, 20));
        lbUsername.setMinimumSize(new java.awt.Dimension(40, 20));
        lbUsername.setPreferredSize(new java.awt.Dimension(40, 20));

        lbConfirmP.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbConfirmP.setText("Password:");
        lbConfirmP.setMaximumSize(new java.awt.Dimension(40, 20));
        lbConfirmP.setMinimumSize(new java.awt.Dimension(40, 20));
        lbConfirmP.setRequestFocusEnabled(false);

        btnSignUp.setBackground(new java.awt.Color(51, 102, 255));
        btnSignUp.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        btnSignUp.setForeground(new java.awt.Color(255, 255, 255));
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        lbConfirm.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbConfirm.setText("Confirm ");
        lbConfirm.setMaximumSize(new java.awt.Dimension(40, 20));
        lbConfirm.setMinimumSize(new java.awt.Dimension(40, 20));
        lbConfirm.setRequestFocusEnabled(false);

        lbPassword1.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbPassword1.setText("Password:");
        lbPassword1.setMaximumSize(new java.awt.Dimension(40, 20));
        lbPassword1.setMinimumSize(new java.awt.Dimension(40, 20));
        lbPassword1.setRequestFocusEnabled(false);

        lbUser.setText("Already got an account?");

        lkLogin.setForeground(new java.awt.Color(51, 51, 255));
        lkLogin.setText("Login");
        lkLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lkLoginMouseClicked(evt);
            }
        });

        lbName.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        lbName.setText("Name:");

        javax.swing.GroupLayout pnContentLayout = new javax.swing.GroupLayout(pnContent);
        pnContent.setLayout(pnContentLayout);
        pnContentLayout.setHorizontalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbUser))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lkLogin))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tfUsername)
                                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addComponent(lbPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfPassword))
                            .addGroup(pnContentLayout.createSequentialGroup()
                                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbConfirmP, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tfConfirmP, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnContentLayout.setVerticalGroup(
            pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnContentLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbName)
                    .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPassword1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lbConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbConfirmP, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnContentLayout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(tfConfirmP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(btnSignUp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbUser)
                    .addComponent(lkLogin))
                .addGap(21, 21, 21))
        );

        lbRegistration.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lbRegistration.setForeground(new java.awt.Color(255, 255, 255));
        lbRegistration.setText("Registration");

        javax.swing.GroupLayout pnBgLayout = new javax.swing.GroupLayout(pnBg);
        pnBg.setLayout(pnBgLayout);
        pnBgLayout.setHorizontalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnBgLayout.createSequentialGroup()
                .addContainerGap(153, Short.MAX_VALUE)
                .addComponent(lbRegistration)
                .addGap(140, 140, 140))
        );
        pnBgLayout.setVerticalGroup(
            pnBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnBgLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lbRegistration)
                .addGap(18, 18, 18)
                .addComponent(pnContent, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnBg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        try {
            String username = tfUsername.getText();
            String name = tfName.getText();
            String password = tfPassword.getText();
            String confirmPassword = tfConfirmP.getText();
            if (username.equals("") || name.equals("") || password.equals("") || confirmPassword.equals("")) {
                throw new Exception("Please fill in all fields");
            }
            if (!password.equals(confirmPassword)) {
                throw new Exception("Password does not match");
            }
            if (DataIO.allUsers.stream().anyMatch(u -> u.getUsername().equals(username))) {
                throw new Exception("Username already exists");
            }
            User user = new User(username, name, password, "customer");
            DataIO.allUsers.add(user);
            DataIO.write();
            Login a = new Login();
            a.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "An error occurred. " + e.getMessage());
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void lkLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lkLoginMouseClicked
        Login a = new Login();
        a.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lkLoginMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lbRegistration;
    private javax.swing.JPanel pnContent;
    private javax.swing.JPanel pnBg;
    private javax.swing.JLabel lbConfirm;
    private javax.swing.JLabel lbConfirmP;
    private javax.swing.JLabel lbName;
    private javax.swing.JLabel lbPassword1;
    private javax.swing.JLabel lbUser;
    private javax.swing.JLabel lbUsername;
    private javax.swing.JLabel lkLogin;
    private javax.swing.JTextField tfConfirmP;
    private javax.swing.JTextField tfName;
    private javax.swing.JTextField tfPassword;
    private javax.swing.JTextField tfUsername;
    // End of variables declaration//GEN-END:variables
}
