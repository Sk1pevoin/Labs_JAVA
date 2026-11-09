package org.example;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class CityInfoApp {
    public static void main(String[] args) {
        String fileName = "city.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("City: Minsk\nCountry: Belarus\nPopulation: 2000000");
            writer.close();

            File file = new File(fileName);
            System.out.println("File name: " + file.getName());
            System.out.println("Absolute path: " + file.getAbsolutePath());
            System.out.println("Size: " + file.length() + " bytes");
            System.out.println("Readable: " + file.canRead());

            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}