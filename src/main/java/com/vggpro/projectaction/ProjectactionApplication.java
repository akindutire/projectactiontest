package com.vggpro.projectaction;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import com.vggpro.projectaction.repositories.ProjectRepository;


@SpringBootApplication
@ComponentScan
public class ProjectactionApplication implements CommandLineRunner{

	
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectactionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}

}






