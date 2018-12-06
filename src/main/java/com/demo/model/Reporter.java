package com.demo.model;

import java.util.List;

import javax.persistence.Entity;

@Entity
public class Reporter extends User {
	private String writerType;
	
	public Reporter() {}
	public Reporter(String username, String password, List<Role> roles, String writerType) {
		super(username, password, roles);
		this.writerType = writerType;
	}

	public String getWriterType() {
		return writerType;
	}

	public void setWriterType(String writerType) {
		this.writerType = writerType;
	}
	
	
}
