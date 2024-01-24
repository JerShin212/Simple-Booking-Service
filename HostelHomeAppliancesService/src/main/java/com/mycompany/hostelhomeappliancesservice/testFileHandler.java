package com.mycompany.hostelhomeappliancesservice;

import java.util.Arrays;
import java.util.List;

public class testFileHandler {
    public static void main(String[] args) {
        String testFilePath = "testCSVFile.txt";
        FileHandler FileHandler = new FileHandler();

        // Test file creation
        System.out.println(FileHandler.createFile(testFilePath));

        // Test writing CSV data to file
        List<String> dataLines = Arrays.asList("1,Apple,Red", "2,Banana,Yellow", "3,Cherry,Red");
        System.out.println(FileHandler.writeFile(testFilePath, dataLines));

        // Test reading file
        List<String> readLines = FileHandler.readFile(testFilePath);
        System.out.println("Contents of the file:");
        for (String line : readLines) {
            System.out.println(line);
        }

        // Test updating a CSV record (updating Banana to Green)
        String oldData = "2,Banana,Yellow";
        String newData = "2,Banana,Green";
        System.out.println(FileHandler.updateFile(testFilePath, oldData, newData));

        // Read file again to check updates
        readLines = FileHandler.readFile(testFilePath);
        System.out.println("Updated contents of the file:");
        for (String line : readLines) {
            System.out.println(line);
        }
    }
}
