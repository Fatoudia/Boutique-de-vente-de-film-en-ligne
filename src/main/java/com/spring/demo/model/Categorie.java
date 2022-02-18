package com.spring.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Generated;

@Entity
public class Categorie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column(name="libelle")
	private String libelle;
	@OneToOne
	@JoinColumn(name = "id_article")
	private Article article;
	
	
	public Categorie() {
		super();
	}
	public Categorie(int id, String libelle, Article article) {
		super();
		this.id = id;
		this.libelle = libelle;
		this.article = article;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Article getArticle() {
		return article;
	}
	public void setArticle(Article article) {
		this.article = article;
	}
	@Override
	public String toString() {
		return "Categoterie [id=" + id + ", libelle=" + libelle + ", article=" + article + "]";
	}

	
	
}
