package com.example.tournament.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdminModel {


	@JsonProperty("password")
	public String password;
	@JsonProperty("username")
	public String username;

	public String getPassword() {
		return password;
	}

	public String getUsername() {
		return username;
	}

}
