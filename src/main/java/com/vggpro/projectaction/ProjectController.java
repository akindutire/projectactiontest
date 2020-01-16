package com.vggpro.projectaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	private Project[] pro;
	
	@Autowired
	private Project Pr;

	
	
	@RequestMapping("/project/all")
	public String showAllProjects() {
		return "FF";
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
