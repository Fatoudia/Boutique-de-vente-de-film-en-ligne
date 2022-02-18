package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
