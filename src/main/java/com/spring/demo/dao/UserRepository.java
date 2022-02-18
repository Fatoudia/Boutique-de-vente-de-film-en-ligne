package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.security.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public com.spring.demo.security.User findByUserName(String username);

}
