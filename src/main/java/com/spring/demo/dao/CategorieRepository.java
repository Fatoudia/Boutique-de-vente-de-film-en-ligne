package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Categorie;

@Repository
public interface CategorieRepository extends JpaRepository<Categorie, Integer> {

}
