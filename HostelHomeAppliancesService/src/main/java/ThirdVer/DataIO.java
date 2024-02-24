package ThirdVer;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.ArrayList;
public class DataIO {
    public static ArrayList<User> allUsers = new ArrayList<User>();
    public static void read() {
        try {
            File userFile = new File("users.txt");
            checkFile(userFile);
            Scanner userScanner = new Scanner(userFile);
            while (userScanner.hasNextLine()) {
                String data = userScanner.nextLine();
                String[] userData = data.split(",");
                User user = new User(userData[0], userData[1], userData[2], userData[3]);
                allUsers.add(user);
            }
            userScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            
        }
    }

    public static void write() {
        try {
            File userFile = new File("users.txt");
            checkFile(userFile);
            FileWriter userWriter = new FileWriter(userFile);
            for (User user : allUsers) {
                userWriter.write(user.getUsername() + "," + user.getName() + "," + user.getPassword() + "," + user.getRole() + "\n");
            }
            userWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    private static void checkFile(File file) {
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static User checkUser (String username) {
        for (User user : allUsers) {
            if (user.getUsername().equals(username)) {
                return user;
            }
        }
        return null;
    }
}
