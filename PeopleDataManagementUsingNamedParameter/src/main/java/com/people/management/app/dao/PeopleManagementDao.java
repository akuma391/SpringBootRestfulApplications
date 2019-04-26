package com.people.management.app.dao;


import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.people.management.app.entities.People;

public interface PeopleManagementDao extends CrudRepository<People, Integer> {

	

	List<People> findByLastName(String lastName, Pageable pegeable );
	
	@Query("select p from People p where p.firstName=:firstname or p.lastName=:lastname")
	List<People> findByLastNameOrFirstName(@Param("lastname")String lastName, @Param("firstname")String firstName);
   //  firstname and lastname are named parameter
	
	
}
 