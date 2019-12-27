package com.stackoverflow.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stackoverflow.models.User;
import com.stackoverflow.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User registerUser(User user) {

		return userRepository.save(user);
	}

	@Override
	public User editUserProfile(User user) {
		return userRepository.save(user);
	}

	@Override
	public User login(String username, String password) {

		User retUser = userRepository.findByUsernameAndPassword(username, password);
		if (retUser == null)
			return null;

		else
			return retUser;

	}

	@Override
	public User findUserByUsername(String username) {

		return userRepository.findByUsername(username);
	}

}
