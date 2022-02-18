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

import com.spring.demo.security.User;
import com.spring.demo.service.UserService;



@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/resource")
	public Map<String,Object> home() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("id", UUID.randomUUID().toString());
	    model.put("content", "Hello World");
	    return model;
	  }

	
	@GetMapping("/all")
//	@ResponseStatus(HttpStatus.OK)
	public Iterable<User> findAllUser(){
		System.out.println("testte getAllAdmin" + userService.getAllUser());
		logger.debug("Getting all gymnases.");
		return userService.getAllUser();
			
	}
	
	@PostMapping("/add")
	public void insertGymnase(@RequestBody User user) {
		System.out.println("test insert");
		this.userService.createUser(user);
	}
	
	
	@DeleteMapping
	public void insertAllUser(@RequestBody User user) {
		this.userService.deleteAllUser();
	}
	
	@GetMapping("user/{id}")
	public Optional<User> findUserById(@PathVariable int id){
		return this.userService.findUserById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<User> updateUser(@RequestBody User user) {
		User updateUser = this.userService.updateUser(user);
        return new ResponseEntity<>(updateUser, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteUser(@PathVariable int id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.userService.deleteUserById(id);
	}
}
