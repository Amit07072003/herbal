package com.example.herbalgarden.config;

import java.util.*;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.example.herbalgarden.Entity.User;

public class CustomUser implements UserDetails{
	private User user;

	public CustomUser(User user) {
		super();
		this.user = user;
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		SimpleGrantedAuthority authority=new 	SimpleGrantedAuthority(user.getRole());
		
		return Arrays.asList(authority);
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return user.getEmail();
	}
	
	
	
	 @Override
	    public boolean isAccountNonExpired() {
	        return true;  // Add logic for account expiration if needed
	    }

	    @Override
	    public boolean isAccountNonLocked() {
	        return true;  // Add logic for account lock if needed
	    }

	    @Override
	    public boolean isCredentialsNonExpired() {
	        return true;  // Add logic for credentials expiration if needed
	    }

	    @Override
	    public boolean isEnabled() {
	        return true;  // Add logic for enabling/disabling the user account if needed
	    }
	

}
