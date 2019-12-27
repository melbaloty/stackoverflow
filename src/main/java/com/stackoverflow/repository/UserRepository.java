package com.stackoverflow.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stackoverflow.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

	public User findByUsernameAndPassword(String username, String password);

	public User findByUsername(String username);

}
