package com.github.dantonio808.fileChest.api.model.security;

import java.util.Arrays;

/**
 * Representa as {@link Authorities} do FileChest
 * 
 * @author Diego
 *
 */
//TODO:Rever essa classe
public enum Authorities {
	USER_ADMIN(1, "ADMIN"), USER_DEFAULT(2, "User Default");

	private Integer code;
	private String description;

	private Authorities(Integer code, String description) {
		this.code = code;
		this.description = description;
	}

	public static Authorities getAuthorities(Integer code) {
		return Arrays.asList(Authorities.values()).stream().filter(s -> s.getCode().equals(code)).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("Erro, A Autoridade nao foi encontrada!"));
	}

	public Integer getCode() {
		return code;
	}

	public void setCode(Integer code) {
		this.code = code;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
