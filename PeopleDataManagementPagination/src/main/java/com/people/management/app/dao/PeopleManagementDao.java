package com.people.management.app.dao;


import java.util.List;

import org.springframework.data.domain.Pageable;

import org.springframework.data.repository.CrudRepository;

import com.people.management.app.entities.People;

public interface PeopleManagementDao extends CrudRepository<People, Integer> {

	

	List<People> findByLastName(String lastName, Pageable pegeable );
	
}
 