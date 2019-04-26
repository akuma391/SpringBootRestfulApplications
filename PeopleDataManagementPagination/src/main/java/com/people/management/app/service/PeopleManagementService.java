package com.people.management.app.service;

//import java.awt.print.Pageable;
import java.util.List;	

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.people.management.app.dao.PeopleManagementDao;
import com.people.management.app.entities.People;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<People> findByLastName(String lastName, PageRequest pageRequest) {
		
		return peopleManagementDao.findByLastName(lastName, pageRequest);
	}

	

	

	
	

	
	

	

	

}
