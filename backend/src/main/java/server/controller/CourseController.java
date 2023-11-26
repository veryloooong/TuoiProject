package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import server.data.Course;
import server.repository.course.CourseRepository;

@Controller
@RequestMapping(path = "/courses")
public class CourseController {
  @Autowired
  private CourseRepository courseRepository;

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<Course> getAllCourses() {
    return courseRepository.findAll();
  }
}
