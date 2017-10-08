package com.github.dantonio808.fileChest.api.interfaces;

import org.springframework.data.repository.CrudRepository;

import com.github.dantonio808.fileChest.api.model.security.UserAuthorithies;

public interface AuthoritiesRepository extends CrudRepository<UserAuthorithies, Long>{

}
