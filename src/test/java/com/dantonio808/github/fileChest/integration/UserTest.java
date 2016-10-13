package com.dantonio808.github.fileChest.integration;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.dantonio808.fileChest.api.interfaces.UserService;
import com.github.dantonio808.fileChest.api.model.User;
import com.github.dantonio808.fileChest.app.RestAPIApplication;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes=RestAPIApplication.class)
@WebAppConfiguration
@IntegrationTest
public class UserTest {
	@Autowired
	private UserService service;
	
	@Test
	public void testeUm(){
		User user = new User(new Long(0), "issoEhUm", "issoEhUm");
		
		this.service.addUser(user);
		
		Assert.assertNotNull(this.service.findById(new Long(1)));
	}

}
