 package com.example.herbalgarden.service;

import com.example.herbalgarden.Entity.User;
import com.example.herbalgarden.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserRepository userRepository;
    @Autowired
	private BCryptPasswordEncoder passwordEncoder;

	@Override
	public User saveUser(User user) {
		
	String password=	passwordEncoder.encode(user.getPassword());
	user.setPassword(password);
	user.setRole("ROLE_USER");
	user.setUsername(user.getUsername());
		User newuser=userRepository.save(user);
		return newuser;
	}

	
    
    
    
    
    
    
    
 

	

}
