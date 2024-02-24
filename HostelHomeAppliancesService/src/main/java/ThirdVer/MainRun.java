package ThirdVer;

public class MainRun {
    static Login loginPage;
    static User currentUser = null;
    public static void main(String[] args) {
        DataIO.read();
        loginPage = new Login();
        loginPage.setVisible(true);
    }
}
