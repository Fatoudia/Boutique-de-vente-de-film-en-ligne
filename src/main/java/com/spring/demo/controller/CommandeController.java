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

import com.spring.demo.model.Commande;
import com.spring.demo.service.CommandeService;

@RestController
@RequestMapping("/commande")
public class CommandeController {
	
	@Autowired
	private CommandeService commandeService;
	
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
	public Iterable<Commande> findAllCommande(){
		System.out.println("testte getAllCommande" + commandeService.getAllCommande());
		logger.debug("Getting all client.");
		return commandeService.getAllCommande();
			
	}
	
	@PostMapping("/add")
	public void insertCommande(@RequestBody Commande commande) {
		System.out.println("test insert");
		this.commandeService.createCommande(commande);
	}
	
	
	@DeleteMapping
	public void insertAllCommande(@RequestBody Commande commande) {
		this.commandeService.deleteAllCommande();
	}
	
	@GetMapping("commande/{id}")
	public Optional<Commande> findCommandeById(@PathVariable int id){
		return this.commandeService.findCommandeById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<Commande> updateCommande(@RequestBody Commande commande) {
		Commande updateCommande = this.commandeService.updateCommande(commande);
        return new ResponseEntity<>(updateCommande, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteCommande(@PathVariable int id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.commandeService.deleteCommandeById(id);
	}
}
