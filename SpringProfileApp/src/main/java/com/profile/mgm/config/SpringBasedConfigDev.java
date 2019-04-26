package com.profile.mgm.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("dev")
public class SpringBasedConfigDev implements SpringBasedConfig {

	@Override
	public void setup() {
		System.out.println("=============================================");
		System.out.println("Envirenment is dev");
		
	}

}
