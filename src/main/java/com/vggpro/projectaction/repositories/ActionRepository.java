package com.vggpro.projectaction.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vggpro.projectaction.entities.Action;
import com.vggpro.projectaction.entities.Project;

@Repository("ActionRepository")
public interface ActionRepository extends CrudRepository<Action, Integer>{

	@Query(value = "SELECT * FROM actions AS a WHERE project_id=:project_id", nativeQuery= true)
	List<Action> getSetOfActionsForAProject(@Param("project_id") int project_id);
	
}
