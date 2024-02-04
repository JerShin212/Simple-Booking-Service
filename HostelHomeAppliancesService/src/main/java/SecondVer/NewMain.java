package SecondVer;


public class NewMain {
    public static void main(String[] args) {
        FileHandler fileHandler = new FileHandler();
        String[] userData = fileHandler.readFile("users.txt");
        User[] data = new User[userData.length];
        for (int i = 0; i < userData.length; i++) {
            data[i] = new User(userData[i]);
        }
        testGUI = new TestGUI(data);
    }

    static TestGUI testGUI;

}
