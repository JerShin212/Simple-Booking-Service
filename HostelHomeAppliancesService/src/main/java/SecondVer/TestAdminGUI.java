package SecondVer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TestAdminGUI implements ActionListener{
    JFrame frame;
    Button btnCreateAccountTechnician, btnCreateAccountManager, btnLogOut;
    Admin admin;
    User[] userData;

    public TestAdminGUI(User user, User[] userData) {
        admin = new Admin(user.getUsername(), user.getName(), user.getPassword(), user.getRole());
        this.userData = userData;
        frame = new JFrame("Test Admin GUI");
        btnCreateAccountTechnician = new Button("Create Account for Technician");
        btnCreateAccountManager = new Button("Create Account for Manager");
        btnLogOut = new Button("Log Out");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });

        btnCreateAccountTechnician.addActionListener(this);
        btnCreateAccountManager.addActionListener(this);
        btnLogOut.addActionListener(this);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.add(btnCreateAccountTechnician);
        frame.add(btnCreateAccountManager);
        frame.add(btnLogOut);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        try {
            if (evt.getSource() == btnCreateAccountTechnician) {
                String username = JOptionPane.showInputDialog(frame, "Enter username");
                String name = JOptionPane.showInputDialog(frame, "Enter name");
                String password = JOptionPane.showInputDialog(frame, "Enter password");
                String role = "technician";
                boolean created = admin.createAccount(username, name, password, role);
                if (created) {
                    JOptionPane.showMessageDialog(frame, "Account created");
                } else {
                    JOptionPane.showMessageDialog(frame, "Account not created, username already exists");
                }
            } else if (evt.getSource() == btnCreateAccountManager) {
                String username = JOptionPane.showInputDialog(frame, "Enter username");
                String name = JOptionPane.showInputDialog(frame, "Enter name");
                String password = JOptionPane.showInputDialog(frame, "Enter password");
                String role = "manager";
                boolean created = admin.createAccount(username, name, password, role);
                if (created) {
                    JOptionPane.showMessageDialog(frame, "Account created");
                } else {
                    JOptionPane.showMessageDialog(frame, "Account not created, username already exists");
                }
            } else if (evt.getSource() == btnLogOut) {
                new TestGUI(userData);
                frame.dispose();
                JOptionPane.showMessageDialog(frame, "Log Out");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, "An error occurred");
        }
    }
}
