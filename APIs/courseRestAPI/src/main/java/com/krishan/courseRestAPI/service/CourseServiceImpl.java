package com.krishan.courseRestAPI.service;

import com.krishan.courseRestAPI.entity.Course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    private List<Course> ls;

    public CourseServiceImpl() {
        this.ls = new ArrayList<>();
        ls.add(new Course(1, "Java", "Full Stack Java Course."));
        ls.add(new Course(2, "Python", "Full Stack Python Course."));
    }

    @Override
    public List<Course> getAllCourses() {
        return ls;
    }

    @Override
    public Course getCourseById(long courseId) {
        for (Course course : ls) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }

    @Override
    public Course addCourse(Course course) {
        ls.add(course);
        return course;
    }

    @Override
    public Course updateCourse(long courseId, Course updatedCourse) {
        for (Course course : ls) {
            if (course.getCourseId() == courseId) {
                course.setCourseName(updatedCourse.getCourseName());
                course.setCourseDesc(updatedCourse.getCourseDesc());
                return course;
            }
        }
        return null;
    }

    @Override
    public Course deleteCourse(long courseId) {
        Course courseToRemove = null;
        for (Course course : ls) {
            if (course.getCourseId() == courseId) {
                courseToRemove = course;
                break;
            }
        }
        if (courseToRemove != null) {
            ls.remove(courseToRemove);
        }
        return courseToRemove;
    }

    @Override
    public Course updateCourseDesc(long courseId, String desc) {
        for(Course course : ls){
            if(course.getCourseId() == courseId){
                course.setCourseDesc(desc);
                return course;
            }
        }
        return null;
    }
}
