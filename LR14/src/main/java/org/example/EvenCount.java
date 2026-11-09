package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class EvenCount {
    public static void main(String[] args) {
        String fileName = "f.txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            Random random = new Random();
            for (int i = 0; i < 10; i++) {
                writer.write(random.nextInt(100) + "\n");
            }
            writer.close();

            Scanner scanner = new Scanner(new File(fileName));
            int evenCount = 0;
            while (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                if (val % 2 == 0) {
                    evenCount++;
                }
            }
            scanner.close();
            System.out.println("Even count: " + evenCount);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}