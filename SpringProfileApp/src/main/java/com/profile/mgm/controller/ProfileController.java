package com.profile.mgm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

	@Value(value="${welcome.message}")
	private String message;
	
	@GetMapping("/")
	public String hello() {
		return message;
	}
}
