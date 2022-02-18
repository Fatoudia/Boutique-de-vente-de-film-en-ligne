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

import com.spring.demo.dao.ArticleRepository;
import com.spring.demo.model.Admin;
import com.spring.demo.model.Article;
import com.spring.demo.service.ArticleService;

@RestController
@RequestMapping("/article")
public class ArticleController {
	
	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private ArticleRepository articledao;
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
	public Iterable<Article> findAllArticle(){
		System.out.println("testte getAllAdmin" + articleService.getAllArticle());
		logger.debug("Getting all gymnases.");
		return articleService.getAllArticle();
			
	}
	
	@PostMapping("/add")
	public void insertArticle(@RequestBody Article article) {
		System.out.println("test insert");
		this.articleService.createArticle(article);
	}
	
	
	@DeleteMapping
	public void insertAllAdmin(@RequestBody Article article) {
		this.articleService.deleteAllArticle();
	}
	
	@GetMapping("gym/{id}")
	public Optional<Article> findArticleById(@PathVariable int id){
		return this.articleService.findArticleById(id);
	}
	
	
	@PutMapping("/update")
	 public ResponseEntity<Article> updateArticle(@RequestBody Article article) {
		Article updateArticle = this.articleService.updateArticle(article);
        return new ResponseEntity<>(updateArticle, HttpStatus.OK);
    }
	
	

	@DeleteMapping("delete/{id}")
	public void deleteGymnase(@PathVariable int id) {
		
		System.out.println("Je l'id" + id + "est supprimer avec success");
		
		this.articleService.findArticleById(id);
	}
}
