package server.repository.course;

import org.springframework.data.repository.CrudRepository;

import server.data.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {

}
