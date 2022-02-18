package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.spring.demo.model.Admin;
import com.spring.demo.model.Article;

@Service
public interface ArticleService {
	public void createArticle(List<Article> article);
	public void createArticle(Article article);

    public Iterable<Article> getAllArticle();
	public Optional<Article> findArticleById(int id);
	public void deleteArticleById(int id);
	public Article updateArticle(Article article);
	public void deleteAllArticle();

}
