package com.people.management.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.people.management.app.dao.PeopleManagementDao;
import com.people.management.app.entities.People;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public List<People> findInfoByLastName(String LastName) {
		
		return peopleManagementDao.findByLastName(LastName);
	}

	
}
