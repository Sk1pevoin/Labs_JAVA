package org.example;

public class Student {
    private static int idCounter = 1;
    private int id;
    private String name;
    private int age;
    private int grade;
    private String group;

    public Student(String name, int age, int grade, String group) {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidStudentDataException("Invalid name");
        }
        if (age < 16 || age > 60) {
            throw new InvalidStudentDataException("Invalid age");
        }
        if (grade < 1 || grade > 5) {
            throw new InvalidStudentDataException("Invalid grade");
        }
        this.id = idCounter++;
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.group = group;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getGrade() {
        return grade;
    }

    public String getGroup() {
        return group;
    }

    public void updateGrade(int newGrade) {
        if (newGrade < 1 || newGrade > 5) {
            throw new GradeUpdateException("Invalid new grade");
        }
        this.grade = newGrade;
    }

    public void promote() {
        if (this.grade < 5) {
            this.grade++;
        } else {
            throw new GradeUpdateException("Cannot promote further");
        }
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + grade + " " + group;
    }
}