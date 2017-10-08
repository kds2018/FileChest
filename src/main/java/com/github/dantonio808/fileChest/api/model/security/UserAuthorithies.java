package com.github.dantonio808.fileChest.api.model.security;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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
	@Enumerated(EnumType.STRING)
	private Authorities role;
	
	@ManyToMany(mappedBy = "authorities",fetch = FetchType.LAZY)
	Set<User> users;
	
	public UserAuthorithies() {
		super();
	}

	public UserAuthorithies(Long id, Authorities authority, Set<User> users) {
		super();
		this.id = id;
		this.role = authority;
		this.users = users;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;
	}
	
	public Authorities getRole() {
		return role;
	}

	public void setRole(Authorities role) {
		this.role = role;
	}
}
