package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.CategorieRepository;
import com.spring.demo.model.Admin;
import com.spring.demo.model.Categorie;

@Service
public class CategorieServiceImpl implements CategorieService {
	
	private CategorieRepository categorieRepository;

	@Autowired
	public CategorieServiceImpl(CategorieRepository categorieRepository) {
		super();
		this.categorieRepository = categorieRepository;
	}

	@Override
	public void createCategorie(List<Categorie> categorie) {
		
		categorieRepository.saveAll(categorie);
	}

	@Override
	public void createCategorie(Categorie categorie) {

		categorieRepository.save(categorie);
	}

	@Override
	public Iterable<Categorie> getAllCategorie() {
		return categorieRepository.findAll();
	}

	@Override
	public Optional<Categorie> findCategorieById(int id) {

		return categorieRepository.findById(id);
	}

	@Override
	public void deleteCategorieById(int id) {

		categorieRepository.deleteById(id);
	}

	@Override
	public Categorie updateCategorie(Categorie categorie) {
		
		return categorieRepository.save(categorie);
	}

	@Override
	public void deleteAllCategorie() {

		categorieRepository.deleteAll();
	}

}
