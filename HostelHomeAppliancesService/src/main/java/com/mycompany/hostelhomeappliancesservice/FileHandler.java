package com.mycompany.hostelhomeappliancesservice;
import java.io.File;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class FileHandler {

    public String createFile(String filePath) {
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                return "File created: " + file.getName();
            } else {
                return "File already exists.";
            }
        } catch (IOException e) {
            return "Error creating file: " + e.getMessage();
        }
    }

    public boolean checkFileExistence(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }

    public List<String> readFile(String filePath) {
        if (!checkFileExistence(filePath)) {
            createFile(filePath);
        }
        List<String> lines = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(filePath))) {
            while (scanner.hasNextLine()) {
                lines.add(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            lines.clear();
            lines.add("Error reading file: " + e.getMessage());
        }
        return lines;
    }

    public String writeFile(String filePath, List<String> dataLines) {
        if (!checkFileExistence(filePath)) {
            createFile(filePath);
        }
        try (FileWriter fileWriter = new FileWriter(filePath)) {
            for (String line : dataLines) {
                fileWriter.write(line + "\n");
            }
            return "Success";
        } catch (IOException e) {
            return "Error writing file: " + e.getMessage();
        }
    }

    public String appendFile(String filePath, String data) {
        if (!checkFileExistence(filePath)) {
            createFile(filePath);
        }
        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(data + "\n");
            return "Success";
        } catch (IOException e) {
            return "Error appending file: " + e.getMessage();
        }
    }

    public String updateFile(String filePath, String oldData, String newData) {
        if (!checkFileExistence(filePath)) {
            createFile(filePath);
        }
        List<String> lines = readFile(filePath);
        boolean isUpdated = false;
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).equals(oldData)) {
                lines.set(i, newData);
                isUpdated = true;
            }
        }
        if (isUpdated) {
            return writeFile(filePath, lines);
        }
        return "No changes made.";
    }
}

