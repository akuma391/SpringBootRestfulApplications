package com.people.management.app;

import java.util.Arrays;
import java.util.*;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.scheduling.annotation.EnableAsync;

import com.people.management.app.entities.People;
import com.people.management.app.service.PeopleManagementService;

@SpringBootApplication
@EnableAsync   // to enable Async
public class PeopleDataManagementAppApplication implements CommandLineRunner{

	@Autowired
	private PeopleManagementService peopleManagementService;
	
	public static void main(String[] args) {
		SpringApplication.run(PeopleDataManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		List<People> listP =  peopleManagementService.findByLastNameOrFirstName("Daniel","Harry");
		listP.forEach(System.out::println);
	

	}
}