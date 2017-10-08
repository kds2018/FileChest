package com.github.dantonio808.fileChest.api.model.security;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.github.dantonio808.fileChest.api.model.User;

/**
 * Essa classe representa as Permissoes do {@link User}.
 * 
 * @author Diego
 *
 */
@Entity
public class UserAuthorithies {
	@Id
	@SequenceGenerator(name = "AUTH_ID", sequenceName = "PK_AUTH", initialValue = 0, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "AUTH_ID")
	@Column(name = "ID")
	private Long id;

	@Column(name = "DESCRIPTION", nullable =false)
	private String description;
	
	@ManyToMany(mappedBy = "authorities",fetch = FetchType.LAZY)
	Set<User> users;
	
	public UserAuthorithies() {
		super();
	}

	public UserAuthorithies(Long id, String description, Set<User> users) {
		super();
		this.id = id;
		this.description = description;
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
}
