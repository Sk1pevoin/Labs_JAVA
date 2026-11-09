package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;
import java.io.File;

public class SplitNumbers {
    public static void main(String[] args) {
        try {
            FileWriter fwF = new FileWriter("f.txt");
            Random random = new Random();
            for (int i = 0; i < 20; i++) {
                int num = random.nextInt(200) - 100;
                fwF.write(num + "\n");
            }
            fwF.close();

            Scanner scanner = new Scanner(new File("f.txt"));
            FileWriter fwG = new FileWriter("g.txt");
            FileWriter fwH = new FileWriter("h.txt");

            while (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                if (val > 0) {
                    fwG.write(val + "\n");
                } else if (val < 0) {
                    fwH.write(val + "\n");
                }
            }
            scanner.close();
            fwG.close();
            fwH.close();
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}