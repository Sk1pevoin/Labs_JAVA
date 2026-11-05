import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите номер задания:");
        var i = in.nextInt();
        while (i < 1 || i > 3) {
            System.out.println("Введите номер задания:");
            i = in.nextInt();
        }
        switch (i) {
            case 1:
                System.out.println("Введите имя:");
                var name = in.next();
                System.out.println("Введите возраст:");
                int age = in.nextInt();
                System.out.println(name);
                System.out.println(age);
                break;
            case 2:
                System.out.println("Введите число:");
                int number = in.nextInt();
                if (number % 2 == 0) System.out.println("Да");
                else System.out.println("Нет");
                break;
            case 3:
//                for (int j = 10; j >= 1; j--) {
//                    System.out.print(j + " ");
//                }
                int j=10;
                do{
                    System.out.print(j + " ");
                    j--;
                }
                while(j!=0);
                break;
        }
        in.close();
    }
}