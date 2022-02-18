package com.spring.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.demo.dao.ArticleRepository;
import com.spring.demo.model.Article;

@Service
public class ArticleServiceImpl implements ArticleService {
	
	@Autowired
	private ArticleRepository articleDao;
	
	
//	public ArticleServiceImpl(ArticleRepository articleDao) {
//		super();
//		this.articleDao = articleDao;
//	}

	@Override
	public void createArticle(List<Article> article) {
		
		articleDao.saveAll(article);
	}

	@Override
	public void createArticle(Article article) {
		articleDao.save(article);
	}

	@Override
	public Iterable<Article> getAllArticle() {
		return articleDao.findAll();
	}

	@Override
	public Optional<Article> findArticleById(int id) {
		return articleDao.findById(id);
	}

	@Override
	public void deleteArticleById(int id) {
			
		articleDao.deleteById(id);
	}

	@Override
	public Article updateArticle(Article article) {
		return articleDao.save(article);
	}

	@Override
	public void deleteAllArticle() {

		articleDao.deleteAll();
	}

	

	

	
}
