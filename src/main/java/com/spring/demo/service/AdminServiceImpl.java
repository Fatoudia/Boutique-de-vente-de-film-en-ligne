package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.AdminRepository;
import com.spring.demo.model.Admin;

@Service
public class AdminServiceImpl implements AdminService {

	private AdminRepository adminDao;
	
	
	@Autowired
	public AdminServiceImpl(AdminRepository adminDao) {
		super();
		this.adminDao = adminDao;
	}

	@Override
	public void createAdmin(List<Admin> admin) {
		
		adminDao.saveAll(admin);
	}

	@Override
	public void createAdmin(Admin admin) {
		adminDao.save(admin);
	}

	@Override
	public Iterable<Admin> getAllAdmin() {
		return adminDao.findAll();
	}

	@Override
	public Optional<Admin> findAdminById(int id) {
		return adminDao.findById(id);
	}

	@Override
	public void deleteAdminById(int id) {
			
		adminDao.deleteById(id);
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return adminDao.save(admin);
	}

	@Override
	public void deleteAllAdmin() {

		adminDao.deleteAll();
	}

	
}
