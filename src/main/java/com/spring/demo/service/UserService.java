package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import com.spring.demo.security.User;



public interface UserService {
	public void createUser(List<com.spring.demo.security.User> users);
	public void createUser(User user);

    public Iterable<User> getAllUser();
	public Optional<User> findUserById(int id);
	public void deleteUserById(int id);
	public User updateUser(User user);
	public void deleteAllUser();

}
