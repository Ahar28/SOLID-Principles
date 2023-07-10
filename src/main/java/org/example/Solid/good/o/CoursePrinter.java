package org.example.Solid.good.o;
import java.util.Map;

class CoursePrinter implements Printer<Course_OCP_good> {
    public void print(Map<Integer, Course_OCP_good> courseMap) {
        for (Map.Entry<Integer, Course_OCP_good> entry : courseMap.entrySet()) {
            System.out.println("Course ID: " + entry.getKey() +
                    ", Name: " + entry.getValue().getCourseName() +
                    ", Credits: " + entry.getValue().getCredits());
        }
    }
}