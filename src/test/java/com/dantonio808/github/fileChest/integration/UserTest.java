package com.dantonio808.github.fileChest.integration;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dantonio808.github.fileChest.config.TestEnvironment;
import com.github.dantonio808.fileChest.api.interfaces.AuthoritiesService;
import com.github.dantonio808.fileChest.api.interfaces.UserService;
import com.github.dantonio808.fileChest.api.model.User;
import com.github.dantonio808.fileChest.api.model.security.Authorities;
import com.github.dantonio808.fileChest.api.model.security.UserAuthorithies;

/**
 * Faz os testes de integracao relativos a classe {@link User}.
 * 
 * @author Diego
 *
 */
public class UserTest extends TestEnvironment {
	@Autowired
	private UserService service;
	
	@Autowired
	private AuthoritiesService authService;

	public UserTest() {
		super();
	}

	@Test
	public void testeUm() {
		this.prepareTest();
		UserAuthorithies authorities = new UserAuthorithies(new Long(1), Authorities.USER_ADMIN.getDescription(), null);
		List<UserAuthorithies> authoritiesLst = new ArrayList<UserAuthorithies>();
		authoritiesLst.add(authorities);

		User user = new User(new Long(0), "issoEhUm", "issoEhUm", authoritiesLst);

		this.service.addUser(user);

		Assert.assertNotNull(this.service.findById(new Long(1)));
	}
	
	//TODO: Rever isso
	private void prepareTest() {
		UserAuthorithies authority = new UserAuthorithies(new Long(1), Authorities.USER_ADMIN.getDescription(), null);
		this.authService.addUserAuthority(authority);
		
	}
}
