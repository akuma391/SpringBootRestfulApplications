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
		
		
		getPersonsInfoByLastName();


	
	}

	private void getPersonsInfoByLastName() {
		List<People> personList = peopleManagementService.getPersonsInfoByLastName("Nicolas");
	personList.forEach(System.out::println);
	}

}
