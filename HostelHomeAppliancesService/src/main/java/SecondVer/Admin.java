package HostelHomeApplianceService;

public class Admin extends User{
    public Admin(String username, String name, String password, String role) {
        super(username, name, password, role);
    }
    
    public Admin(String data) {
        super(data);
    }
    
    public String toString() {
        return super.toString();
    }

    public boolean createAccount(String username, String name, String password, String role) {
        if (username != null && name != null && password != null && role != null) {
            FileHandler fileHandler = new FileHandler();
            String[] userData = fileHandler.readFile("users.txt");
            for (String data : userData) {
                String[] user = data.split(",");
                if (user[0].equals(username)) {
                    return false;
                }
            }
            String user = username + "," + name + "," + password + "," + role;
            fileHandler.appendFile("users.txt", user);
            return true;
        }
        return false;
    }
}
