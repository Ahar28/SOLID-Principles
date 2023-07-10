package org.example.Solid.good.o;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class OCP_good<T> {
    static Map<Integer, Student_OCP_good> studentHashMap = new HashMap<>();
    static Map<Integer, Course_OCP_good> courseHashMap = new HashMap<>();

    public static void main(String[] args) {

        int choice;
        Scanner scanner = new Scanner(System.in);

        Student_OCP_good s1 = new Student_OCP_good(77,"abc",1999);
        Student_OCP_good s2 = new Student_OCP_good(56,"pqx",1998);
        Student_OCP_good s3 = new Student_OCP_good(89,"tuy",1997);
        studentHashMap.put(s1.getStudentId(), s1);
        studentHashMap.put(s2.getStudentId(), s2);
        studentHashMap.put(s3.getStudentId(), s3);

        Course_OCP_good c1 = new Course_OCP_good(23, "asdc", 3);
        Course_OCP_good c2 = new Course_OCP_good(10, "data", 2);
        Course_OCP_good c3 = new Course_OCP_good(7, "ux", 1);
        courseHashMap.put(c1.getCourse_ID(),c1);
        courseHashMap.put(c2.getCourse_ID(),c2);
        courseHashMap.put(c3.getCourse_ID(),c3);

        Sorter studentSorter = new StudentSorter();
        Sorter courseSorter = new CourseSorter();
        Printer studentPrinter = new StudentPrinter();
        Printer coursePrinter = new CoursePrinter();

        do {
            System.out.println();
            System.out.println("Welcome");
            System.out.println("1. View Students");
            System.out.println("2. View Courses");
            System.out.println("3. Sort Students");
            System.out.println("4. Sort Courses");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentPrinter.print(studentHashMap);
                    break;

                case 2:
                    coursePrinter.print(courseHashMap);
                    break;

                case 3:
                    studentHashMap=studentSorter.sort(studentHashMap);
                    studentPrinter.print(studentHashMap);
                    break;

                case 4:
                    courseHashMap=courseSorter.sort(courseHashMap);
                    coursePrinter.print(courseHashMap);
                    break;

                case 5:
                    System.out.println("Program exited Successfuly");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }

    public static void ViewCourse(Map<Integer,Object> courseHashMap ){
        System.out.println("");
        System.out.println("The Courses are:");
        for(int i=0;i<courseHashMap.size();i++ ){
            System.out.println("");
            System.out.println("Course_OCP_bad :- "+ (i+1) );
            System.out.println("Course :-"+courseHashMap.get(i).toString());
        }
    }

    public static void ViewStudents(Map<Integer,Object> studentHashMap){
        System.out.println("");
        System.out.println("Students List:");
        for(int i=0;i<studentHashMap.size();i++ ){
            System.out.println("");
            System.out.println("Student_bad_OCP No. :- "+(i+1) );
            System.out.println("Student :-"+studentHashMap.get(i).toString());

        }
    }
}