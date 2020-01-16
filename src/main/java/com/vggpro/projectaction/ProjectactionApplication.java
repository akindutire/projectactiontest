package com.vggpro.projectaction;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class ProjectactionApplication implements CommandLineRunner{

	
	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ProjectactionApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Test");
	}

}






