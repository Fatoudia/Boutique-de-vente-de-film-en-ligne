package com.spring.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.demo.model.Article;

@Repository
public interface ArticleRepository extends CrudRepository<Article, Integer> {

}
