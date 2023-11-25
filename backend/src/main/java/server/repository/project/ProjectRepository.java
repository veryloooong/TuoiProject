package server.repository.project;

import java.util.Date;
import server.data.Project;

public interface ProjectRepository {
  // create
  Project createProject(String title, String description, Date startDate, Date endDate, long goalFund);

  // read
  Project findProjectById(long id);

  // update
  void updateProjectTitle(String title);

  void updateProjectDescription(String description);

  void updateProjectEndDate(Date endDate);

  void updateProjectCurrentFund(long currentFund);

  // delete
  void deleteProject(long id);
}
