package org.example.Solid.good.o;

public class Student_OCP_good {
    private int studentId;
    private String studentName;
    private int batchYear;

    public Student_OCP_good(int studentId, String studentName, int batchyear) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.batchYear = batchyear;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public int getBatchYear() {
        return batchYear;
    }

    public void setBatchYear(int batchYear) {
        this.batchYear = batchYear;
    }
}
