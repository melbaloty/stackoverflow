package com.stackoverflow.service;

import com.stackoverflow.models.User;

public interface UserService {

	public User registerUser(User user);

	public User editUserProfile(User user);

	public User login(String username, String password);

}
