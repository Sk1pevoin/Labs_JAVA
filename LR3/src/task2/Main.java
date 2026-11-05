package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите предложение:");
        String text = in.nextLine().trim();

        if (text.isEmpty()) {
            System.out.println("Количество слов: 0");
        }
        else {
            String[] words = text.split("\\s+");

            System.out.println("Количество слов: " + words.length);
        }
    }
}