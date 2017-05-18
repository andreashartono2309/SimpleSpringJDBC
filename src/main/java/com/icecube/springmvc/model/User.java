package com.icecube.springmvc.model;

import org.springframework.stereotype.Service;

@Service
public class User {
	
	private String username;
	private String password;
	private String description;
	private String usergroup;
	
	 public User() {
		 
	    }
	 
	    public User( String username, String password, String description, String usergroup) {
	    	this.username = username;
			this.password = password;
			this.description = description;
			this.usergroup = description;
	    }
	    
	
	public User setUserPassword(String username,String password) {
		this.username = username;
		this.password = password;
		return this;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUsergroup() {
		return usergroup;
	}
	public void setUsergroup(String usergroup) {
		this.usergroup = usergroup;
	}
	
	

}
