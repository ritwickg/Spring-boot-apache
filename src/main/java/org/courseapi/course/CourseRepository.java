package org.courseapi.course;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends CrudRepository<Course, String> {

    public List<Course> findByName(String name);

    public List<Course> findByDescription(String description);

    public List<Course> findByTopicId(String topicId);
    public List<Course> findByTopicName(String topicName);
}
