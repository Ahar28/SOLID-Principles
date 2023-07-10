package org.example.Solid.good.s;

import java.util.ArrayList;
import java.util.List;

public class CourseData {

    public static List<Course> courseList;
    public static List<Course> getCourseList() {
        return courseList;
    }

    public CourseData() {
        courseList = new ArrayList<>();
        initializeCourseList();
    }

    private void initializeCourseList() {
        Course course1 = new Course(1, "asdc", 3);
        Course course2 = new Course(2, "data", 2);
        Course course3 = new Course(3, "ux", 1);
        courseList.add(course1);
        courseList.add(course2);
        courseList.add(course3);
    }

    public boolean isPresent(int courseID){
    for (int i=0;i<courseList.size();i++){
        if (courseList.get(i).getCourse_ID()==courseID){
            return true;
        }
    }
    return false;
    }

    public int findbyID(int courseid){
        for (int i = 0; i < courseList.size() ; i++) {
            if(courseList.get(i).getCourse_ID()==courseid){
                return i;
            }
        }
        return 0;
    }


    public void addCourse(Course course){
        courseList.add(course);
    }

    public static void updateCourse(int courseid,String newcoursename, int credits){
        courseList.get(courseid).setCourseName(newcoursename);
        courseList.get(courseid).setCredits(credits);
    }

    public void deleteCourse(int index) {
        courseList.remove(index);
    }
}
