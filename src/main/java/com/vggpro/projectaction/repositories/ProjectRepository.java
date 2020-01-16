package com.vggpro.projectaction.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vggpro.projectaction.entities.Project;


@Repository("ProjectRepository")
public interface ProjectRepository extends CrudRepository<Project, Integer>{

	@Query(value = "SELECT * FROM projects AS p WHERE id=:project_id", nativeQuery=true)
	public Project getOneProject(@Param("project_id") int project_id);
}
