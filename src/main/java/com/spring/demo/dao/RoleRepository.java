package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.demo.security.Role;

public interface RoleRepository extends JpaRepository<Role, Long>{ 
} 
