package com.vggpro.projectaction;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;



@Component
public class Project {

	private int id;
	private String name;
	private String description;
	private boolean completed;
	
	private List<Project> ProjectAggs = new ArrayList<Project>();
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	
	public boolean addProject(int id, String name, String description, boolean completed) {

		this.setId(id);
		this.setName(name);
		this.setDescription(description);
		this.setCompleted(completed);
		
		this.ProjectAggs.add(this);
		
		return true;
	}
	
	
}
