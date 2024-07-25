package com.krishan.courseRestAPI.controllers;

import com.krishan.courseRestAPI.entity.Course;
import com.krishan.courseRestAPI.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class CourseController {

    @Autowired
    private CourseService courseService;

    // Get all courses
    @GetMapping("/courses")
    public List<Course> getAllCourses() {
        return courseService.getAllCourses();
    }

    // Get course by ID
    @GetMapping("/courses/{courseId}")
    public Course getCourseById(@PathVariable long courseId) {
        return courseService.getCourseById(courseId);
    }

    // Add a new course
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course) {
        return courseService.addCourse(course);
    }

    // Delete a course
    @DeleteMapping("/courses/{courseId}")
    public Course deleteCourse(@PathVariable long courseId) {
        return courseService.deleteCourse(courseId);
    }

    // Update a course
    @PutMapping("/courses/{courseId}")
    public Course updateCourse(@PathVariable long courseId, @RequestBody Course updatedCourse) {
        return courseService.updateCourse(courseId, updatedCourse);
    }

    @PatchMapping("/courses/{courseId}")
    public Course updateCourseDesc(@PathVariable long courseId, @RequestBody String courseDesc){
        return courseService.updateCourseDesc(courseId, courseDesc);
    }
}
