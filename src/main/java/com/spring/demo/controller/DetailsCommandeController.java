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
import com.spring.demo.model.DetailsCommande;
import com.spring.demo.service.CommandeService;
import com.spring.demo.service.DetailsCommandeService;

@RestController
@RequestMapping("/detailscommande")
public class DetailsCommandeController {
	
	@Autowired
	private DetailsCommandeService detailsCommandeService;
	
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
	public Iterable<DetailsCommande> findAllDetailsCommande(){
		System.out.println("testte getAllCommande" + detailsCommandeService.getAllDetailsCommande());
		logger.debug("Getting all client.");
		return detailsCommandeService.getAllDetailsCommande();
			
	}
	
	@PostMapping("/add")
	public void insertCommande(@RequestBody DetailsCommande detailsCommande) {
		System.out.println("test insert");
		this.detailsCommandeService.createDetailsCommande(detailsCommande);
	}
	
	
	@DeleteMapping
	public void insertAllDetailsCommande(@RequestBody DetailsCommande detailsCommande) {
		this.detailsCommandeService.deleteAllDetailsCommande();
	}
	
	@GetMapping("commande/{id}")
	public Optional<DetailsCommande> findDetailsCommandeById(@PathVariable int id){
		return this.detailsCommandeService.findDetailsCommandeById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<DetailsCommande> updateDetailsCommande(@RequestBody DetailsCommande detailsCommande) {
		DetailsCommande updateDetailsCommande = this.detailsCommandeService.updateDetailsCommande(detailsCommande);
        return new ResponseEntity<>(updateDetailsCommande, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteDetailsCommande(@PathVariable int id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.detailsCommandeService.deleteDetailsCommandeById(id);
	}
}
