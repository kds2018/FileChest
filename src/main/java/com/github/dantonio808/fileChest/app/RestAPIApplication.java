package com.github.dantonio808.fileChest.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@EnableAutoConfiguration
@ComponentScan("com.github.dantonio808.fileChest.api")
public class RestAPIApplication {
	
	/**
	 * Executa a aplicacao
	 * @param args argumentos
	 */
	public static void main(String[] args) {
		SpringApplication.run(RestAPIApplication.class, args);
	}

}
