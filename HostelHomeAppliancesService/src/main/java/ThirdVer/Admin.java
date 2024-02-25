package ThirdVer;

public class Admin extends User{
    public Admin(String username, String name, String password, String role) {
        super(username, name, password, role);
    }
    
    public void createManager(String username, String name, String password) {
        User user = new User(username, name, password, "manager");
        DataIO.allUsers.add(user);
        DataIO.write();
    }
    
    public void createTechnician(String username, String name, String password) {
        User user = new User(username, name, password, "technician");
        DataIO.allUsers.add(user);
        DataIO.write();
    }
    
    public void createCustomer(String username, String name, String password) {
        User user = new User(username, name, password, "customer");
        DataIO.allUsers.add(user);
        DataIO.write();
    }
    
    public void createAdmin(String username, String name, String password) {
        User user = new User(username, name, password, "admin");
        DataIO.allUsers.add(user);
        DataIO.write();
    }
}
