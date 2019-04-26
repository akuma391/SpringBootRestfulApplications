package com.people.management.app.service;

//import java.awt.print.Pageable;
import java.util.List;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.people.management.app.dao.PeopleManagementDao;
import com.people.management.app.entities.People;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<People> findByLastNameOrFirstName(String lastName, String firstName) {
		
		return peopleManagementDao.findByLastNameOrFirstName(lastName, firstName);
	}

}
