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
import com.spring.demo.service.AdminService;
import com.spring.demo.service.CategorieService;

@RestController
//@RequestMapping("/categorie")
public class CategorieController {
	
	@Autowired
	private CategorieService categorieService;
	
	private final Logger logger = LoggerFactory.getLogger(this.getClass());
	
	@GetMapping("/resource")
	public Map<String,Object> home() {
	    Map<String,Object> model = new HashMap<String,Object>();
	    model.put("id", UUID.randomUUID().toString());
	    model.put("content", "Hello World");
	    return model;
	  }

	
	@RequestMapping("/test")
//	@ResponseStatus(HttpStatus.OK)
	public Iterable<Categorie> findAllCategorie(){
		System.out.println("testte getAllAdmin" + categorieService.getAllCategorie());
		logger.debug("Getting all gymnases.");
		return categorieService.getAllCategorie();
			
	}
	
	@PostMapping("/add")
	public void insertCategorie(@RequestBody Categorie categorie) {
		System.out.println("test insert");
		this.categorieService.createCategorie(categorie);
	}
	
	
	@DeleteMapping
	public void insertAllCategorie(@RequestBody Categorie categorie) {
		this.categorieService.deleteAllCategorie();
	}
	
	@GetMapping("categorie/{id}")
	public Optional<Categorie> findCategorieById(@PathVariable int id){
		return this.categorieService.findCategorieById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<Categorie> updateCategorie(@RequestBody Categorie categorie) {
		Categorie updateCtegorie = this.categorieService.updateCategorie(categorie);
        return new ResponseEntity<>(updateCtegorie, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteCategorie(@PathVariable int id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.categorieService.deleteCategorieById(id);
	}
}
