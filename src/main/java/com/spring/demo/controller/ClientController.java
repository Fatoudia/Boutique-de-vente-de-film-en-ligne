package com.spring.demo.controller;

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
import com.spring.demo.model.Categorie;
import com.spring.demo.model.Client;
import com.spring.demo.service.AdminService;
import com.spring.demo.service.CategorieService;
import com.spring.demo.service.ClientService;

@RestController
@RequestMapping("/client")
public class ClientController {
	
	@Autowired
	private ClientService clientService;
	
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
	public Iterable<Client> findAllClient(){
		System.out.println("testte getAllClient" + clientService.getAllClient());
		logger.debug("Getting all client.");
		return clientService.getAllClient();
			
	}
	
	@PostMapping("/add")
	public void insertClient(@RequestBody Client client) {
		System.out.println("test insert");
		this.clientService.createClient(client);
	}
	
	
	@DeleteMapping
	public void insertAllClient(@RequestBody Client client) {
		this.clientService.deleteAllClient();
	}
	
	@GetMapping("client/{id}")
	public Optional<Client> findClientById(@PathVariable int id){
		return this.clientService.findClientById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<Client> updateClient(@RequestBody Client client) {
		Client updateClient = this.clientService.updateClient(client);
        return new ResponseEntity<>(updateClient, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteClient(@PathVariable int id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.clientService.deleteClientById(id);
	}
}
