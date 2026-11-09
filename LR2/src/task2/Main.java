package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер:");
        int i = in.nextInt();
        int[][] numbers = new int[i][i];
        int sum = 0;
        System.out.println("Введите числа:");
        for (int q = 0; q < numbers.length; q++) {
            for (int e = 0; e < numbers.length; e++) {
                numbers[q][e] = in.nextInt();
            }
        }
        for (int j = 0; j < numbers.length; j++) {
            for(int o=j;o<numbers.length-1-j;o++){
                sum+=numbers[j][o];
            }
            sum += numbers[j][j];
        }
        System.out.println("Сумма главной диагонали: " + sum);
    }
}