package com.spring.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ArticleCommandePK implements  Serializable{
	private static final long serialVersionUID = 1L;

	@Column(name="id_article")
	private int idArticle;

	@Column(name="id_commande")
	private int idCommande;
	
	

	public ArticleCommandePK() {
		super();
	}

	public ArticleCommandePK(int idArticle, int idCommande) {
		super();
		this.idArticle = idArticle;
		this.idCommande = idCommande;
	}

	public int getIdArticle() {
		return idArticle;
	}

	public void setIdArticle(int idArticle) {
		this.idArticle = idArticle;
	}

	public int getIdCommande() {
		return idCommande;
	}

	public void setIdCommande(int idCommande) {
		this.idCommande = idCommande;
	}

	@Override
	public String toString() {
		return "ArticleCommandePK [idArticle=" + idArticle + ", idCommande=" + idCommande + "]";
	}

	
	
}
