package com.jdbc.entity;

public class User {
	
	int id;
	String username;
	String password;
	
	public User(int id, String username, String password) {
		this.id = id;
		this.username = username;
		this.password = password;
	}
	
	public int getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getUsername() {
		return username;
	}

}
