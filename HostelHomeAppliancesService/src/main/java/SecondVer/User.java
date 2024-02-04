package SecondVer;

public class User {
    private String username;
    private String name;
    private String password;
    private String role;

    public User(String username, String name, String password, String role) {
        this.username = username;
        this.name = name;
        this.password = password;
        this.role = role;
    }

    public User(String data) {
        String[] userData = data.split(",");
        this.username = userData[0];
        this.name = userData[1];
        this.password = userData[2];
        this.role = userData[3];
    }

    public boolean modifyUsername(String username) {
        FileHandler fileHandler = new FileHandler();
        String[] userData = fileHandler.readFile("users.txt");
        for (String data : userData) {
            String[] user = data.split(",");
            if (user[0].equals(username)) {
                return false;
            }
        }
        for (String data : userData) {
            String[] user = data.split(",");
            if (user[0].equals(this.username)) {
                String updatedUser = username + "," + user[1] + "," + user[2] + "," + user[3];
                fileHandler.updateFile("users.txt", data, updatedUser);
                this.username = username;
                return true;
            }
        }
        return false;

    }

    public String getUsername() {
        return this.username;
    }

    public String getName() {
        return this.name;
    }

    public String getPassword() {
        return this.password;
    }

    public String getRole() {
        return this.role;
    }

    public String toString() {
        return this.username + "," + this.name + "," + this.password;
    }

    
}
