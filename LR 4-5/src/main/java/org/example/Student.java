package org.example;

public class Student {
    private String name;
    private double grade;
    private String group;

    // Конструктор
    public Student(String name, double grade, String group) {
        this.name = name;
        this.grade = grade;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public double getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    @Override
    public String toString() {
        return name + " (Группа: " + group + ", Оценка: " + grade + ")";
    }
}