package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.CommandeRepository;
import com.spring.demo.dao.DetailsCommandeRepository;
import com.spring.demo.model.Commande;
import com.spring.demo.model.DetailsCommande;

@Service
public class DetailsCommandeServiceImpl implements DetailsCommandeService {
	
	private DetailsCommandeRepository detailsCommandeRepository;

	@Autowired
	public DetailsCommandeServiceImpl(DetailsCommandeRepository detailsCommandeRepository) {
		super();
		this.detailsCommandeRepository = detailsCommandeRepository;
	}

	

	@Override
	public void createDetailsCommande(List<DetailsCommande> detailscommande) {
		detailsCommandeRepository.saveAll(detailscommande);
		
	}

	@Override
	public void createDetailsCommande(DetailsCommande detailsCommande) {
		detailsCommandeRepository.save(detailsCommande);
	}

	@Override
	public Iterable<DetailsCommande> getAllDetailsCommande() {

		return detailsCommandeRepository.findAll();
	}

	@Override
	public Optional<DetailsCommande> findDetailsCommandeById(int id) {

		return detailsCommandeRepository.findById(id);
	}

	@Override
	public void deleteDetailsCommandeById(int id) {

		detailsCommandeRepository.deleteById(id);
	}

	@Override
	public DetailsCommande updateDetailsCommande(DetailsCommande detailsCommande) {
		return detailsCommandeRepository.save(detailsCommande);
	}

	@Override
	public void deleteAllDetailsCommande() {


		detailsCommandeRepository.deleteAll();
	}

}
