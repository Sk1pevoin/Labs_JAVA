package org.example;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        try {
            students.add(new Student("Иван", 20, 4, "IP-21"));
            students.add(new Student("Анна", 19, 3, "IP-22"));
            students.add(new Student("", 22, 5, "IP-23"));
        } catch (InvalidStudentDataException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student s = findStudentById(students, 1);
            if (s == null) {
                throw new StudentNotFoundException(1, "Not found");
            }
            s.updateGrade(5);
            s.promote();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            Student s = findStudentById(students, 99);
            if (s == null) {
                throw new StudentNotFoundException(99, "Not found");
            }
        } catch (StudentNotFoundException e) {
            System.out.println(e.getStudentId() + " " + e.getMessage());
        }

        for (Student s : students) {
            System.out.println(s);
        }
    }

    private static Student findStudentById(List<Student> students, int id) {
        for (Student s : students) {
            if (s.getId() == id) {
                return s;
            }
        }
        return null;
    }
}