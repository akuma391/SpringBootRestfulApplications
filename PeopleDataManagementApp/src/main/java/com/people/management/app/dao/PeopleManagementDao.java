package com.people.management.app.dao;

import org.springframework.data.repository.CrudRepository;

import com.people.management.app.entities.People;

public interface PeopleManagementDao extends CrudRepository<People, Integer> {

}
