package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.DetailsCommande;

@Repository
public interface DetailsCommandeRepository extends JpaRepository<DetailsCommande, Integer> {

}
