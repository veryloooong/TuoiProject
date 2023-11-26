package server.repository.project;

import org.springframework.data.repository.CrudRepository;

import server.data.Project;

public interface ProjectRepository extends CrudRepository<Project, Long> {
}
