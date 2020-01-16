package com.vggpro.projectaction;

import org.springframework.stereotype.Component;


public class Project {

	private int id;
	private String name;
	private String description;
	private boolean completed;
	
	Project(int id, String name, String description, boolean completed){
		this.id = id;
		this.name = name;
		this.description = description;
		this.completed = completed;
	}
	
}
