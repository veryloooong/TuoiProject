package server.repository.project;

import org.springframework.stereotype.Repository;
import java.util.Date;

import server.data.Project;

@Repository
public class ProjectRepositoryImpl implements ProjectRepository {
  @Override
  public Project createProject(String title, String description, Date startDate, Date endDate, long goalFund) {
    Project newProject = new Project(title, description, startDate, endDate, goalFund);

    return newProject;
  }

  // read
  public Project findProjectById(long id) {
    return null;
  }

  // update
  public void updateProjectTitle(String title) {
    return;
  }

  public void updateProjectDescription(String description) {
    return;
  }

  public void updateProjectEndDate(Date endDate) {
    return;
  }

  public void updateProjectCurrentFund(long currentFund) {
    return;
  }

  // delete
  public void deleteProject(long id) {
    return;
  }
}
