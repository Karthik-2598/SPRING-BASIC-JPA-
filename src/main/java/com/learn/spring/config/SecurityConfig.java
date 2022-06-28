
package com.learn.spring.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Autowired
	DataSource datasource;
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth)
	{
		try
		{
			PasswordEncoder encoder=PasswordEncoderFactories.createDelegatingPasswordEncoder();
			auth.jdbcAuthentication().dataSource(datasource).withDefaultSchema().withUser("vijay").password(encoder.encode("vijay")).roles("admin")
			.and().withUser("rakesh").password(encoder.encode("rakesh")).roles("manger");
			
		}
		catch(Exception ex)
		{
			System.out.println("Error message"+ex.getMessage());
			
		}
	}
	
	@Override
	public void configure(WebSecurity web)
	{
		try
		{
			web.ignoring().antMatchers("/h2-console/**");
		}
		catch(Exception ex)
		{
			System.out.println("Error "+ex.getMessage());
		}
	}
//	@Bean 
//	PasswordEncoder getPasswordEncoder()
//	{
//		return NoOpPasswordEncoder.getInstance();
//		
//	}
}
