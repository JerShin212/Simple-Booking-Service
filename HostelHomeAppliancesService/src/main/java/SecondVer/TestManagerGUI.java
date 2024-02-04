package SecondVer;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TestManagerGUI implements ActionListener{
    JFrame frame;
    Button btnCreateAccountCustomer, btnBookAppointment, btnViewTechnicianSchdeule, btnLogOut;
    Manager manager;
    User[] userData;

    public TestManagerGUI(User user, User[] userData) {
        manager = new Manager(user.getUsername(), user.getName(), user.getPassword(), user.getRole());
        this.userData = userData;
        frame = new JFrame("Test Manager GUI");
        btnCreateAccountCustomer = new Button("Create Account for Customer");
        btnBookAppointment = new Button("Book Appointment");
        btnViewTechnicianSchdeule = new Button("View Technician Schedule");
        btnLogOut = new Button("Log Out");

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });

        btnCreateAccountCustomer.addActionListener(this);
        btnBookAppointment.addActionListener(this);
        btnViewTechnicianSchdeule.addActionListener(this);
        btnLogOut.addActionListener(this);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.add(btnCreateAccountCustomer);
        frame.add(btnBookAppointment);
        frame.add(btnViewTechnicianSchdeule);
        frame.add(btnLogOut);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent evt) {
        try {
            if (evt.getSource() == btnCreateAccountCustomer) {
                String username = JOptionPane.showInputDialog(frame, "Enter username");
                String name = JOptionPane.showInputDialog(frame, "Enter name");
                String password = JOptionPane.showInputDialog(frame, "Enter password");
                String role = "customer";
                boolean created = manager.createAccount(username, name, password, role);
                if (created) {
                    JOptionPane.showMessageDialog(frame, "Account created");
                } else {
                    JOptionPane.showMessageDialog(frame, "Account not created, username already exists");
                }
            } else if (evt.getSource() == btnBookAppointment) {
                String username = JOptionPane.showInputDialog(frame, "Enter username");
                String date = JOptionPane.showInputDialog(frame, "Enter date (yyyy-MM-dd)");
                String time = JOptionPane.showInputDialog(frame, "Enter time (HH:mm)");
                String technician = JOptionPane.showInputDialog(frame, "Enter technician");
                String description = JOptionPane.showInputDialog(frame, "Enter description");
                boolean technicianExists = manager.checkTechnicianExists(userData, technician);
                boolean customerExists = manager.checkCustomerExists(userData, username);
                if (!technicianExists) {
                    JOptionPane.showMessageDialog(frame, "Technician does not exist");
                } else if (!customerExists) {
                    JOptionPane.showMessageDialog(frame, "Customer does not exist");
                } else {
                    boolean booked = manager.bookAppointment(username, date, time, technician, description);
                    if (booked) {
                        JOptionPane.showMessageDialog(frame, "Appointment booked");
                    } else {
                        JOptionPane.showMessageDialog(frame, "Appointment not booked, appointment already exists");
                    }
                }
                
            } else if (evt.getSource() == btnViewTechnicianSchdeule) {
                String technician = JOptionPane.showInputDialog(frame, "Enter technician username: ");
                String schedule = manager.viewTechnicianSchedule(technician);
                if (schedule.equals("")) {
                    JOptionPane.showMessageDialog(frame, "No appointments found");
                }
                JOptionPane.showMessageDialog(frame, schedule);
            } else if (evt.getSource() == btnLogOut) {
                new TestGUI(userData);
                frame.dispose();
            }
        } catch (Exception e){
            JOptionPane.showMessageDialog(frame, e.getMessage());
        }
    } // Inserted missing closing brace
}
