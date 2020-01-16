package com.vggpro.projectaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vggpro.projectaction.repositories.ProjectRepository;
import com.vggpro.projectaction.entities.Project;



@RestController
public class ProjectController {
	
	@Autowired
	ProjectRepository ProRepo;
	
	@RequestMapping("/project/all")
	public Iterable<Project> showAllProjects() {

		return ProRepo.findAll();
	}
	
	@RequestMapping("/projects/create")
	public String createAProject() {
		return "FF";
	}
	
	@RequestMapping("/project/view/{project_id}")
	public String showProject(@PathVariable("project_id") int project_id) {
		return "FF";
	}
}
