package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.LivraisonRepository;
import com.spring.demo.model.Livraison;

@Service
public class LivraisonServiceImpl implements LivraisonService {
	
	private LivraisonRepository livraisonRepository;

	@Autowired
	public LivraisonServiceImpl(LivraisonRepository livraisonRepository) {
		super();
		this.livraisonRepository = livraisonRepository;
	}

	

	@Override
	public void createLivraison(List<Livraison> livraison) {
		livraisonRepository.saveAll(livraison);
		
	}

	@Override
	public void createLivraison(Livraison livraison) {
		livraisonRepository.save(livraison);
	}

	@Override
	public Iterable<Livraison> getAllLivraison() {

		return livraisonRepository.findAll();
	}

	@Override
	public Optional<Livraison> findLivraisonById(int id) {

		return livraisonRepository.findById(id);
	}

	@Override
	public void deleteLivraisonById(int id) {

		livraisonRepository.deleteById(id);
	}

	@Override
	public Livraison updateLivraison(Livraison livraison) {
		return livraisonRepository.save(livraison);
	}

	@Override
	public void deleteAllLivraison() {


		livraisonRepository.deleteAll();
	}



	
	

}
