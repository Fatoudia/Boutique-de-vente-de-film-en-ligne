package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.CategorieRepository;
import com.spring.demo.dao.ClientRepository;
import com.spring.demo.dao.CommandeRepository;
import com.spring.demo.model.Admin;
import com.spring.demo.model.Categorie;
import com.spring.demo.model.Client;
import com.spring.demo.model.Commande;

@Service
public class CommandeServiceImpl implements CommandeService {
	
	private CommandeRepository commandeRepository;

	@Autowired
	public CommandeServiceImpl(CommandeRepository commandeRepository) {
		super();
		this.commandeRepository = commandeRepository;
	}

	

	@Override
	public void createCommande(List<Commande> commandes) {
		commandeRepository.saveAll(commandes);
		
	}

	@Override
	public void createCommande(Commande commande) {
		commandeRepository.save(commande);
	}

	@Override
	public Iterable<Commande> getAllCommande() {

		return commandeRepository.findAll();
	}

	@Override
	public Optional<Commande> findCommandeById(int id) {

		return commandeRepository.findById(id);
	}

	@Override
	public void deleteCommandeById(int id) {

		commandeRepository.deleteById(id);
	}

	@Override
	public Commande updateCommande(Commande commande) {
		return commandeRepository.save(commande);
	}

	@Override
	public void deleteAllCommande() {


		commandeRepository.deleteAll();
	}

}
