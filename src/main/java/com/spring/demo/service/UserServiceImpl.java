package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.AdminRepository;
import com.spring.demo.dao.UserRepository;
import com.spring.demo.model.Admin;
import com.spring.demo.security.User;

@Service
public class UserServiceImpl implements UserService {

	private UserRepository userRepository;
	
	
	@Autowired
	public UserServiceImpl(UserRepository userRepository) {
		super();
		this.userRepository = userRepository;
	}

	@Override
	public void createUser(List<User> user) {
		
		userRepository.saveAll(user);
	}

	@Override
	public void createUser(User user) {
		userRepository.save(user);
	}

	@Override
	public Iterable<User> getAllUser() {
		return userRepository.findAll();
	}

	@Override
	public Optional<User> findUserById(int id) {
		return userRepository.findById(id);
	}

	@Override
	public void deleteUserById(int id) {
			
		userRepository.deleteById(id);
	}

	@Override
	public User updateUser(User user) {
		return userRepository.save(user);
	}

	@Override
	public void deleteAllUser() {

		userRepository.deleteAll();
	}




	
	

	

	
	
}
