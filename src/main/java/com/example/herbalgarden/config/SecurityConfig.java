package com.example.herbalgarden.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
	@Autowired
	private CustomUserDetailsService customUserDetailsService ;
	 
	@Bean
public BCryptPasswordEncoder passwordEncoder() {
	return new BCryptPasswordEncoder ();
}
	public UserDetailsService getDetailService() {
		return new CustomUserDetailsService();
	}
	
	
	@Bean
	public DaoAuthenticationProvider getAuthenticationProvider() {
		DaoAuthenticationProvider daoAuthenticationProvider=new DaoAuthenticationProvider();
		
		
//		daoAuthenticationProvider.setUserDetailsService(getDetailService());
//		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
//		return daoAuthenticationProvider;	
		
		daoAuthenticationProvider.setUserDetailsService(customUserDetailsService);
		daoAuthenticationProvider.setPasswordEncoder(passwordEncoder());
		return daoAuthenticationProvider;
	}
	 @Bean
   public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
         http
         .csrf(csrf -> csrf.disable())  // Re-enable if necessary
         .authorizeHttpRequests(requests -> requests
             .requestMatchers("/register", "/login").permitAll()
             .requestMatchers("/user/**").authenticated()
             .anyRequest().permitAll())
         .formLogin(login -> login
             .loginPage("/login")
             .loginProcessingUrl("/userlogin")
             .usernameParameter("email")
             .passwordParameter("password")
             .defaultSuccessUrl("/user/home", true)  // Redirect after successful login
             .failureUrl("/login?error")
             .permitAll());
          
       
		 
		 return http.build();
	
	 }
	
	
	
}
