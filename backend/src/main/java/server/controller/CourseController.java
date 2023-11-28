package server.controller;

import java.util.Optional;

import org.jooq.exception.NoDataFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import server.data.Course;
import server.repository.course.CourseRepository;

@RestController
@RequestMapping(path = "/api/v1/courses")
public class CourseController {
  @Autowired
  private CourseRepository courseRepository;

  @GetMapping("/all")
  public @ResponseBody Iterable<Course> getAllCourses() {
    return courseRepository.findAll();
  }

  @GetMapping("/{id}")
  public @ResponseBody Course getCourseById(@PathVariable Long id) {
    Optional<Course> course = courseRepository.findById(id);

    if (course.isPresent()) {
      return course.get();
    } else {
      throw new NoDataFoundException();
    }
  }
}
