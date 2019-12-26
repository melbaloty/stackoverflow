package com.stackoverflow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.stackoverflow.models.User;
import com.stackoverflow.service.UserService;

@RestController
@RequestMapping(value = "/User")
public class UserController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/register", method = RequestMethod.POST)
	public User register(@RequestBody User user) {

		return userService.registerUser(user);
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User login(@RequestParam("username") String username, @RequestParam("password") String password) {

		return userService.login(username, password);
	}

}
