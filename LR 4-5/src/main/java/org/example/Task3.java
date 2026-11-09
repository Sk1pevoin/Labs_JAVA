package org.example;

public class Task3 {

    public static void main(String[] args) {
        for (DayOfWeek day : DayOfWeek.values()) {
            String status = day.isWeekend() ? "Выходной" : "Рабочий день";
            System.out.printf("%-12s (%s) — %s%n", day.getRussianName(), day.name(), status);
        }
    }
}