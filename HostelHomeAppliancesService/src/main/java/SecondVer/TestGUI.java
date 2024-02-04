package HostelHomeApplianceService;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestGUI implements ActionListener{
    JFrame frame;
    Button btnLogin;
    User[] userData;

    public TestGUI(User[] userData) {
        this.userData = userData;
        frame = new JFrame("Test GUI");
        btnLogin = new Button("Login");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });

        btnLogin.addActionListener(this);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.add(btnLogin);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        try {
            if (evt.getSource() == btnLogin) {
                String username = JOptionPane.showInputDialog(frame, "Enter username");
                String password = JOptionPane.showInputDialog(frame, "Enter password");
                User userFound = null;
                for (User userData : userData) {
                    if (userData.getUsername().equals(username) && userData.getPassword().equals(password)) {
                        userFound = userData;
                        break;
                    }
                }
                if (userFound.getRole().equals("admin")) {
                    new TestAdminGUI(userFound, userData);
                    frame.dispose();
                } else if (userFound.getRole().equals("manager")) {
                    new TestManagerGUI(userFound, userData);
                    frame.dispose();
                } else if (userFound.getRole().equals("technician")) {
                    JOptionPane.showMessageDialog(frame, "Welcome technician");
                } else {
                    JOptionPane.showMessageDialog(frame, "Invalid username or password");
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
    }
}
