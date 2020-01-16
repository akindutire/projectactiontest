package com.vggpro.projectaction;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ProjectactionApplication {

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProjectactionApplication.class, args);
	}

}






