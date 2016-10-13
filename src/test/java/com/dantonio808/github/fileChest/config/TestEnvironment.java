package com.dantonio808.github.fileChest.config;

import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.github.dantonio808.fileChest.app.RestAPIApplication;

/**
 * Classe que configura todo o ambiente de testes para as sessoes de teste.
 * 
 * @author Diego
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = RestAPIApplication.class)
@WebAppConfiguration
@IntegrationTest
@ActiveProfiles("test")
public abstract class TestEnvironment {
}
