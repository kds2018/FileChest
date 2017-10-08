package com.github.dantonio808.fileChest.api.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.SequenceGenerator;

import com.github.dantonio808.fileChest.api.model.security.UserAuthorithies;

@Entity
public class User {
	@Id
	@Column(name = "ID")
	@SequenceGenerator(name = "USER_ID", sequenceName = "PK_USER", initialValue = 0, allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_ID")
	private Long id;

	@Column(name = "LOGIN", nullable = false, length = 20)
	private String login;

	@Column(name = "PASSWD", nullable = false, length = 60)
	private String passwd;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "USER_AUTHORITIES", joinColumns = {
			@JoinColumn(name = "USER_ID", referencedColumnName = "ID") }, inverseJoinColumns = {
					@JoinColumn(name = "AUTHORITY_ID", referencedColumnName = "ID") })
	private List<UserAuthorithies> authorities;

	public User() {
		super();
	}

	public User(Long id, String login, String passwd, List<UserAuthorithies> authorities) {
		super();
		this.id = id;
		this.login = login;
		this.passwd = passwd;
		this.authorities = authorities;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPasswd() {
		return passwd;
	}

	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

	public List<UserAuthorithies> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(List<UserAuthorithies> authorities) {
		this.authorities = authorities;
	}
}