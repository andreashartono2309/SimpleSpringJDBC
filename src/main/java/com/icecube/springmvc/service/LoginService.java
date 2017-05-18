package com.icecube.springmvc.service;

import org.springframework.stereotype.Service;


@Service
public class LoginService { 
		
	public boolean validateLogin(String name, String password){
		return name.equalsIgnoreCase("username")&&password.equalsIgnoreCase("password");
		//return JDBCUserDAO.validateUser(user);
	}

}
