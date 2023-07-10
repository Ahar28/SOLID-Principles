package org.example.Solid.bad.o;

public class Course_OCP_bad {
    private int course_ID;
    private String courseName;
    private int Credits;

    public Course_OCP_bad(int course_id, String coursename, int credits){
        this.course_ID=course_id;
        this.courseName=coursename;
        this.Credits=credits;
    }

    public int getCourse_ID() {
        return course_ID;
    }

    public void setCourse_ID(int course_ID) {
        this.course_ID = course_ID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCredits() {
        return Credits;
    }

    public void setCredits(int credits) {
        Credits = credits;
    }
}