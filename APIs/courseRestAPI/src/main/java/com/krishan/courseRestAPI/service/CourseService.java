package com.krishan.courseRestAPI.service;

import com.krishan.courseRestAPI.entity.Course;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CourseService {
    List<Course> getAllCourses();
    Course getCourseById(long courseId);
    Course addCourse(Course course);
    Course updateCourse(long courseId, Course updatedCourse);
    Course deleteCourse(long courseId);
    Course updateCourseDesc(long courseId, String desc);
}
