package com.profile.mgm.config;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("prod")
public class SpringBasedConfigProd implements SpringBasedConfig {

	@Override
	public void setup() {
		System.out.println("Envirenment is dev");

	}

}
