package server.repository.course;

import server.data.Course;

public interface CourseRepository {
  // create
  Course createCourse(String title, String description, long price);

  // read
  Course getCourseById(long id);

  // update
  void updateCourseTitle(String title);

  void updateCourseDescription(String description);

  void updateCoursePrice(long price);

  // delete
  void deleteCourse(long id);
}
