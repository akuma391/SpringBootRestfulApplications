package com.people.management.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.people.management.app.entities.People;

public interface PeopleManagementDao extends CrudRepository<People, Integer> {

	// @Query Method has precedence over @NamedQuery for same method
	//@Query(value="SELECT p FROM People p WHERE p.lastName=?1")
	@Query(value="SELECT *FROM person_infor WHERE last_name=?1",nativeQuery=true)
	List<People> PeopleInfofindByLastName(String lastName);
	
	//@Query(value="SELECT p FROM People p WHERE p.firstName=?1 AND email=?2")
	@Query(value="SELECT *FROM person_infor WHERE first_name=?1 AND email=?2",nativeQuery=true)
	List<People> PeoplefindByFirstNameAndEmail(String firstName,String email);
	
}
