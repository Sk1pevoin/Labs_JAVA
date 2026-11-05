package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class TenIntegersMax {
    public static void main(String[] args) {
        String fileName = "f.txt";
        Scanner scanner = new Scanner(System.in);
        try {
            FileWriter writer = new FileWriter(fileName);
            System.out.println("Enter 10 integers:");
            for (int i = 0; i < 10; i++) {
                int num = scanner.nextInt();
                writer.write(num + "\n");
            }
            writer.close();

            Scanner fileScanner = new Scanner(new File(fileName));
            int max = Integer.MIN_VALUE;
            System.out.println("Numbers from file:");
            while (fileScanner.hasNextInt()) {
                int val = fileScanner.nextInt();
                System.out.print(val + " ");
                if (val > max) {
                    max = val;
                }
            }
            fileScanner.close();
            System.out.println("\nMax value: " + max);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}