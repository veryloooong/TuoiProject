package server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import server.data.Project;
import server.repository.project.ProjectRepository;

@Controller
@RequestMapping(path = "/projects")
public class ProjectController {
  @Autowired
  private ProjectRepository projectRepository;

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<Project> getAllProjects() {
    return projectRepository.findAll();
  }
}
