package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.demo.model.Admin;

public interface AdminService {
	public void createAdmin(List<Admin> admin);
	public void createAdmin(Admin admin);

    public Iterable<Admin> getAllAdmin();
	public Optional<Admin> findAdminById(int id);
	public void deleteAdminById(int id);
	public Admin updateAdmin(Admin admin);
	public void deleteAllAdmin();

}
