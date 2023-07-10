package org.example.Solid.good.s;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CourseManager courseManager = new CourseManager();

        int choice;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println();
            System.out.println("Welcome");
            System.out.println("1. View All Courses");
            System.out.println("2. Add Course_OCP_bad");
            System.out.println("3. Update Course_OCP_bad");
            System.out.println("4. Delete Course_OCP_bad");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    courseManager.displayCourses();
                    break;

                case 2:
                    scanner.nextLine();
                    System.out.print("Enter course code: ");
                    int courseCode = scanner.nextInt();

                    System.out.print("Enter course name: ");
                    scanner.nextLine();
                    String courseName = scanner.nextLine();

                    System.out.print("Enter credits: ");
                    int credits = scanner.nextInt();

                    Course course = new Course(courseCode,courseName,credits);
                    courseManager.addCourse(course);

                    break;

                case 3:
                    scanner.nextLine();
                    System.out.print("Enter course ID to update: ");
                    int courseid = scanner.nextInt();

                    System.out.print("Enter new course name: ");
                    scanner.nextLine();
                    String newCourseName = scanner.nextLine();

                    System.out.print("Enter new credits: ");
                    int newCredits = scanner.nextInt();
                    courseManager.updateCourse(courseid,newCourseName,newCredits);
                    break;

                case 4:
                    scanner.nextLine();
                    System.out.print("Enter Course_OCP_bad code to delete: ");
                    int courseToDelete = scanner.nextInt();
                    courseManager.delete(courseToDelete);

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
}