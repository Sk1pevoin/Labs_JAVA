package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class PressureAverage {
    public static void main(String[] args) {
        String fileName = "pressure.txt";
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter 15 real pressure values:");
            for (int i = 0; i < 15; i++) {
                double p = scanner.nextDouble();
                writer.write(p + "\n");
            }
            writer.close();

            Scanner fileScanner = new Scanner(new File(fileName));
            double sum = 0;
            int count = 0;
            while (fileScanner.hasNextDouble()) {
                sum += fileScanner.nextDouble();
                count++;
            }
            fileScanner.close();
            double avg = count > 0 ? sum / count : 0;
            System.out.println("Average pressure: " + avg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}