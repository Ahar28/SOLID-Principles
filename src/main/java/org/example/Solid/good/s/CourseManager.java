package org.example.Solid.good.s;

import java.util.List;

public class CourseManager {
    static CourseData courseData = new CourseData();

    public void displayCourses(){
        System.out.println("");
        System.out.println("The Courses available are:");
        for(int i=0;i<courseData.getCourseList().size();i++ ){
            System.out.println();
            System.out.println("Course :- "+i );
            System.out.println("Course Name :-"+courseData.getCourseList().get(i).getCourseName());
            System.out.println("Course ID :-"+courseData.getCourseList().get(i).getCourse_ID());
            System.out.println("Credits :-"+courseData.getCourseList().get(i).getCredits());
        }
    }

    public static void addCourse(Course course){
        if (courseData.isPresent(course.getCourse_ID())){
            System.out.println("Course aleady present");
        }
        else{
            courseData.addCourse(course);
            System.out.println("Course added successfully");
        }
    }
    public static void updateCourse(int courseid,String newcoursename,int credits){
        if(courseData.isPresent(courseid)){
            int index = courseData.findbyID(courseid);
            CourseData.updateCourse(courseid,newcoursename,credits);
        }
    }

    public void delete(int courseToDelete) {
        if(courseData.isPresent(courseToDelete)){
            courseData.deleteCourse(courseData.findbyID(courseToDelete));
        }
        else {
            System.out.println("Course with this course ID not present");
        }
    }
}
