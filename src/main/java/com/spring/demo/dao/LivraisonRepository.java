package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Livraison;

@Repository
public interface LivraisonRepository extends JpaRepository<Livraison, Integer> {

}
