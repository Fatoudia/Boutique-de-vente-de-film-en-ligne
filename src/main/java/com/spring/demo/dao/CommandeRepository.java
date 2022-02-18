package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Commande;

@Repository
public interface CommandeRepository extends JpaRepository<Commande, Integer> {

}
