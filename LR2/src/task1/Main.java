package task1;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер:");
        int i = in.nextInt();
        int[] numbers = new int[i];
        System.out.println("Введите числа:");
        Random rand=new Random();
        for (int j = 0; j < numbers.length; j++) {
            numbers[j] = in.nextInt();
            //numbers[j]= rand.nextInt(100);
        }
        for (int q = 0; q < numbers.length/2; q++) {
           // System.out.println(numbers[q]);
            int temp = numbers[q];
            numbers[q] = numbers[numbers.length - 1 - q];
            numbers[numbers.length - 1 - q] = temp;
        }
        for(int w=0;w< numbers.length;w++){
            System.out.println(numbers[w]);
        }
    }
}