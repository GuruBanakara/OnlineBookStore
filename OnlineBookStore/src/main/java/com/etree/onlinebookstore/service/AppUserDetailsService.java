package com.etree.onlinebookstore.service;

import java.util.Arrays;
import java.util.Collection;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.etree.onlinebookstore.dao.UserDao;
import com.etree.onlinebookstore.model.User;

@Service
public class AppUserDetailsService implements UserDetailsService {

	@Autowired
	private UserDao dao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		User user = dao.findByMailId(username);
		if (user == null)
			throw new UsernameNotFoundException("User Not found");
		return new UserDetailsImpl(user);
	}

	private class UserDetailsImpl implements UserDetails {
		private static final long serialVersionUID = 3229265798295233261L;
		private User user;

		public UserDetailsImpl(User user) {
			this.user = user;
		}

		@Override
		public Collection<? extends GrantedAuthority> getAuthorities() {
			return Arrays.stream(user.getAuthorities().getAuthorities().split(" ")).map(SimpleGrantedAuthority::new)
					.collect(Collectors.toList());
		}

		@Override
		public String getPassword() {
			return user.getPassword();
		}

		@Override
		public String getUsername() {
			return user.getMailId();
		}

		@Override
		public boolean isAccountNonExpired() {
			return user.isEnabled();
		}

		@Override
		public boolean isAccountNonLocked() {
			return user.isEnabled();
		}

		@Override
		public boolean isCredentialsNonExpired() {
			return user.isEnabled();
		}

		@Override
		public boolean isEnabled() {
			return user.isEnabled();
		}

	}

}
