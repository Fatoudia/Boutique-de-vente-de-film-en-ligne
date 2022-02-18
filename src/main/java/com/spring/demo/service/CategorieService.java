package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.demo.model.Admin;
import com.spring.demo.model.Categorie;

public interface CategorieService {
	public void createCategorie(List<Categorie> categorie);
	public void createCategorie(Categorie categorie);

    public Iterable<Categorie> getAllCategorie();
	public Optional<Categorie> findCategorieById(int id);
	public void deleteCategorieById(int id);
	public Categorie updateCategorie(Categorie categorie);
	public void deleteAllCategorie();

}
