package com.vggpro.projectaction;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActionController {

	@RequestMapping("/action/all")
	public String listActions() {
		return "4";
	}
	
	@RequestMapping("/action/view/{project_id}")
	public String showActionOfAProject(@PathVariable("project_id") int project_id) {
		
		return "FF";
	}
	
	@RequestMapping("/action/create/{project_id}")
	public String createAnActionForAProject(@PathVariable("project_id") int project_id) {
		return "FF";
	}
	
	
}
