package com.people.management.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.people.management.app.dao.PeopleManagementDao;
import com.people.management.app.entities.People;

@Service
public class PeopleManagementService {
	
	@Autowired
	private PeopleManagementDao peopleManagementDao;

	public People create(People people1) {
		
		return peopleManagementDao.save(people1);
	}

	public Iterable<People> createPersons(List<People> peopleList) {
		
		Iterable<People> list=peopleManagementDao.saveAll(peopleList);
		 return list;
	}

	public Iterable<People> getByIds(List<Integer> ids) {
		
		return peopleManagementDao.findAllById(ids);
	}

	public void deletePersonEntity(People people) {
		peopleManagementDao.delete(people);
		
	}

	public void deleteAllPersonEntity(Iterable<People> peopleList) {
		
		peopleManagementDao.deleteAll(peopleList);
	}

	public void updatePersonByEmail(int id, String email) {
		People p1=peopleManagementDao.findById(id).get();
		if(id==p1.getId()){
			p1.setEmail(email);
		}
		peopleManagementDao.save(p1);
	}

	public List<People> findInfoByLastName(String lastName) {
		// TODO Auto-generated method stub
		return peopleManagementDao.PeopleInfofindByLastName(lastName);
	}

	public List<People> findInfoByLastNameAndEmail(String firstName, String email) {
		
		return peopleManagementDao.PeoplefindByFirstNameAndEmail(firstName, email);
	}

}
