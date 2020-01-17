package com.vggpro.projectaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vggpro.projectaction.repositories.ActionRepository;
import com.vggpro.projectaction.repositories.ProjectRepository;
import com.vggpro.projectaction.entities.Action;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

@RestController
@CrossOrigin(origins = "*")
public class ActionController {

	@Autowired
	ActionRepository ActRepo;
	@Autowired
	ProjectRepository ProRepo;
	
	@RequestMapping("/action/all")
	@ResponseBody
	public List<Action> listActions() {
		return (List<Action>) ActRepo.findAll();
	}
	
	
	@PostMapping("/action/create/{project_id}")
	public ResponseEntity<Action> createAnActionForAProject(@PathVariable("project_id") int project_id, @Valid  @RequestBody Action action) {
		
			if( ProRepo.existsById(project_id) || project_id > 0) {
				action.setProject_id(project_id);
				ActRepo.save(action);
				return new ResponseEntity<Action>(action, HttpStatus.OK);

			}else {
				return new ResponseEntity<Action>(action, HttpStatus.FORBIDDEN);
			}
		
	}
	
	
}
