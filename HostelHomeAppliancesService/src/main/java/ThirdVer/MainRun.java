package ThirdVer;

public class MainRun {
    static Login loginPage;
    static User currentUser;
    static Admin admin;
    static Manager manager;
    static Technician technician;
    static Customer customer;
    public static void main(String[] args) {
        DataIO.read();
        loginPage = new Login();
        loginPage.setVisible(true);
    }

}
