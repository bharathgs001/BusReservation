package com.example.spring.BusReservation.configure;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

	@Bean SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)
	throws Exception
	{
		
		http.authorizeRequests().requestMatchers("/login").authenticated()
		.anyRequest().permitAll();
		http.formLogin();
		http.httpBasic();
		http.csrf().disable();
		return http.build();
}
	@Bean
	public PasswordEncoder passwordEncoder1()
	{
		return NoOpPasswordEncoder.getInstance();
	}

}
