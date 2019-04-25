package com.people.management.app;

import java.util.Arrays;
import java.util.*;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.people.management.app.entities.People;
import com.people.management.app.service.PeopleManagementService;

@SpringBootApplication
public class PeopleDataManagementAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleDataManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		createPerson();
		//createPersons();
		//getByIds();
		//deletePersonEntity();
		//deleteAllPersonEntity();
		
	//	updatePersonByEmail();
		
	}

	private void updatePersonByEmail() {
		
		peopleManagementService.updatePersonByEmail(1,"TN@123gmail.com");
	}

	private void deleteAllPersonEntity() {
		List<People> peopleList=new ArrayList();
		People people1= new People();
		people1.setId(14);
		peopleList.add(people1);
		People people2= new People();
		people2.setId(2);
		peopleList.add(people2);
		peopleManagementService.deleteAllPersonEntity(peopleList);
		
	}

	private void deletePersonEntity() {
		People people=new People();
		people.setId(15);
		peopleManagementService.deletePersonEntity(people);
		
	}

	private void getByIds() {
		List<Integer> ids=new ArrayList();
		ids.add(2);
		ids.add(14);
		ids.add(20);
		Iterable<People> peopleList= peopleManagementService.getByIds(ids);
		peopleList.forEach(System.out::println);
		
	}

	private void createPersons() {
		List<People> peopleList=Arrays.asList(new People("Harry","Daniel", new Date(), "hd@yahoo.com"), new People("Lory", "William", new Date(), "LW@yahoo.com"));
		Iterable<People> createPeople=	peopleManagementService.createPersons(peopleList);//creates people
		for(People p:createPeople) {
			System.out.println(p);
		}
	}

	private void createPerson() {
		People People1=new People("Harry", "Nicolas", new Date(), "TomN@123gmail.com");
		People peopledb=peopleManagementService.create(People1);
		//Putting the value in database
	}

}
