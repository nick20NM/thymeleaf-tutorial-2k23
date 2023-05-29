package com.alpha.thymeleaf.model;

public class User {

	private long id;
	private String name;
	private String email;
	private String role;
	private String gender;
	
	public User(long id, String name, String email, String role, String gender) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.gender = gender;
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getRole() {
		return role;
	}

	public String getGender() {
		return gender;
	}
	
	
	
	
	
}
