package com.dantonio808.github.fileChest.integration;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.dantonio808.github.fileChest.config.TestEnvironment;
import com.github.dantonio808.fileChest.api.interfaces.UserService;
import com.github.dantonio808.fileChest.api.model.User;


/**
 *  Faz os testes de integracao relativos a classe {@link User}.
 *  
 * @author Diego
 *
 */
public class UserTest extends TestEnvironment{
	@Autowired
	private UserService service;
	
	@Test
	public void testeUm() {
		User user = new User(new Long(0), "issoEhUm", "issoEhUm");

		this.service.addUser(user);

		Assert.assertNotNull(this.service.findById(new Long(1)));
	}
}
