package org.courseapi.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAllCourse(String topicId) {
        List<Course> topicList = new ArrayList<>();
        return courseRepository.findByTopicId(topicId);
    }
    public List<Course> getAllCourseByTopicName(String topicName) {
        List<Course> topicList = new ArrayList<>();
        return courseRepository.findByTopicName(topicName);
    }
    public List<Course> getAllCourse() {
        List<Course> courseList = new ArrayList<>();
        courseRepository.findAll().forEach(x -> courseList.add(x));
        return courseList;
    }
    public Course getCourseById(String id) {
        return this.courseRepository.findById(id).get();
    }

    public void addCourse(Course course) {
        this.courseRepository.save(course);
    }

    public  void updateCourse(Course course) {
        this.courseRepository.save(course);
    }

    public void deleteCourseById(String id) {
        this.courseRepository.deleteById(id);
    }

    public List<Course> getCourseByName(String name) {
        return this.courseRepository.findByName(name);
    }
}
