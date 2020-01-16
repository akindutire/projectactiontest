package com.vggpro.projectaction.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.vggpro.projectaction.entities.Action;

@Repository("ActionRepository")
public interface ActionRepository extends CrudRepository<Action, Integer>{

}
