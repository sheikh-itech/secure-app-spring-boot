package com.module.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.module.beans.User;
import com.module.repositories.AuthRepository;

@Service
public class UserDetailService implements UserDetailsService {

	@Autowired
	private AuthRepository authRepository;
	
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user = authRepository.findByUser(username);
	
		if(null==user)
			throw new UsernameNotFoundException("User not found"+username);
		
		return user;
	}
}
