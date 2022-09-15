package com.citiustech.practice.model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class User implements UserDetails{
		/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private int id;
		private String email;
		private String password;
		private String contact;
		private String gender;
		private String role;
		
		
		@Override
		public String getUsername() {			
			return email;
		}
		@Override
		public boolean isAccountNonExpired() {		
			return true;
		}
		@Override
		public boolean isAccountNonLocked() {
			return true;
		}
		@Override
		public boolean isCredentialsNonExpired() {
			return true;
		}
		@Override
		public boolean isEnabled() {	
			return true;
		}
		
		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			
			List<GrantedAuthority> authorities = new ArrayList<>();
			authorities.add(new SimpleGrantedAuthority("ROLE_" + role));
			return authorities;
		}
		@Override
		public String getPassword() {		
			return password;
		}

}
