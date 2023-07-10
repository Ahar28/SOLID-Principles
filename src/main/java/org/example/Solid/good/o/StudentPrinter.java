package org.example.Solid.good.o;

import java.util.Map;

public class StudentPrinter implements Printer<Student_OCP_good> {
    public void print(Map<Integer, Student_OCP_good> studentMap) {
        for (Map.Entry<Integer, Student_OCP_good> entry : studentMap.entrySet()) {
            System.out.println("Student ID: " + entry.getKey() +
                    ", Name: " + entry.getValue().getStudentName() +
                    ", Batch Year: " + entry.getValue().getBatchYear());
        }
    }
}
