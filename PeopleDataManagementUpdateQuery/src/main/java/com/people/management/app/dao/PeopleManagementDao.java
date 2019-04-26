package com.people.management.app.dao;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.people.management.app.entities.People;

public interface PeopleManagementDao extends CrudRepository<People, Integer> {

	@Transactional
	//Transactional is used for insert, update and delete
	@Modifying(clearAutomatically=true)
	
//	@Query(value="update People set email=:newEmail where id=:personId") //using SQL
	
	@Query("update People p set p.email=:newEmail where p.id=:personId")
	void updateEmailById(@Param("personId")int id,@Param("newEmail") String newEmail);

	
	
}
 