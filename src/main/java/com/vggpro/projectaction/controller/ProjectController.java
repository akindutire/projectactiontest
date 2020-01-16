package com.vggpro.projectaction.controller;

import java.util.ArrayList;
import java.util.List;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vggpro.projectaction.repositories.ActionRepository;
import com.vggpro.projectaction.repositories.ProjectRepository;
import com.vggpro.projectaction.dto.ProjectActionDetail;
import com.vggpro.projectaction.entities.*;



@RestController
public class ProjectController {
	
	
	@Autowired
	ProjectRepository ProRepo;
	@Autowired
	ActionRepository ActRepo;
	@Autowired
	ProjectActionDetail ProDtl;
	
	@RequestMapping("/project/all")
	@ResponseBody
	public ResponseEntity<List<ProjectActionDetail>> showAllProjects() {
		
		List<ProjectActionDetail> ProDtlList = new ArrayList<ProjectActionDetail>();
		
		for(Project p: ProRepo.findAll()) {
			
			ProjectActionDetail PDtl = new ProjectActionDetail();
			
			PDtl.setId(p.getId());
			PDtl.setName(p.getName());
			PDtl.setDescription(p.getDescription());
			PDtl.setCompleted(p.isCompleted());
			
			List a = ActRepo.getSetOfActionsForAProject(p.getId());
			
			PDtl.setAction(a);
		
			
			ProDtlList.add(PDtl);
		}
		
		return new ResponseEntity<List<ProjectActionDetail>>(ProDtlList, HttpStatus.OK);
		
	}
	
	@RequestMapping("/project/action/{project_id}")
	@ResponseBody
	public List<Action> showActionOfAProject(@PathVariable("project_id") int project_id) {
		return ActRepo.getSetOfActionsForAProject(project_id);
	}
	
	@PostMapping("/project/create")
	@ResponseBody
	public Project createAProject(@Valid @RequestBody Project project) {
		ProRepo.save(project);
		return project;
	}
	
	@RequestMapping("/project/view/{project_id}")
	@ResponseBody
	public ResponseEntity<ProjectActionDetail> showAProjectDetail(@PathVariable("project_id") int project_id) {
		if( ProRepo.existsById(project_id) ) {
			
			Project p = ProRepo.getOneProject(project_id);
			
			ProDtl.setId(p.getId());
			ProDtl.setName(p.getName());
			ProDtl.setDescription(p.getDescription());
			ProDtl.setCompleted(p.isCompleted());
			
			List a = ActRepo.getSetOfActionsForAProject(project_id);
			
			ProDtl.setAction(a);
			
			return new ResponseEntity<ProjectActionDetail>(ProDtl, HttpStatus.OK);
				
		}else {
			return new ResponseEntity<ProjectActionDetail>(ProDtl, HttpStatus.BAD_REQUEST);
		}
		
		
	}
}
