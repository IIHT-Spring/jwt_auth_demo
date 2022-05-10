package com.jwt.services;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class CustomUserDetailService implements UserDetailsService {

	@Override
	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
		if(userName.equals("admin")) 
		{
			return new User("admin", "admin123", new ArrayList<>());
		} else {
			throw new UsernameNotFoundException("User not found");
		}
		
	}

}
