package task3;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Иванов И.И.", 125000.5),
                new Employee("Петров П.", 85000.0),
                new Employee("Сидоров С.С.", 100500.756),
                new Employee("Константинопольский", 95000.3)
        };

        Report.Report(employees);
    }
}

class Employee {
    String fullname;
    double salary;

    public Employee(String fullname, double salary) {
        this.fullname = fullname;
        this.salary = salary;
    }
}

class Report {
    public static void Report(Employee[] employees) {
        System.out.println("Отчет по зп");
        for (Employee emp : employees) {
            System.out.printf("%-15s %12.2f%n", emp.fullname, emp.salary);
        }
    }
}