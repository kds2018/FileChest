package com.github.dantonio808.fileChest.api.interfaces;

import com.github.dantonio808.fileChest.api.model.security.UserAuthorithies;

public interface AuthoritiesService {

	public void addUserAuthority(UserAuthorithies authority);

	public Iterable<UserAuthorithies> findAll();

	public UserAuthorithies findById(Long id);
}
