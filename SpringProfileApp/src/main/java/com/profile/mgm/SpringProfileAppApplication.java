package com.profile.mgm;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.profile.mgm.config.SpringBasedConfig;

@SpringBootApplication
public class SpringProfileAppApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;
	
		@Autowired
		private SpringBasedConfig springBasedConfig;
		
	public static void main(String[] args)  {
		SpringApplication.run(SpringProfileAppApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		System.out.println("DataSource = "+dataSource);
		
		System.out.println("=============================");
		springBasedConfig.setup();
		
	}

	
}
