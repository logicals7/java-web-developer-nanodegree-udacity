package com.krishan.courseRestAPI.entity;

public class Course {

    private long courseId;
    private String courseName;
    private String courseDesc;

    public Course() {
        // Default constructor
    }

    public Course(long courseId, String courseName, String courseDesc) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseDesc = courseDesc;
    }

    public long getCourseId() {
        return courseId;
    }

    public void setCourseId(long courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseDesc() {
        return courseDesc;
    }

    public void setCourseDesc(String courseDesc) {
        this.courseDesc = courseDesc;
    }
}
