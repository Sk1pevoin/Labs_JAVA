package org.example;

public class StudentNotFoundException extends RuntimeException {
    private int studentId;

    public StudentNotFoundException(int studentId, String message) {
        super(message);
        this.studentId = studentId;
    }

    public int getStudentId() {
        return studentId;
    }
}