package com.spring.demo.service;

import java.util.List;
import java.util.Optional;


import com.spring.demo.model.Commande;

public interface CommandeService {
	public void createCommande(List<Commande> commande);
	public void createCommande(Commande commande);

    public Iterable<Commande> getAllCommande();
	public Optional<Commande> findCommandeById(int id);
	public void deleteCommandeById(int id);
	public Commande updateCommande(Commande commande);
	public void deleteAllCommande();

}
