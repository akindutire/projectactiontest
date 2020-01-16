package com.vggpro.projectaction.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vggpro.projectaction.entities.Project;


@Repository("ProjectRepository")
public interface ProjectRepository extends CrudRepository<Project, Integer>{

}
