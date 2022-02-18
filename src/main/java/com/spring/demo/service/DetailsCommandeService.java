package com.spring.demo.service;

import java.util.List;
import java.util.Optional;


import com.spring.demo.model.DetailsCommande;

public interface DetailsCommandeService {
	public void createDetailsCommande(List<DetailsCommande> detailsCommande);
	public void createDetailsCommande(DetailsCommande detailsCommande);

    public Iterable<DetailsCommande> getAllDetailsCommande();
	public Optional<DetailsCommande> findDetailsCommandeById(int id);
	public void deleteDetailsCommandeById(int id);
	public DetailsCommande updateDetailsCommande(DetailsCommande detailsCommande);
	public void deleteAllDetailsCommande();

}
