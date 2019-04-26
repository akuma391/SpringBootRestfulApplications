package com.infotech.book.ticket.app.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

	protected void configure(HttpSecurity http) throws Exception{
		
		/*http.authorizeRequests().antMatchers("/api/tickets/ticket/**").hasAnyRole("admin").and().formLogin();
		http.authorizeRequests().antMatchers("/api/tickets/admin/**").hasAnyRole("admin","user").and().formLogin()*/;
	
		//refactoring the code
	
		http.authorizeRequests().antMatchers("/api/tickets/ticket/**").hasAnyRole("admin").and()
		.authorizeRequests().antMatchers("/api/tickets/admin/**").hasAnyRole("admin","user").and().formLogin();
		
	}
	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception{
		/*auth.inMemoryAuthentication().withUser("avin").password("{noop}avi@123").roles("user");
        auth.inMemoryAuthentication().withUser("adi").password("{noop}adi@123").roles("user","admin");*/
	
		//refactoring the code
		
		auth.inMemoryAuthentication().withUser("avin").password("{noop}avi@123").roles("user").and()
		.withUser("adi").password("{noop}adi@123").roles("user","admin");
		
	
	}
	
}
