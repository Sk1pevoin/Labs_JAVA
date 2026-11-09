package org.example;



    public class Task2 {

        public static void main(String[] args) {
            Student[] students = {
                    new Student("Алексей Иванов", 8.5, "ПО-11"),
                    new Student("Мария Петрова", 9.8, "ПО-11"),
                    new Student("Дмитрий Сидоров", 7.2, "ИБ-21"),
                    new Student("Елена Смирнова", 9.1, "ПО-11"),
                    new Student("Игорь Кузнецов", 6.4, "ИБ-21"),
                    new Student("Ольга Морозова", 8.9, "ВМ-31"),
                    new Student("Сергей Васильев", 9.5, "ВМ-31")
            };

            Student topStudent = students[0];
            double sumGrades = 0;

            for (Student student : students) {
                sumGrades += student.getGrade();

                if (student.getGrade() > topStudent.getGrade()) {
                    topStudent = student;
                }
            }

            double averageGrade = sumGrades / students.length;

            System.out.println("Студент с максимальной оценкой:");
            System.out.println(topStudent);

            System.out.printf("Средняя оценка всех студентов: %.2f%n", averageGrade);
        }
    }
