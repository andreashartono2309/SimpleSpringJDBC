package com.icecube.springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.icecube.springmvc.dao.UserDAO;

@Controller
public class LoginController {
	
	@Autowired	
	private UserDAO userDAO;

	@RequestMapping(value = "/login", method=RequestMethod.GET)
	public String showLoginPage() {
		//System.out.println("Get this method");
		return "login";
	}
	
	@RequestMapping(value = "/login", method=RequestMethod.POST)
	public String validateLogin(ModelMap model, @RequestParam String name,
			@RequestParam String password) {
		model.put("name", name);
		model.put("password", password);
	//	User user = new User();
//		user.setUserPassword(name,password);
		if (!userDAO.validateUser(name, password)){
			model.put("errorMessage", "User and Password is not match");
			return "login";
		}	
		return "userwelcome";
	}	

}
