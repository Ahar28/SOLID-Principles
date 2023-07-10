package org.example.Solid.bad.s;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseManagement {

     static List<Course> CourseList= new ArrayList<>();

     public static void initialCourseList(){
         Course course1 = new Course(1,"asdc",3);
         Course course2 = new Course(2,"data",3);
         Course course3 = new Course(3,"ux",3);
         CourseList.add(course1);
         CourseList.add(course2);
         CourseList.add(course3);
     }

    public static void main(String[] args) {

        initialCourseList();
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
                displayCourses();
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

                Course course = new Course(courseCode, courseName, credits);
                addCourse(course);
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
                updateCourse(courseid,newCourseName,newCredits);
                break;

            case 4:
                scanner.nextLine();
                System.out.print("Enter Course_OCP_bad code to delete: ");
                int courseToDelete = scanner.nextInt();

                deleteCourse(courseToDelete);
                System.out.println("Course_OCP_bad deleted successfully.");
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

    public  static void displayCourses(){
        System.out.println();
        System.out.println("The Courses available are:");
        for(int i=0;i<CourseList.size();i++ ){
            System.out.println();
            System.out.println("Course_OCP_bad :- "+(i+1) );
            System.out.println("Course_OCP_bad Name :-"+CourseList.get(i).getCourseName());
            System.out.println("Course_OCP_bad ID :-"+CourseList.get(i).getCourse_ID());
            System.out.println("Credits :-"+CourseList.get(i).getCredits());
        }
    }

    public  static String addCourse(Course course){
        if(CourseIsPresent(course.getCourse_ID())){
            return  "course already present";
        }
        else {
            CourseList.add(course);
            return "Course_OCP_bad added to the list";
        }
    }

    public static void deleteCourse(int coursetodelete){
        if(CourseIsPresent(coursetodelete)){
            CourseList.remove(findCoursebyID(coursetodelete));
        }
    }

    public static void updateCourse(int courseid,String coursename,int credits){

        if(CourseIsPresent(courseid)){
            Course course = findCoursebyID(courseid);
            course.setCourseName(coursename);
            course.setCredits(credits);
            System.out.println("Course_OCP_bad updated successfully");

        }

    }

    public  static boolean CourseIsPresent(int courseID){

        for (int i=0;i<CourseList.size();i++)
        {
            if(CourseList.get(i).getCourse_ID()==courseID)
            {
                return true;
            }
        }
        return false;
    }

    public static Course findCoursebyID(int courseid){
        for (int i=0;i<CourseList.size();i++)
        {
            if (CourseList.get(i).getCourse_ID()==courseid){
                return CourseList.get(i);
            }
        }
        return null;
    }

}
