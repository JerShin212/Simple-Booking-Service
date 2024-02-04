package SecondVer;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
public class FileHandler {

    public String[] readFile(String fileName) {
        try {
            File file = new File(fileName);
            if (!checkFile(fileName)) {
                createFile(fileName);
            }
            Scanner scanner = new Scanner(file);
            ArrayList<String> data = new ArrayList<String>();
            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
            scanner.close();
            return data.toArray(new String[data.size()]);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return null;
        }
    }

    public boolean checkFile(String fileName) {
        File file = new File(fileName);
        return file.exists();
    }

    public boolean createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
                return true;
            } else {
                System.out.println("File already exists.");
                return false;
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean appendFile(String fileName, String data) {
        try {
            FileWriter fileWriter = new FileWriter(fileName, true);
            fileWriter.write(data + "\n");
            fileWriter.close();
            System.out.println("Successfully wrote to the file.");
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }

    public boolean updateFile(String fileName, String oldData, String newData) {
        try {
            File file = new File(fileName);
            if (!checkFile(fileName)) {
                createFile(fileName);
            }
            Scanner scanner = new Scanner(file);
            ArrayList<String> data = new ArrayList<String>();
            while (scanner.hasNextLine()) {
                data.add(scanner.nextLine());
            }
            scanner.close();
            for (int i = 0; i < data.size(); i++) {
                if (data.get(i).equals(oldData)) {
                    data.set(i, newData);
                }
            }
            FileWriter fileWriter = new FileWriter(fileName);
            for (String line : data) {
                fileWriter.write(line + "\n");
            }
            fileWriter.close();
            System.out.println("Successfully updated the file.");
            return true;
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
    }
}
