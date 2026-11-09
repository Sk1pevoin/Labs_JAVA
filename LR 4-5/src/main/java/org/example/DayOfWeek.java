package org.example;

enum DayOfWeek {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String russianName;

    // Конструктор
    DayOfWeek(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    // Метод проверки выходного дня
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}
