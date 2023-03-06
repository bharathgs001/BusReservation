package com.example.spring.BusReservation.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

public class MyUser implements UserDetails {

	private String name;
	private String password;
	private List<GrantedAuthority> authorities;
	
	public MyUser() {
		super();
	}
	
	public MyUser( List<Passenger> user) {
		super();
		this.name = name;
		this.password = password;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {

 		List<GrantedAuthority> authorities = new ArrayList<>();
		SimpleGrantedAuthority simpleGrantedAuthority = new SimpleGrantedAuthority("admin");
		authorities.add(simpleGrantedAuthority);
		return authorities;
		}
	@Override
	public String getPassword() {
		return password;
	}
	@Override
	public String getUsername() {
		return name;
	}
	@Override
	public boolean isAccountNonExpired() {
		return false;
	}
	@Override
	public boolean isAccountNonLocked() {
		return false;
	}
	@Override
	public boolean isCredentialsNonExpired() {
		return false;
	}
	@Override
	public boolean isEnabled() {
		return false;
	}
	

}

