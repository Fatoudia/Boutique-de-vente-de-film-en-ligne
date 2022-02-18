package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.CategorieRepository;
import com.spring.demo.dao.ClientRepository;
import com.spring.demo.model.Admin;
import com.spring.demo.model.Categorie;
import com.spring.demo.model.Client;

@Service
public class ClientServiceImpl implements ClientService {
	
	private ClientRepository clientRepository;

	@Autowired
	public ClientServiceImpl(ClientRepository clientRepository) {
		super();
		this.clientRepository = clientRepository;
	}

	

	@Override
	public void createClient(List<Client> client) {
		clientRepository.saveAll(client);
		
	}

	@Override
	public void createClient(Client client) {
		clientRepository.save(client);
	}

	@Override
	public Iterable<Client> getAllClient() {

		return clientRepository.findAll();
	}

	@Override
	public Optional<Client> findClientById(int id) {

		return clientRepository.findById(id);
	}

	@Override
	public void deleteClientById(int id) {

		clientRepository.deleteById(id);
	}

	@Override
	public Client updateClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void deleteAllClient() {


		clientRepository.deleteAll();
	}

}
