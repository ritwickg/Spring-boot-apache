package org.courseapi.controller;

import org.courseapi.course.Course;
import org.courseapi.course.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    @GetMapping("/all/topic/{topicId}")
    public List<Course> getAllCourses(@PathVariable String topicId) {
        return this.courseService.getAllCourse(topicId);
    }
    @GetMapping("/all/topicName/{topicName}")
    public List<Course> getAllCoursesByTopicName(@PathVariable String topicName) {
        return this.courseService.getAllCourseByTopicName(topicName);
    }

    @GetMapping("/all")
    public List<Course> getAllCourses() {
        return this.courseService.getAllCourse();
    }

    @PostMapping("/add")
    public void addCourse(@RequestBody Course course) {
        this.courseService.addCourse(course);
    }

    @PostMapping("/update")
    public void updateCourse(@RequestBody Course course) {
        this.courseService.updateCourse(course);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteCourseById(@PathVariable String id) {
        this.courseService.deleteCourseById(id);
    }
}
