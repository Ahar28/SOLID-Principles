package org.example.Solid.bad.o;

import java.util.*;

public class OCP_bad {

        static Map<Integer, Student_bad_OCP> studentHashMap = new HashMap<>();
        static Map<Integer, Course_OCP_bad> sortedCourseMap= new TreeMap<>();
        static Map<Integer, Course_OCP_bad> courseHashMap = new HashMap<>();
        static Map<Integer, Student_bad_OCP> sortedStudentMap= new TreeMap<>();
        public static void main(String[] args) {

            int choice;
            Scanner scanner = new Scanner(System.in);

            Student_bad_OCP s1 = new Student_bad_OCP(77,"s1",1999);
            Student_bad_OCP s2 = new Student_bad_OCP(56,"s2",1998);
            Student_bad_OCP s3 = new Student_bad_OCP(89,"s3",1997);
            studentHashMap.put(s1.getStudentId(), s1);
            studentHashMap.put(s2.getStudentId(), s2);
            studentHashMap.put(s3.getStudentId(), s3);

            Course_OCP_bad c1 = new Course_OCP_bad(23, "asdc", 3);
            Course_OCP_bad c2 = new Course_OCP_bad(10, "data", 2);
            Course_OCP_bad c3 = new Course_OCP_bad(7, "ux", 1);
            courseHashMap.put(c1.getCourse_ID(),c1);
            courseHashMap.put(c2.getCourse_ID(),c2);
            courseHashMap.put(c3.getCourse_ID(),c3);

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    ViewStudents(studentHashMap);
                    break;

                case 2:
                    ViewCourse(courseHashMap);
                    break;

                case 3:
                    sortedStudentMap = sortStudents(studentHashMap);
                    ViewStudents(sortedStudentMap);
                    break;

                case 4:
                    sortedCourseMap = sortCourses(courseHashMap);
                    ViewCourse(sortedCourseMap);
                    break;

                case 5:
                    System.out.println("Program exited Successfuly");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            while (choice != 5) {
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
                        ViewStudents(studentHashMap);
                        break;

                    case 2:
                        ViewCourse(courseHashMap);
                        break;

                    case 3:
                        sortedStudentMap = sortStudents(studentHashMap);
                        ViewStudents(sortedStudentMap);
                        break;

                    case 4:
                        sortedCourseMap = sortCourses(courseHashMap);
                        ViewCourse(sortedCourseMap);
                        break;

                    case 5:
                        System.out.println("Program exited Successfuly");
                        break;

                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            }
            scanner.close();
        }

        public static void ViewCourse(Map<Integer,Course_OCP_bad> courseHashMap ){
            System.out.println("");
            System.out.println("The Courses are:");
            for(int i=0;i<courseHashMap.size();i++ ){
                System.out.println("");
                System.out.println("Course_OCP_bad :- "+ (i+1) );
                System.out.println("Course_OCP_bad Name :-"+courseHashMap.get(i).getCourseName());
                System.out.println("Course_OCP_bad ID :-"+courseHashMap.get(i).getCourse_ID());
                System.out.println("Credits :-"+courseHashMap.get(i).getCredits());
            }
        }

    public static void ViewStudents(Map<Integer,Student_bad_OCP> studentHashMap){
        System.out.println("");
        System.out.println("Students List:");
        for(int i=0;i<studentHashMap.size();i++ ){
            System.out.println("");
            System.out.println("Student_bad_OCP No. :- "+(i+1) );
            System.out.println("Student_bad_OCP Name :-"+studentHashMap.get(i).getStudentName());
            System.out.println("Student_bad_OCP ID :-"+studentHashMap.get(i).getStudentId());
            System.out.println("Batch year :-"+studentHashMap.get(i).getBatchYear());
        }
    }

    public static TreeMap<Integer,Course_OCP_bad> sortCourses(Map<Integer,Course_OCP_bad> courseOcpBadMap){
        return new TreeMap<>(courseOcpBadMap);
    }

    public static TreeMap<Integer,Student_bad_OCP> sortStudents(Map<Integer,Student_bad_OCP> studentBadOcpMap){
            return new TreeMap<>(studentBadOcpMap);
    }
}