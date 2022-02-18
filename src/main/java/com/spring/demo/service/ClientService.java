package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.demo.model.Admin;
import com.spring.demo.model.Client;

public interface ClientService {
	public void createClient(List<Client> client);
	public void createClient(Client client);

    public Iterable<Client> getAllClient();
	public Optional<Client> findClientById(int id);
	public void deleteClientById(int id);
	public Client updateClient(Client client);
	public void deleteAllClient();

}
