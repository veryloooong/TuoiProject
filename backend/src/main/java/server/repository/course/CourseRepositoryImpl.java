package server.repository.course;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.data.pojo.Course;

import java.util.List;

@Repository
public interface CourseRepositoryImpl extends JpaRepository<Course,Long> {
  public Course findCourseById(long courseId);
  public Course findCourseByDescription(String description);
  public Course findCourseByTitle(String title);
  public Course save();
  public Course update();
  public Course delete();
  public List<Course> findAll();


}
