package server.repository.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.data.Project;
import server.data.Project;

import java.util.List;

@Repository
public interface ProjectRepository extends JpaRepository<Project,Long> {
    public Project findProjectById(long ProjectId);
    public Project save();
    public Project update();
    public Project delete();
    public List<Project> findAll();

}
