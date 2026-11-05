import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите текст:");
        String text = in.nextLine();

        char firstChar = text.charAt(0);

        System.out.println(firstChar);
    }
}