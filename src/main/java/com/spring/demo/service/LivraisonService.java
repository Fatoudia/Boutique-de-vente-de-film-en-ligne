package com.spring.demo.service;

import java.util.List;
import java.util.Optional;


import com.spring.demo.model.Livraison;

public interface LivraisonService {
	public void createLivraison(List<Livraison> livraison);
	public void createLivraison(Livraison livraison);

    public Iterable<Livraison> getAllLivraison();
	public Optional<Livraison> findLivraisonById(int id);
	public void deleteLivraisonById(int id);
	public Livraison updateLivraison(Livraison livraison);
	public void deleteAllLivraison();

}
