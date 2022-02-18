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

import com.spring.demo.model.Livraison;
import com.spring.demo.service.LivraisonService;

@RestController
@RequestMapping("/livraison")
public class LivraisoController {
	
	@Autowired
	private LivraisonService livraisonService;
	
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
	public Iterable<Livraison> findAllLivraison(){
		System.out.println("testte getAllCommande" + livraisonService.getAllLivraison());
		logger.debug("Getting all client.");
		return livraisonService.getAllLivraison();
			
	}
	
	@PostMapping("/add")
	public void insertLivraison(@RequestBody Livraison livraison) {
		System.out.println("test insert");
		this.livraisonService.createLivraison(livraison);
	}
	
	
	@DeleteMapping
	public void insertAllLivraison(@RequestBody Livraison livraison) {
		this.livraisonService.deleteAllLivraison();
	}
	
	@GetMapping("commande/{id}")
	public Optional<Livraison> findLivraisonById(@PathVariable int id){
		return this.livraisonService.findLivraisonById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<Livraison> updateLivraison(@RequestBody Livraison livraison) {
		Livraison updateLivraison = this.livraisonService.updateLivraison(livraison);
        return new ResponseEntity<>(updateLivraison, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteLivraison(@PathVariable int id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.livraisonService.deleteLivraisonById(id);
	}
}
