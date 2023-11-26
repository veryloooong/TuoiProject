package server.repository.course;

import org.springframework.stereotype.Repository;
import server.data.Course;

@Repository
public class CourseRepositoryImpl implements CourseRepository {
  // create
  public Course createCourse(String title, String description, long price) {
    Course newCourse = new Course(title, description, price);

    return newCourse;
  }

  // read
  public Course getCourseById(long id) {
    return null;
  }

  // update
  public void updateCourseTitle(String title) {
    return;
  }

  public void updateCourseDescription(String description) {
    return;
  }

  public void updateCoursePrice(long price) {
    return;
  }

  // delete
  public void deleteCourse(long id) {
    return;
  }
}
