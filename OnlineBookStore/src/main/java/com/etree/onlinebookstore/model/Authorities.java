package com.etree.onlinebookstore.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Authorities {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int authorityId;
	private String authorities;

	@OneToMany(mappedBy = "authorities")
	private List<User> users;

	public int getAuthorityId() {
		return authorityId;
	}

	public String getAuthorities() {
		return authorities;
	}

	public void setAuthorityId(int authorityId) {
		this.authorityId = authorityId;
	}

	public void setAuthorities(String authorities) {
		this.authorities = authorities;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

}
