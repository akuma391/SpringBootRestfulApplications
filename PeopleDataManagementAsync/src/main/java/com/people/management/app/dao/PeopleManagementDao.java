package com.people.management.app.dao;


import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.scheduling.annotation.Async;

import com.people.management.app.entities.People;

public interface PeopleManagementDao extends CrudRepository<People, Integer> {

	

	List<People> findByLastName(String lastName, Pageable pegeable );

	@Async
	CompletableFuture<People> findByEmail(String email);
	
}
 