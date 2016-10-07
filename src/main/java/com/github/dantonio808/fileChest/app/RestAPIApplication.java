package com.github.dantonio808.fileChest.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

import com.github.dantonio808.fileChest.api.interfaces.UserService;
import com.github.dantonio808.fileChest.api.model.User;

@EnableAutoConfiguration
@ComponentScan("com.github.dantonio808.fileChest.api")
public class RestAPIApplication implements CommandLineRunner{
	@Autowired
	private UserService service;
	
	/**
	 * Executa a aplicacao
	 * @param args argumentos
	 */
	public static void main(String[] args) {
		SpringApplication.run(RestAPIApplication.class, args);
	}

	@Override
	public void run(String... arg0) throws Exception {
		User usuario = new User();
		
		usuario.setLogin("teste1");
		usuario.setPasswd("teste1");
		
		this.service.addUser(usuario);
		usuario = new User();
		usuario.setLogin("teste4");
		usuario.setPasswd("teste4");
		
		this.service.addUser(usuario);
		usuario = new User();
		usuario.setLogin("teste5");
		usuario.setPasswd("teste5");
		
		this.service.addUser(usuario);
		
		System.out.println("Lista de Usuarios!");
		this.service.findAll().forEach(user ->{
			System.out.println("Usuario:");
			System.err.println("Nome: " + user.getLogin());
			System.err.println("Nome: " + user.getPasswd());
		});
	}
}
