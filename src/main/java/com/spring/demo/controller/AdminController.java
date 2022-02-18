package com.spring.demo.controller;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.demo.model.Admin;
import com.spring.demo.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	private AdminService adminService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/resource")
	public Map<String,Object> home() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("id", UUID.randomUUID().toString());
	    model.put("content", "Hello World");
	    return model;
	  }

	
	@GetMapping
//	@ResponseStatus(HttpStatus.OK)
	public Iterable<Admin> findAllAdmin(){
		System.out.println("testte getAllAdmin" + adminService.getAllAdmin());
		logger.debug("Getting all gymnases.");
		return adminService.getAllAdmin();
			
	}
	
	@PostMapping("/add")
	public void insertAdmin(@RequestBody Admin admin) {
		System.out.println("test insert");
		this.adminService.createAdmin(admin);
	}
	
	
	@DeleteMapping
	public void insertAllAdmin(@RequestBody Admin admin) {
		this.adminService.deleteAllAdmin();
	}
	
	@GetMapping("gym/{id}")
	public Optional<Admin> findAdminById(@PathVariable int id){
		return this.adminService.findAdminById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<Admin> updateAdmin(@RequestBody Admin admin) {
		Admin updateAdmin = this.adminService.updateAdmin(admin);
        return new ResponseEntity<>(updateAdmin, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteGymnase(@PathVariable int id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.adminService.deleteAdminById(id);
	}
}
