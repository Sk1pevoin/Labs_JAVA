package org.example;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void printEmployees(List<Employee> employees, int level) {
        System.out.println("Сотрудники на уровне " + level);
        for (Employee e : employees) {
            if (e.getLevel() == level) {
                System.out.println("ID: " + e.getId() + ", Имя: " + e.getName() + ", Отдел: " + e.getDepartment());
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("E001", "Алексей", "IT", 2, Arrays.asList(4, 5, 4)));
        employees.add(new Employee("E002", "Иван", "HR", 1, Arrays.asList(2, 3, 2)));
        employees.add(new Employee("E003", "Мария", "IT", 3, Arrays.asList(5, 5, 4)));
        employees.add(new Employee("E004", "Ольга", "Finance", 2, Arrays.asList(3, 3, 3)));
        employees.add(new Employee("E005", "Петр", "IT", 1, Arrays.asList(1, 2, 2)));

        employees.removeIf(e -> e.getAveragePerformance() < 3.0);

        for (Employee e : employees) {
            if (e.getAveragePerformance() >= 4.0) {
                e.setLevel(e.getLevel() + 1);
            }
        }

        printEmployees(employees, 3);

        employees.sort((e1, e2) -> {
            int cmp = Double.compare(e2.getAveragePerformance(), e1.getAveragePerformance());
            if (cmp != 0) {
                return cmp;
            }
            return e1.getName().compareTo(e2.getName());
        });

        for (Employee e : employees) {
            System.out.println("ID: " + e.getId() + ", Имя: " + e.getName() + ", Средняя оценка: " + e.getAveragePerformance());
        }
    }
}