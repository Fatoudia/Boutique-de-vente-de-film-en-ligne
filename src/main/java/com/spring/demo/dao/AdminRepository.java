package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.spring.demo.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
	

}
